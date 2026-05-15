grammar Vuelo;   // nombre del archivo

// REGLAS SINTÁCTICAS
// En minuscula


prog : vuelo+ EOF ;

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

// Operador 
//OPERADOR
    //OPERADOR : LETRA+ (' ' LETRA+)* ;


WS
    : [ \t\r\n]+ -> skip ;
    
fragment LETRA  : [a-zA-Z] ;
fragment DIGITO : [0-9] ;