
        /*---- Codigo de Usuario ----*/


// Paquetes e importaciones

package com.peter.c3d.back;
import java_cup.runtime.*;  
//import com.peter.music_player_server.sintact.*;

/*---- Opciones y declaraciones ----*/

%%

%{
    //Codigo de usuario en sintaxis java
    
    
%}

        //Directivas


%class Lexer
%public
%cup
%unicode
%column
%line

        // Declarar Expresiones regulares

/* ESPACIOS */

WhiteSpace = [\r|\n|\r\n] | [ \t\f]

/* NUMEROS */

numeroEntero = [0-9]+



/* TEXTO */
id = ([a-zA-Z]|"_")([a-zA-Z]|{numeroEntero}|"_")*

// ESTADO INICIAL ES " YYNITIAL"

%%

/*---- Reglas Lexicas ----*/

<YYINITIAL> {WhiteSpace} {  }




    /* REGLAS GENERALES */


/* SIMBOLOGIA */


<YYINITIAL> {numeroEntero}         { return new Symbol(sym.NUMERO,yycolumn+1,yyline+1, yytext()); }

<YYINITIAL> "+"         { return new Symbol(sym.MAS,yycolumn+1,yyline+1, yytext()); }

<YYINITIAL> "-"         { return new Symbol(sym.MENOS,yycolumn+1,yyline+1, yytext()); }

<YYINITIAL> "*"         { return new Symbol(sym.MULTIPLICACION,yycolumn+1,yyline+1, yytext()); }

<YYINITIAL> "/"         { return new Symbol(sym.DIVISION,yycolumn+1,yyline+1, yytext()); }
    
<YYINITIAL> "("         { return new Symbol(sym.PABIERTO,yycolumn+1,yyline+1, yytext()); }

<YYINITIAL> ")"         { return new Symbol(sym.PCERRADO,yycolumn+1,yyline+1, yytext()); }

<YYINITIAL> "="         { return new Symbol(sym.ASIGNACION,yycolumn+1,yyline+1, yytext()); }


    /* SIMBOLOS DE PUNTUACION*/


<YYINITIAL> ";"         { return new Symbol(sym.PUNTO_COMA,yycolumn+1,yyline+1, yytext()); }

<YYINITIAL> {id}        { return new Symbol(sym.ID,yycolumn+1,yyline+1, yytext()); }



[^] { 
            System.out.println(" ******* ERROR LEXICO " + yytext() + " linea " + (yyline+1) + " columna "  + (yycolumn+1) + "  ********" );
            
    }

