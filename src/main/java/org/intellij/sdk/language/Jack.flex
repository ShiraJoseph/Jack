// Copyright 2000-2020 JetBrains s.r.o. and other contributors. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.
package org.intellij.sdk.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.psi.JackTypes;
import com.intellij.psi.TokenType;

%%

%class JackLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType
%eof{  return;
%eof}

CRLF=\R
WHITE_SPACE=[\ \n\t\f]
FIRST_VALUE_CHARACTER=[^ \n\f\\] | "\\"{CRLF} | "\\".
VALUE_CHARACTER=[^\n\f\\] | "\\"{CRLF} | "\\".
END_OF_LINE_COMMENT=("//")[^\r\n]*

KEY_CHARACTER=[^:=\ \n\t\f\\] | "\\ "
QUOTE_CHARACTER=\"
// double check that variable names can have underscores
IDENTIFIER=([_A-Za-z])[_A-Za-z0-9]*
CLASS_IDENTIFIER=([A-Z])[_A-Za-z0-9]*

IntegerLiteral=(\-)?([0-9] | [1-9][0-9]*)
StringLiteral=[^\n]


%state WAITING_VALUE
%state IN_QUOTES

%%

<YYINITIAL> {END_OF_LINE_COMMENT}                           { yybegin(YYINITIAL); return JackTypes.COMMENT; }


<YYINITIAL> "class"  																				{ return JackTypes.CLASS; }
<YYINITIAL> "constructor"  																	{ return JackTypes.CONSTRUCTOR_KEYWORD; }
<YYINITIAL> "method"                                        { return JackTypes.METHOD_KEYWORD; }
<YYINITIAL> "function"  																		{ return JackTypes.FUNCTION_KEYWORD; }
<YYINITIAL> "int"  																					{ return JackTypes.INT_KEYWORD; }
<YYINITIAL> "boolean"  																			{ return JackTypes.BOOLEAN_KEYWORD; }
<YYINITIAL> "char"  																				{ return JackTypes.CHAR_KEYWORD; }
<YYINITIAL> "void"  																				{ return JackTypes.VOID_KEYWORD; }
<YYINITIAL> "var"  																					{ return JackTypes.VAR_KEYWORD; }
<YYINITIAL> "static"  																			{ return JackTypes.STATIC_KEYWORD; }
<YYINITIAL> "field"  								  											{ return JackTypes.FIELD_KEYWORD; }
<YYINITIAL> "let"  																					{ return JackTypes.LET_KEYWORD; }
<YYINITIAL> "do"           																	{ return JackTypes.DO_KEYWORD; }
<YYINITIAL> "if"  																					{ return JackTypes.IF_KEYWORD; }
<YYINITIAL> "else"  																	    	{ return JackTypes.ELSE_KEYWORD; }
<YYINITIAL> "while"                                         { return JackTypes.WHILE_KEYWORD; }
<YYINITIAL> "return"  																			{ return JackTypes.RETURN_KEYWORD; }
<YYINITIAL> "true"  																				{ return JackTypes.TRUE_KEYWORD; }
<YYINITIAL> "false"  																				{ return JackTypes.FALSE_KEYWORD; }
<YYINITIAL> "null"  																				{ return JackTypes.NEW_KEYWORD; }
<YYINITIAL> "this"       																		{ return JackTypes.THIS_KEYWORD; }
<YYINITIAL> "new"  																					{ return JackTypes.NEW_KEYWORD; }
<YYINITIAL> "("  																						{ return JackTypes.OPEN_PARENTHESIS; }
<YYINITIAL> ")"                                          		{ return JackTypes.CLOSE_PARENTHESIS; }
<YYINITIAL> "["  																						{ return JackTypes.OPEN_BRACKET; }
<YYINITIAL> "]"  																						{ return JackTypes.CLOSE_BRACKET; }
<YYINITIAL> "{"    																					{ return JackTypes.OPEN_BRACE; }
<YYINITIAL> "}"  																						{ return JackTypes.CLOSE_BRACE; }
<YYINITIAL> ","  																						{ return JackTypes.LIST_SEPARATOR; }
<YYINITIAL> ";"  																						{ return JackTypes.STATEMENT_TERMINATOR; }
<YYINITIAL> "="  																						{ return JackTypes.ASSIGNMENT; }
<YYINITIAL> "."  																						{ return JackTypes.CLASS_MEMBERSHIP; }
<YYINITIAL> "+"  																						{ return JackTypes.PLUS_OPERATOR; }
<YYINITIAL> "-"                                							{ return JackTypes.MINUS_OPERATOR; }
<YYINITIAL> "*"  																						{ return JackTypes.TIMES_OPERATOR; }
<YYINITIAL> "/"  																						{ return JackTypes.DIVIDE_OPERATOR; }
<YYINITIAL> "&"  																						{ return JackTypes.AND_OPERATOR; }
<YYINITIAL> "|"  																						{ return JackTypes.OR_OPERATOR; }
<YYINITIAL> "~"  																						{ return JackTypes.NOT_OPERATOR; }
<YYINITIAL> "="  																						{ return JackTypes.EQUALS_OPERATOR; }
<YYINITIAL> "<"  																						{ return JackTypes.LESS_THAN_OPERATOR; }
<YYINITIAL> ">"  																						{ return JackTypes.MORE_THAN_OPERATOR; }
<YYINITIAL> "Math"  																				{ return JackTypes.MATH_CLASS; }
<YYINITIAL> "Sys"  																					{ return JackTypes.SYS_CLASS; }
<YYINITIAL> "Memory"  																			{ return JackTypes.MEMORY_CLASS; }
<YYINITIAL> "String"  																			{ return JackTypes.STRING_CLASS; }
<YYINITIAL> "Output"  																			{ return JackTypes.OUTPUT_CLASS; }
<YYINITIAL> "Screen"  																			{ return JackTypes.SCREEN_CLASS; }
<YYINITIAL> "Keyboard"  																		{ return JackTypes.KEYBOARD_CLASS; }
<YYINITIAL> "Array"  																				{ return JackTypes.ARRAY_CLASS; }

