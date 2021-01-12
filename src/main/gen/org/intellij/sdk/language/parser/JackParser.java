// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.intellij.sdk.language.psi.JackTypes.*;
import static org.intellij.sdk.language.parser.JackParserUtil.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class JackParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return jackFile(b, l + 1);
  }

  /* ********************************************************** */
  // "&"
  public static boolean AND_OPERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "AND_OPERATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, AND_OPERATOR, "<and operator>");
    r = consumeToken(b, "&");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "Array"
  public static boolean ARRAY_CLASS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ARRAY_CLASS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ARRAY_CLASS, "<array class>");
    r = consumeToken(b, "Array");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "="
  public static boolean ASSIGNMENT_OPERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ASSIGNMENT_OPERATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT_OPERATOR, "<assignment operator>");
    r = consumeToken(b, "=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "boolean"
  public static boolean BOOLEAN_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "BOOLEAN_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN_KEYWORD, "<boolean keyword>");
    r = consumeToken(b, "boolean");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "char"
  public static boolean CHAR_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CHAR_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CHAR_KEYWORD, "<char keyword>");
    r = consumeToken(b, "char");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "class"
  public static boolean CLASS_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_KEYWORD, "<class keyword>");
    r = consumeToken(b, "class");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "."
  public static boolean CLASS_MEMBERSHIP(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLASS_MEMBERSHIP")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_MEMBERSHIP, "<class membership>");
    r = consumeToken(b, ".");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "}"
  public static boolean CLOSE_BRACE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLOSE_BRACE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLOSE_BRACE, "<close brace>");
    r = consumeToken(b, "}");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "]"
  public static boolean CLOSE_BRACKET(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLOSE_BRACKET")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLOSE_BRACKET, "<close bracket>");
    r = consumeToken(b, "]");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ")"
  public static boolean CLOSE_PARENTHESIS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CLOSE_PARENTHESIS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLOSE_PARENTHESIS, "<close parenthesis>");
    r = consumeToken(b, ")");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "constructor"
  public static boolean CONSTRUCTOR_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "CONSTRUCTOR_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRUCTOR_KEYWORD, "<constructor keyword>");
    r = consumeToken(b, "constructor");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "/"
  public static boolean DIVIDE_OPERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DIVIDE_OPERATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DIVIDE_OPERATOR, "<divide operator>");
    r = consumeToken(b, "/");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "do"
  public static boolean DO_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "DO_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DO_KEYWORD, "<do keyword>");
    r = consumeToken(b, "do");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "else"
  public static boolean ELSE_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ELSE_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ELSE_KEYWORD, "<else keyword>");
    r = consumeToken(b, "else");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "="
  public static boolean EQUALS_OPERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "EQUALS_OPERATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, EQUALS_OPERATOR, "<equals operator>");
    r = consumeToken(b, "=");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "false"
  public static boolean FALSE_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FALSE_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FALSE_KEYWORD, "<false keyword>");
    r = consumeToken(b, "false");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "field"
  public static boolean FIELD_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FIELD_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FIELD_KEYWORD, "<field keyword>");
    r = consumeToken(b, "field");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "function"
  public static boolean FUNCTION_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "FUNCTION_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION_KEYWORD, "<function keyword>");
    r = consumeToken(b, "function");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "if"
  public static boolean IF_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "IF_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_KEYWORD, "<if keyword>");
    r = consumeToken(b, "if");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "int"
  public static boolean INT_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "INT_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, INT_KEYWORD, "<int keyword>");
    r = consumeToken(b, "int");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "Keyboard"
  public static boolean KEYBOARD_CLASS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "KEYBOARD_CLASS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, KEYBOARD_CLASS, "<keyboard class>");
    r = consumeToken(b, "Keyboard");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "<"
  public static boolean LESS_THAN_OPERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LESS_THAN_OPERATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LESS_THAN_OPERATOR, "<less than operator>");
    r = consumeToken(b, "<");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "let"
  public static boolean LET_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LET_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LET_KEYWORD, "<let keyword>");
    r = consumeToken(b, "let");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ","
  public static boolean LIST_SEPARATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "LIST_SEPARATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, LIST_SEPARATOR, "<list separator>");
    r = consumeToken(b, ",");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "Math"
  public static boolean MATH_CLASS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MATH_CLASS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MATH_CLASS, "<math class>");
    r = consumeToken(b, "Math");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "Memory"
  public static boolean MEMORY_CLASS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MEMORY_CLASS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MEMORY_CLASS, "<memory class>");
    r = consumeToken(b, "Memory");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "method"
  public static boolean METHOD_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "METHOD_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD_KEYWORD, "<method keyword>");
    r = consumeToken(b, "method");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "-"
  public static boolean MINUS_OPERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MINUS_OPERATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MINUS_OPERATOR, "<minus operator>");
    r = consumeToken(b, "-");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ">"
  public static boolean MORE_THAN_OPERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "MORE_THAN_OPERATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, MORE_THAN_OPERATOR, "<more than operator>");
    r = consumeToken(b, ">");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "new"
  public static boolean NEW_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NEW_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NEW_KEYWORD, "<new keyword>");
    r = consumeToken(b, "new");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "~"
  public static boolean NOT_OPERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NOT_OPERATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NOT_OPERATOR, "<not operator>");
    r = consumeToken(b, "~");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "null"
  public static boolean NULL_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "NULL_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NULL_KEYWORD, "<null keyword>");
    r = consumeToken(b, "null");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "{"
  public static boolean OPEN_BRACE(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPEN_BRACE")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPEN_BRACE, "<open brace>");
    r = consumeToken(b, "{");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "["
  public static boolean OPEN_BRACKET(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPEN_BRACKET")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPEN_BRACKET, "<open bracket>");
    r = consumeToken(b, "[");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "("
  public static boolean OPEN_PARENTHESIS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OPEN_PARENTHESIS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPEN_PARENTHESIS, "<open parenthesis>");
    r = consumeToken(b, "(");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "|"
  public static boolean OR_OPERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OR_OPERATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OR_OPERATOR, "<or operator>");
    r = consumeToken(b, "|");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // STRING_CLASS|MEMORY_CLASS|OUTPUT_CLASS|SYS_CLASS|KEYBOARD_CLASS|ARRAY_CLASS|MATH_CLASS|SCREEN_CLASS
  public static boolean OS_class_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OS_class_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OS_CLASS_TYPE, "<os class type>");
    r = STRING_CLASS(b, l + 1);
    if (!r) r = MEMORY_CLASS(b, l + 1);
    if (!r) r = OUTPUT_CLASS(b, l + 1);
    if (!r) r = SYS_CLASS(b, l + 1);
    if (!r) r = KEYBOARD_CLASS(b, l + 1);
    if (!r) r = ARRAY_CLASS(b, l + 1);
    if (!r) r = MATH_CLASS(b, l + 1);
    if (!r) r = SCREEN_CLASS(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "Output"
  public static boolean OUTPUT_CLASS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "OUTPUT_CLASS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OUTPUT_CLASS, "<output class>");
    r = consumeToken(b, "Output");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "+"
  public static boolean PLUS_OPERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "PLUS_OPERATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PLUS_OPERATOR, "<plus operator>");
    r = consumeToken(b, "+");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "return"
  public static boolean RETURN_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "RETURN_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RETURN_KEYWORD, "<return keyword>");
    r = consumeToken(b, "return");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "Screen"
  public static boolean SCREEN_CLASS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SCREEN_CLASS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SCREEN_CLASS, "<screen class>");
    r = consumeToken(b, "Screen");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // ";"
  public static boolean STATEMENT_TERMINATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATEMENT_TERMINATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT_TERMINATOR, "<statement terminator>");
    r = consumeToken(b, ";");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "static"
  public static boolean STATIC_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STATIC_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATIC_KEYWORD, "<static keyword>");
    r = consumeToken(b, "static");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "String"
  public static boolean STRING_CLASS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STRING_CLASS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_CLASS, "<string class>");
    r = consumeToken(b, "String");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "\""
  public static boolean STRING_OPERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "STRING_OPERATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STRING_OPERATOR, "<string operator>");
    r = consumeToken(b, "\"");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "Sys"
  public static boolean SYS_CLASS(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "SYS_CLASS")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, SYS_CLASS, "<sys class>");
    r = consumeToken(b, "Sys");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "this"
  public static boolean THIS_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "THIS_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, THIS_KEYWORD, "<this keyword>");
    r = consumeToken(b, "this");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "*"
  public static boolean TIMES_OPERATOR(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TIMES_OPERATOR")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TIMES_OPERATOR, "<times operator>");
    r = consumeToken(b, "*");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "true"
  public static boolean TRUE_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "TRUE_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TRUE_KEYWORD, "<true keyword>");
    r = consumeToken(b, "true");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "var"
  public static boolean VAR_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VAR_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VAR_KEYWORD, "<var keyword>");
    r = consumeToken(b, "var");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "void"
  public static boolean VOID_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "VOID_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, VOID_KEYWORD, "<void keyword>");
    r = consumeToken(b, "void");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "while"
  public static boolean WHILE_KEYWORD(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "WHILE_KEYWORD")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHILE_KEYWORD, "<while keyword>");
    r = consumeToken(b, "while");
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // LET_KEYWORD KEY ASSIGNMENT_OPERATOR (VALUE|KEY|routine_call) STATEMENT_TERMINATOR
  public static boolean assignment(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ASSIGNMENT, "<assignment>");
    r = LET_KEYWORD(b, l + 1);
    r = r && consumeToken(b, KEY);
    r = r && ASSIGNMENT_OPERATOR(b, l + 1);
    r = r && assignment_3(b, l + 1);
    r = r && STATEMENT_TERMINATOR(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // VALUE|KEY|routine_call
  private static boolean assignment_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "assignment_3")) return false;
    boolean r;
    r = consumeToken(b, VALUE);
    if (!r) r = consumeToken(b, KEY);
    if (!r) r = routine_call(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // KEY|TRUE_KEYWORD|FALSE_KEYWORD|(NOT_OPERATOR condition)|routine_call
  public static boolean boolean_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_$")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, BOOLEAN, "<boolean $>");
    r = consumeToken(b, KEY);
    if (!r) r = TRUE_KEYWORD(b, l + 1);
    if (!r) r = FALSE_KEYWORD(b, l + 1);
    if (!r) r = boolean_3(b, l + 1);
    if (!r) r = routine_call(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // NOT_OPERATOR condition
  private static boolean boolean_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "boolean_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = NOT_OPERATOR(b, l + 1);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // []
  public static boolean char_$(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, CHAR, true);
    return true;
  }

  /* ********************************************************** */
  // CLASS_KEYWORD user_class_type OPEN_BRACE declaration* routine* constructor? routine* CLOSE_BRACE
  public static boolean class_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CLASS_BLOCK, "<class block>");
    r = CLASS_KEYWORD(b, l + 1);
    r = r && user_class_type(b, l + 1);
    r = r && OPEN_BRACE(b, l + 1);
    r = r && class_block_3(b, l + 1);
    r = r && class_block_4(b, l + 1);
    r = r && class_block_5(b, l + 1);
    r = r && class_block_6(b, l + 1);
    r = r && CLOSE_BRACE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // declaration*
  private static boolean class_block_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_block_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_block_3", c)) break;
    }
    return true;
  }

  // routine*
  private static boolean class_block_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_block_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!routine(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_block_4", c)) break;
    }
    return true;
  }

  // constructor?
  private static boolean class_block_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_block_5")) return false;
    constructor(b, l + 1);
    return true;
  }

  // routine*
  private static boolean class_block_6(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "class_block_6")) return false;
    while (true) {
      int c = current_position_(b);
      if (!routine(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "class_block_6", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // nonCode* class_block? noncode*
  public static boolean code(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CODE, "<code>");
    r = code_0(b, l + 1);
    r = r && code_1(b, l + 1);
    r = r && code_2(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // nonCode*
  private static boolean code_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!nonCode(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "code_0", c)) break;
    }
    return true;
  }

  // class_block?
  private static boolean code_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_1")) return false;
    class_block(b, l + 1);
    return true;
  }

  // noncode*
  private static boolean code_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_2")) return false;
    while (true) {
      int c = current_position_(b);
      if (!consumeToken(b, NONCODE)) break;
      if (!empty_element_parsed_guard_(b, "code_2", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // OPEN_BRACE statement* CLOSE_BRACE
  public static boolean code_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CODE_BLOCK, "<code block>");
    r = OPEN_BRACE(b, l + 1);
    r = r && code_block_1(b, l + 1);
    r = r && CLOSE_BRACE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // statement*
  private static boolean code_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "code_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "code_block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (KEY|VALUE comparison_operator KEY|VALUE)| (OPEN_PARENTHESIS comparison CLOSE_PARENTHESIS)|boolean|(OPEN_PARENTHESIS boolean CLOSE_PARENTHESIS)
  public static boolean comparison(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON, "<comparison>");
    r = comparison_0(b, l + 1);
    if (!r) r = comparison_1(b, l + 1);
    if (!r) r = boolean_$(b, l + 1);
    if (!r) r = comparison_3(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEY|VALUE comparison_operator KEY|VALUE
  private static boolean comparison_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEY);
    if (!r) r = comparison_0_1(b, l + 1);
    if (!r) r = consumeToken(b, VALUE);
    exit_section_(b, m, null, r);
    return r;
  }

  // VALUE comparison_operator KEY
  private static boolean comparison_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_0_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, VALUE);
    r = r && comparison_operator(b, l + 1);
    r = r && consumeToken(b, KEY);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPEN_PARENTHESIS comparison CLOSE_PARENTHESIS
  private static boolean comparison_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OPEN_PARENTHESIS(b, l + 1);
    r = r && comparison(b, l + 1);
    r = r && CLOSE_PARENTHESIS(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // OPEN_PARENTHESIS boolean CLOSE_PARENTHESIS
  private static boolean comparison_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_3")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = OPEN_PARENTHESIS(b, l + 1);
    r = r && boolean_$(b, l + 1);
    r = r && CLOSE_PARENTHESIS(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // EQUALS_OPERATOR|LESS_THAN_OPERATOR|MORE_THAN_OPERATOR
  public static boolean comparison_operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comparison_operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, COMPARISON_OPERATOR, "<comparison operator>");
    r = EQUALS_OPERATOR(b, l + 1);
    if (!r) r = LESS_THAN_OPERATOR(b, l + 1);
    if (!r) r = MORE_THAN_OPERATOR(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // comparison ((AND_OPERATOR|OR_OPERATOR) condition)*
  public static boolean condition(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONDITION, "<condition>");
    r = comparison(b, l + 1);
    r = r && condition_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // ((AND_OPERATOR|OR_OPERATOR) condition)*
  private static boolean condition_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!condition_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "condition_1", c)) break;
    }
    return true;
  }

  // (AND_OPERATOR|OR_OPERATOR) condition
  private static boolean condition_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = condition_1_0_0(b, l + 1);
    r = r && condition(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // AND_OPERATOR|OR_OPERATOR
  private static boolean condition_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "condition_1_0_0")) return false;
    boolean r;
    r = AND_OPERATOR(b, l + 1);
    if (!r) r = OR_OPERATOR(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // CONSTRUCTOR_KEYWORD user_class_type NEW_KEYWORD parameters OPEN_BRACE routine_block RETURN_KEYWORD THIS_KEYWORD STATEMENT_TERMINATOR CLOSE_BRACE
  public static boolean constructor(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "constructor")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONSTRUCTOR, "<constructor>");
    r = CONSTRUCTOR_KEYWORD(b, l + 1);
    r = r && user_class_type(b, l + 1);
    r = r && NEW_KEYWORD(b, l + 1);
    r = r && parameters(b, l + 1);
    r = r && OPEN_BRACE(b, l + 1);
    r = r && routine_block(b, l + 1);
    r = r && RETURN_KEYWORD(b, l + 1);
    r = r && THIS_KEYWORD(b, l + 1);
    r = r && STATEMENT_TERMINATOR(b, l + 1);
    r = r && CLOSE_BRACE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // if_flow|while_flow
  public static boolean control_flow(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "control_flow")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, CONTROL_FLOW, "<control flow>");
    r = if_flow(b, l + 1);
    if (!r) r = while_flow(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // VAR_KEYWORD type KEY (LIST_SEPARATOR KEY)* STATEMENT_TERMINATOR
  public static boolean declaration(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, DECLARATION, "<declaration>");
    r = VAR_KEYWORD(b, l + 1);
    r = r && type(b, l + 1);
    r = r && consumeToken(b, KEY);
    r = r && declaration_3(b, l + 1);
    r = r && STATEMENT_TERMINATOR(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (LIST_SEPARATOR KEY)*
  private static boolean declaration_3(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_3")) return false;
    while (true) {
      int c = current_position_(b);
      if (!declaration_3_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "declaration_3", c)) break;
    }
    return true;
  }

  // LIST_SEPARATOR KEY
  private static boolean declaration_3_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "declaration_3_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LIST_SEPARATOR(b, l + 1);
    r = r && consumeToken(b, KEY);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // FUNCTION_KEYWORD type parameters OPEN_BRACE routine_block return_statement CLOSE_BRACE
  public static boolean function(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "function")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, FUNCTION, "<function>");
    r = FUNCTION_KEYWORD(b, l + 1);
    r = r && type(b, l + 1);
    r = r && parameters(b, l + 1);
    r = r && OPEN_BRACE(b, l + 1);
    r = r && routine_block(b, l + 1);
    r = r && return_statement(b, l + 1);
    r = r && CLOSE_BRACE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // IF_KEYWORD OPEN_PARENTHESIS condition CLOSE_PARENTHESIS code_block (ELSE_KEYWORD code_block)?
  public static boolean if_flow(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_flow")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, IF_FLOW, "<if flow>");
    r = IF_KEYWORD(b, l + 1);
    r = r && OPEN_PARENTHESIS(b, l + 1);
    r = r && condition(b, l + 1);
    r = r && CLOSE_PARENTHESIS(b, l + 1);
    r = r && code_block(b, l + 1);
    r = r && if_flow_5(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (ELSE_KEYWORD code_block)?
  private static boolean if_flow_5(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_flow_5")) return false;
    if_flow_5_0(b, l + 1);
    return true;
  }

  // ELSE_KEYWORD code_block
  private static boolean if_flow_5_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "if_flow_5_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = ELSE_KEYWORD(b, l + 1);
    r = r && code_block(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // "0"|("1"|"2"|"3"|"4"|"5"|"6"|"7"|"8"|"9" int*)
  public static boolean int_$(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "int_$")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, INT, "<int $>");
    r = consumeToken(b, "0");
    if (!r) r = int_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // "1"|"2"|"3"|"4"|"5"|"6"|"7"|"8"|"9" int*
  private static boolean int_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "int_1")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "1");
    if (!r) r = consumeToken(b, "2");
    if (!r) r = consumeToken(b, "3");
    if (!r) r = consumeToken(b, "4");
    if (!r) r = consumeToken(b, "5");
    if (!r) r = consumeToken(b, "6");
    if (!r) r = consumeToken(b, "7");
    if (!r) r = consumeToken(b, "8");
    if (!r) r = int_1_8(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // "9" int*
  private static boolean int_1_8(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "int_1_8")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, "9");
    r = r && int_1_8_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // int*
  private static boolean int_1_8_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "int_1_8_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!int_$(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "int_1_8_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // property|COMMENT|CRLF
  static boolean item_(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item_")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property(b, l + 1);
    if (!r) r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // item_*
  static boolean jackFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "jackFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!item_(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "jackFile", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // METHOD_KEYWORD type parameters OPEN_BRACE routine_block return_statement CLOSE_BRACE
  public static boolean method(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "method")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, METHOD, "<method>");
    r = METHOD_KEYWORD(b, l + 1);
    r = r && type(b, l + 1);
    r = r && parameters(b, l + 1);
    r = r && OPEN_BRACE(b, l + 1);
    r = r && routine_block(b, l + 1);
    r = r && return_statement(b, l + 1);
    r = r && CLOSE_BRACE(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // COMMENT|CRLF
  public static boolean nonCode(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "nonCode")) return false;
    if (!nextTokenIs(b, "<non code>", COMMENT, CRLF)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, NON_CODE, "<non code>");
    r = consumeToken(b, COMMENT);
    if (!r) r = consumeToken(b, CRLF);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OS_class_type|user_class_type
  public static boolean object_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OBJECT_TYPE, "<object type>");
    r = OS_class_type(b, l + 1);
    if (!r) r = user_class_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // PLUS_OPERATOR|MINUS_OPERATOR|TIMES_OPERATOR|DIVIDE_OPERATOR
  public static boolean operator(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "operator")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, OPERATOR, "<operator>");
    r = PLUS_OPERATOR(b, l + 1);
    if (!r) r = MINUS_OPERATOR(b, l + 1);
    if (!r) r = TIMES_OPERATOR(b, l + 1);
    if (!r) r = DIVIDE_OPERATOR(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // type KEY
  public static boolean parameter(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameter")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETER, "<parameter>");
    r = type(b, l + 1);
    r = r && consumeToken(b, KEY);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // OPEN_PARENTHESIS (parameter (LIST_SEPARATOR parameter)*)? CLOSE_PARENTHESIS
  public static boolean parameters(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PARAMETERS, "<parameters>");
    r = OPEN_PARENTHESIS(b, l + 1);
    r = r && parameters_1(b, l + 1);
    r = r && CLOSE_PARENTHESIS(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (parameter (LIST_SEPARATOR parameter)*)?
  private static boolean parameters_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1")) return false;
    parameters_1_0(b, l + 1);
    return true;
  }

  // parameter (LIST_SEPARATOR parameter)*
  private static boolean parameters_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = parameter(b, l + 1);
    r = r && parameters_1_0_1(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // (LIST_SEPARATOR parameter)*
  private static boolean parameters_1_0_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1_0_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!parameters_1_0_1_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "parameters_1_0_1", c)) break;
    }
    return true;
  }

  // LIST_SEPARATOR parameter
  private static boolean parameters_1_0_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "parameters_1_0_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = LIST_SEPARATOR(b, l + 1);
    r = r && parameter(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // int|boolean|char|void
  public static boolean primitive_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "primitive_type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PRIMITIVE_TYPE, "<primitive type>");
    r = int_$(b, l + 1);
    if (!r) r = boolean_$(b, l + 1);
    if (!r) r = char_$(b, l + 1);
    if (!r) r = void_$(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (KEY? SEPARATOR VALUE?) | KEY
  public static boolean property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, PROPERTY, "<property>");
    r = property_0(b, l + 1);
    if (!r) r = consumeToken(b, KEY);
    exit_section_(b, l, m, r, false, JackParser::recover_property);
    return r;
  }

  // KEY? SEPARATOR VALUE?
  private static boolean property_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = property_0_0(b, l + 1);
    r = r && consumeToken(b, SEPARATOR);
    r = r && property_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // KEY?
  private static boolean property_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0_0")) return false;
    consumeToken(b, KEY);
    return true;
  }

  // VALUE?
  private static boolean property_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "property_0_2")) return false;
    consumeToken(b, VALUE);
    return true;
  }

  /* ********************************************************** */
  // !(KEY|SEPARATOR|COMMENT)
  static boolean recover_property(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_property")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_);
    r = !recover_property_0(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEY|SEPARATOR|COMMENT
  private static boolean recover_property_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_property_0")) return false;
    boolean r;
    r = consumeToken(b, KEY);
    if (!r) r = consumeToken(b, SEPARATOR);
    if (!r) r = consumeToken(b, COMMENT);
    return r;
  }

  /* ********************************************************** */
  // RETURN_KEYWORD (KEY|VALUE|routine_call)? STATEMENT_TERMINATOR
  public static boolean return_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, RETURN_STATEMENT, "<return statement>");
    r = RETURN_KEYWORD(b, l + 1);
    r = r && return_statement_1(b, l + 1);
    r = r && STATEMENT_TERMINATOR(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // (KEY|VALUE|routine_call)?
  private static boolean return_statement_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_1")) return false;
    return_statement_1_0(b, l + 1);
    return true;
  }

  // KEY|VALUE|routine_call
  private static boolean return_statement_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "return_statement_1_0")) return false;
    boolean r;
    r = consumeToken(b, KEY);
    if (!r) r = consumeToken(b, VALUE);
    if (!r) r = routine_call(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // constructor|method|function
  public static boolean routine(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROUTINE, "<routine>");
    r = constructor(b, l + 1);
    if (!r) r = method(b, l + 1);
    if (!r) r = function(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // declaration* statement*
  public static boolean routine_block(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_block")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROUTINE_BLOCK, "<routine block>");
    r = routine_block_0(b, l + 1);
    r = r && routine_block_1(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // declaration*
  private static boolean routine_block_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_block_0")) return false;
    while (true) {
      int c = current_position_(b);
      if (!declaration(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "routine_block_0", c)) break;
    }
    return true;
  }

  // statement*
  private static boolean routine_block_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_block_1")) return false;
    while (true) {
      int c = current_position_(b);
      if (!statement(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "routine_block_1", c)) break;
    }
    return true;
  }

  /* ********************************************************** */
  // (KEY|object_type) CLASS_MEMBERSHIP routine_name OPEN_PARENTHESIS (KEY|VALUE|routine_call)* CLOSE_PARENTHESIS
  public static boolean routine_call(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_call")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROUTINE_CALL, "<routine call>");
    r = routine_call_0(b, l + 1);
    r = r && CLASS_MEMBERSHIP(b, l + 1);
    r = r && routine_name(b, l + 1);
    r = r && OPEN_PARENTHESIS(b, l + 1);
    r = r && routine_call_4(b, l + 1);
    r = r && CLOSE_PARENTHESIS(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  // KEY|object_type
  private static boolean routine_call_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_call_0")) return false;
    boolean r;
    r = consumeToken(b, KEY);
    if (!r) r = object_type(b, l + 1);
    return r;
  }

  // (KEY|VALUE|routine_call)*
  private static boolean routine_call_4(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_call_4")) return false;
    while (true) {
      int c = current_position_(b);
      if (!routine_call_4_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "routine_call_4", c)) break;
    }
    return true;
  }

  // KEY|VALUE|routine_call
  private static boolean routine_call_4_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_call_4_0")) return false;
    boolean r;
    r = consumeToken(b, KEY);
    if (!r) r = consumeToken(b, VALUE);
    if (!r) r = routine_call(b, l + 1);
    return r;
  }

  /* ********************************************************** */
  // DO_KEYWORD routine_call STATEMENT_TERMINATOR
  public static boolean routine_call_statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_call_statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ROUTINE_CALL_STATEMENT, "<routine call statement>");
    r = DO_KEYWORD(b, l + 1);
    r = r && routine_call(b, l + 1);
    r = r && STATEMENT_TERMINATOR(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KEY
  public static boolean routine_name(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "routine_name")) return false;
    if (!nextTokenIs(b, KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEY);
    exit_section_(b, m, ROUTINE_NAME, r);
    return r;
  }

  /* ********************************************************** */
  // assignment|control_flow
  public static boolean statement(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "statement")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, STATEMENT, "<statement>");
    r = assignment(b, l + 1);
    if (!r) r = control_flow(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // primitive_type|object_type
  public static boolean type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "type")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, TYPE, "<type>");
    r = primitive_type(b, l + 1);
    if (!r) r = object_type(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // KEY
  public static boolean user_class_type(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "user_class_type")) return false;
    if (!nextTokenIs(b, KEY)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, KEY);
    exit_section_(b, m, USER_CLASS_TYPE, r);
    return r;
  }

  /* ********************************************************** */
  // []
  public static boolean void_$(PsiBuilder b, int l) {
    Marker m = enter_section_(b);
    exit_section_(b, m, VOID, true);
    return true;
  }

  /* ********************************************************** */
  // WHILE_KEYWORD OPEN_PARENTHESIS condition CLOSE_PARENTHESIS code_block
  public static boolean while_flow(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "while_flow")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, WHILE_FLOW, "<while flow>");
    r = WHILE_KEYWORD(b, l + 1);
    r = r && OPEN_PARENTHESIS(b, l + 1);
    r = r && condition(b, l + 1);
    r = r && CLOSE_PARENTHESIS(b, l + 1);
    r = r && code_block(b, l + 1);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

}
