const fs = require('fs');
const antlr4 = require('antlr4');
const VueloLexer = require('./generated/VueloLexer').default || require('./generated/VueloLexer');
const VueloParser = require('./generated/VueloParser').default || require('./generated/VueloParser');

// 1. Leer el archivo de texto
const input = fs.readFileSync('input.txt', 'utf8');

// Esta lista guardará TODOS los errores (Léxicos y Sintácticos)
const errores = [];

// 2. Creamos un Escudo Universal a prueba de fallos
const CustomErrorListener = new antlr4.ErrorListener();
CustomErrorListener.syntaxError = function(recognizer, offendingSymbol, line, column, msg, e) {
    errores.push(`[Error en Línea ${line}:${column}] -> Causa: ${msg}`);
};

// 3. Análisis Léxico (Extraer Tokens)
const chars = new antlr4.InputStream(input);
const lexer = new VueloLexer(chars);

// ¡ATENCIÓN! Le quitamos el comportamiento por defecto y le ponemos nuestro escudo al LEXER
lexer.removeErrorListeners();
lexer.addErrorListener(CustomErrorListener);

const tokens = new antlr4.CommonTokenStream(lexer);

// 4. Análisis Sintáctico (Construir el Árbol)
const parser = new VueloParser(tokens);

// Le quitamos el comportamiento por defecto y le ponemos nuestro escudo al PARSER
parser.removeErrorListeners();
parser.addErrorListener(CustomErrorListener);

// Ejecutamos el análisis
const tree = parser.prog();

// 5. Evaluar Resultados
if (errores.length > 0) {
    console.log("=========================================");
    console.log(" ❌ ENTRADA INVÁLIDA: SE ENCONTRARON ERRORES ");
    console.log("=========================================");
    // Imprimimos la lista de errores atrapados
    errores.forEach(err => console.log(err));
} else {
    console.log("=========================================");
    console.log(" ✅ ENTRADA VÁLIDA: ANÁLISIS EXITOSO ");
    console.log("=========================================");

    // --- TABLA DE LEXEMAS Y TOKENS ---
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

    // --- ÁRBOL SINTÁCTICO ---
    console.log("\n=========================================");
    console.log("        ÁRBOL SINTÁCTICO (TEXTO)         ");
    console.log("=========================================");
    const treeText = tree.toStringTree(parser.ruleNames, parser);
    console.log(treeText);
    console.log("\n");
}