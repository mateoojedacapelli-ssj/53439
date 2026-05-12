grammar Vuelo;   // nombre del archivo

// REGLAS SINTÁCTICAS
// En minuscula


prog: vuelo+ EOF ;

vuelo
    : CODIGO_VUELO origen=AEROPUERTO '-' destino=AEROPUERTO HORA ',' ESTADO ',' 'Gate:' PUERTA
    #infoVuelo ;


// TOKENS LÉXICOS
// En mayuscula 


ESTADO
    : 'ON_TIME'
    | 'DELAYED'
    | 'CANCELLED' ;

// Hora
HORA
    : ( [01][0-9] | '2' [0-3] ) ':' [0-5][0-9]
    | 'NOW' ;

// Código de vuelo
CODIGO_VUELO
    : [A-Z][A-Z][0-9][0-9][0-9] ;

// Código IATA 
AEROPUERTO
    : [A-Z][A-Z][A-Z] ;

// Puerta
PUERTA
    : [A-Z][0-9]+ ;

// Fecha 
FECHA
    : DIGITO DIGITO '/' DIGITO DIGITO '/' DIGITO DIGITO ;

// Operador 
OPERADOR
    : LETRA (LETRA | ' ')* ;

// Asiento 
ASIENTO
    : [A-F] DIGITO+ ;


// Terminal 
TERMINAL
    : DIGITO | LETRA ;
// Ignorar espacios y saltos de línea
WS
    : [ \t\r\n]+ -> skip ;
    
fragment LETRA  : [a-zA-Z] ;
fragment DIGITO : [0-9] ;