<YYINITIAL> {QUOTE_CHARACTER}                               { yybegin(IN_QUOTES); return JackTypes.QUOTE_CHARACTER; }
<IN_QUOTES> {StringLiteral} 																{ return JackTypes.STRING_LITERAL; }
<IN_QUOTES> {QUOTE_CHARACTER}                             	{ yybegin(YYINITIAL); return JackTypes.QUOTE_CHARACTER; }

<YYINITIAL> {IntegerLiteral}                                { return JackTypes.INTEGER_LITERAL; }
<YYINITIAL> {CLASS_IDENTIFIER}                              { return JackTypes.CLASS_IDENTIFIER; }
<YYINITIAL> {IDENTIFIER}                                    { return JackTypes.IDENTIFIER; }

<YYINITIAL> {KEY_CHARACTER}+                                { yybegin(YYINITIAL); return JackTypes.KEY; }
<YYINITIAL> {SEPARATOR}                                     { yybegin(WAITING_VALUE); return JackTypes.SEPARATOR; }
<WAITING_VALUE> {CRLF}({CRLF}|{WHITE_SPACE})+               { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }
<WAITING_VALUE> {WHITE_SPACE}+                              { yybegin(WAITING_VALUE); return TokenType.WHITE_SPACE; }
<WAITING_VALUE> {FIRST_VALUE_CHARACTER}{VALUE_CHARACTER}*   { yybegin(YYINITIAL); return JackTypes.VALUE; }
({CRLF}|{WHITE_SPACE})+                                     { yybegin(YYINITIAL); return TokenType.WHITE_SPACE; }

[^]                                                         { return TokenType.BAD_CHARACTER; }