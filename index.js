const fs = require('fs');
const antlr4 = require('antlr4');
const VueloLexer = require('./generated/VueloLexer').default || require('./generated/VueloLexer');

// 1. Leer el archivo input.txt
const input = fs.readFileSync('input.txt', 'utf8');

// 2. Crear el InputStream y pasarlo al Lexer
const chars = new antlr4.InputStream(input);
const lexer = new VueloLexer(chars);

// 3. Obtener el flujo de tokens
const tokens = new antlr4.CommonTokenStream(lexer);

// Forzar al Lexer a leer todo el texto para poder extraer los tokens
tokens.fill();

// 4. Generar y mostrar la tabla de Lexemas y Tokens
console.log("=========================================");
console.log("       TABLA DE LEXEMAS Y TOKENS         ");
console.log("=========================================");
console.log(String("LEXEMA").padEnd(20) + "| " + "TOKEN");
console.log("-----------------------------------------");

tokens.tokens.forEach(token => {
    // Ignoramos el token EOF (End Of File) que ANTLR agrega al final
    if (token.type !== antlr4.Token.EOF) {
        // Obtenemos el nombre del token a partir de su número de tipo
        const tokenName = lexer.symbolicNames[token.type];
        const lexema = token.text;
        
        console.log(String(lexema).padEnd(20) + "| " + tokenName);
    }
});