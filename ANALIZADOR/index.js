const fs = require('fs');
const antlr4 = require('antlr4');

// --- 1. IMPORTACIONES A PRUEBA DE FALLOS ---
const lexerModule = require('./generated/VueloLexer');
const VueloLexer = lexerModule.VueloLexer || lexerModule.default || lexerModule;

const parserModule = require('./generated/VueloParser');
const VueloParser = parserModule.VueloParser || parserModule.default || parserModule;

// --- 2. CONFIGURACIÓN DE ERRORES (CLASES ESTRICTAS) ---
const input = fs.readFileSync('input.txt', 'utf8');
const errores = [];

// Clase obligatoria para atrapar Errores Léxicos
class CustomLexerErrorListener extends antlr4.ErrorListener {
    syntaxError(recognizer, offendingSymbol, line, column, msg, e) {
        errores.push(`[Error Léxico] Línea ${line}:${column} -> Causa: ${msg}`);
    }
}

// Clase obligatoria para atrapar Errores Sintácticos
class CustomParserErrorListener extends antlr4.ErrorListener {
    syntaxError(recognizer, offendingSymbol, line, column, msg, e) {
        errores.push(`[Error Sintáctico] Línea ${line}:${column} -> Causa: ${msg}`);
    }
}

// --- 3. ANÁLISIS LÉXICO Y SINTÁCTICO ---
const chars = new antlr4.InputStream(input);
const lexer = new VueloLexer(chars);

// Quitamos mensajes por defecto y conectamos nuestro ESCUDO LÉXICO
lexer.removeErrorListeners();
lexer.addErrorListener(new CustomLexerErrorListener()); 

const tokens = new antlr4.CommonTokenStream(lexer);
const parser = new VueloParser(tokens);

// Quitamos mensajes por defecto y conectamos nuestro ESCUDO SINTÁCTICO
parser.removeErrorListeners();
parser.addErrorListener(new CustomParserErrorListener()); 

const tree = parser.prog();

// --- 4. EVALUACIÓN Y RESULTADOS ---
if (errores.length > 0) {
    console.log("=========================================");
    console.log(" ❌ ENTRADA INVÁLIDA: SE ENCONTRARON ERRORES ");
    console.log("=========================================");
    errores.forEach(err => console.log(err));
} else {
    console.log("=========================================");
    console.log(" ✅ ENTRADA VÁLIDA: ANÁLISIS EXITOSO ");
    console.log("=========================================");

    console.log("\n=========================================");
    console.log("       TABLA DE LEXEMAS Y TOKENS         ");
    console.log("=========================================");
    console.log(String("LEXEMA").padEnd(20) + "| " + "TOKEN");
    console.log("-----------------------------------------");
    
    tokens.fill();
    tokens.tokens.forEach(token => {
        if (token.type !== antlr4.Token.EOF) {
            let tokenName = VueloLexer.symbolicNames[token.type] || VueloLexer.literalNames[token.type] || "LITERAL";
            const lexema = token.text;
            console.log(String(lexema).padEnd(20) + "| " + tokenName);
        }
    });

    console.log("\n=========================================");
    console.log("        ÁRBOL SINTÁCTICO (TEXTO)         ");
    console.log("=========================================");
    const treeText = tree.toStringTree(parser.ruleNames, parser);
    console.log(treeText);
    
    // --- 5. TRADUCCIÓN E INTÉRPRETE (EXTRACCIÓN DIRECTA INFALIBLE) ---
    console.log("\n=========================================");
    console.log(" 🚀 TRADUCCIÓN A JAVASCRIPT E INTÉRPRETE ");
    console.log("=========================================");
    
    let codigoGenerado = "";

    // Buscamos los datos directamente en el árbol en lugar de usar el Visitor problemático
    if (tree.children) {
        tree.children.forEach(ctx => {
            // Si el nodo de esta rama tiene CODIGO_VUELO, sabemos que es un vuelo válido
            if (ctx.CODIGO_VUELO) {
                const codigo = ctx.CODIGO_VUELO().getText();
                
                let origen = "";
                let destino = "";
                
                // Adaptamos la búsqueda según cómo hayas definido los aeropuertos en .g4
                if (ctx.origen && ctx.destino) {
                    origen = ctx.origen.text;
                    destino = ctx.destino.text;
                } else if (ctx.AEROPUERTO) {
                    const aeropuertos = ctx.AEROPUERTO();
                    origen = aeropuertos[0] ? aeropuertos[0].getText() : "";
                    destino = aeropuertos[1] ? aeropuertos[1].getText() : "";
                }

                const hora = ctx.HORA ? ctx.HORA().getText() : "";
                const estado = ctx.ESTADO ? ctx.ESTADO().getText() : "";
                const puerta = ctx.PUERTA ? ctx.PUERTA().getText() : "";

                // Escribimos el JavaScript
                codigoGenerado += `{
  const flight = {
    code: "${codigo}",
    from: "${origen}",
    to: "${destino}",
    time: "${hora}",
    status: "${estado}",
    gate: "${puerta}"
  };
  console.log(" -> Vuelo interpretado exitosamente en memoria:", flight);
}\n\n`;
            }
        });
    }
    
    console.log("--- CÓDIGO GENERADO ---");
    if (codigoGenerado.trim() === "") {
        console.log("// Error: No se encontraron vuelos en el árbol para traducir.");
    } else {
        console.log(codigoGenerado);
    }
    
    console.log("--- EJECUCIÓN (INTÉRPRETE) ---");
    try {
        if (codigoGenerado.trim() !== "") {
            eval(codigoGenerado);
        }
    } catch (e) {
        console.log("Error durante la interpretación:", e);
    }
    
    console.log("\n");
}