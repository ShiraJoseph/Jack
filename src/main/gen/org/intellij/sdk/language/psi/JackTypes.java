// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.psi.impl.*;

public interface JackTypes {

  IElementType AND_OPERATOR = new JackElementType("AND_OPERATOR");
  IElementType ARRAY_CLASS = new JackElementType("ARRAY_CLASS");
  IElementType ASSIGNMENT = new JackElementType("ASSIGNMENT");
  IElementType ASSIGNMENT_OPERATOR = new JackElementType("ASSIGNMENT_OPERATOR");
  IElementType BOOLEAN = new JackElementType("BOOLEAN");
  IElementType BOOLEAN_KEYWORD = new JackElementType("BOOLEAN_KEYWORD");
  IElementType CHAR = new JackElementType("CHAR");
  IElementType CHAR_KEYWORD = new JackElementType("CHAR_KEYWORD");
  IElementType CLASS_BLOCK = new JackElementType("CLASS_BLOCK");
  IElementType CLASS_KEYWORD = new JackElementType("CLASS_KEYWORD");
  IElementType CLASS_MEMBERSHIP = new JackElementType("CLASS_MEMBERSHIP");
  IElementType CLOSE_BRACE = new JackElementType("CLOSE_BRACE");
  IElementType CLOSE_BRACKET = new JackElementType("CLOSE_BRACKET");
  IElementType CLOSE_PARENTHESIS = new JackElementType("CLOSE_PARENTHESIS");
  IElementType CODE = new JackElementType("CODE");
  IElementType CODE_BLOCK = new JackElementType("CODE_BLOCK");
  IElementType COMPARISON = new JackElementType("COMPARISON");
  IElementType COMPARISON_OPERATOR = new JackElementType("COMPARISON_OPERATOR");
  IElementType CONDITION = new JackElementType("CONDITION");
  IElementType CONSTRUCTOR = new JackElementType("CONSTRUCTOR");
  IElementType CONSTRUCTOR_KEYWORD = new JackElementType("CONSTRUCTOR_KEYWORD");
  IElementType CONTROL_FLOW = new JackElementType("CONTROL_FLOW");
  IElementType DECLARATION = new JackElementType("DECLARATION");
  IElementType DIVIDE_OPERATOR = new JackElementType("DIVIDE_OPERATOR");
  IElementType DO_KEYWORD = new JackElementType("DO_KEYWORD");
  IElementType ELSE_KEYWORD = new JackElementType("ELSE_KEYWORD");
  IElementType EQUALS_OPERATOR = new JackElementType("EQUALS_OPERATOR");
  IElementType FALSE_KEYWORD = new JackElementType("FALSE_KEYWORD");
  IElementType FIELD_KEYWORD = new JackElementType("FIELD_KEYWORD");
  IElementType FUNCTION = new JackElementType("FUNCTION");
  IElementType FUNCTION_KEYWORD = new JackElementType("FUNCTION_KEYWORD");
  IElementType IF_FLOW = new JackElementType("IF_FLOW");
  IElementType IF_KEYWORD = new JackElementType("IF_KEYWORD");
  IElementType INT = new JackElementType("INT");
  IElementType INT_KEYWORD = new JackElementType("INT_KEYWORD");
  IElementType KEYBOARD_CLASS = new JackElementType("KEYBOARD_CLASS");
  IElementType LESS_THAN_OPERATOR = new JackElementType("LESS_THAN_OPERATOR");
  IElementType LET_KEYWORD = new JackElementType("LET_KEYWORD");
  IElementType LIST_SEPARATOR = new JackElementType("LIST_SEPARATOR");
  IElementType MATH_CLASS = new JackElementType("MATH_CLASS");
  IElementType MEMORY_CLASS = new JackElementType("MEMORY_CLASS");
  IElementType METHOD = new JackElementType("METHOD");
  IElementType METHOD_KEYWORD = new JackElementType("METHOD_KEYWORD");
  IElementType MINUS_OPERATOR = new JackElementType("MINUS_OPERATOR");
  IElementType MORE_THAN_OPERATOR = new JackElementType("MORE_THAN_OPERATOR");
  IElementType NEW_KEYWORD = new JackElementType("NEW_KEYWORD");
  IElementType NON_CODE = new JackElementType("NON_CODE");
  IElementType NOT_OPERATOR = new JackElementType("NOT_OPERATOR");
  IElementType NULL_KEYWORD = new JackElementType("NULL_KEYWORD");
  IElementType OBJECT_TYPE = new JackElementType("OBJECT_TYPE");
  IElementType OPEN_BRACE = new JackElementType("OPEN_BRACE");
  IElementType OPEN_BRACKET = new JackElementType("OPEN_BRACKET");
  IElementType OPEN_PARENTHESIS = new JackElementType("OPEN_PARENTHESIS");
  IElementType OPERATOR = new JackElementType("OPERATOR");
  IElementType OR_OPERATOR = new JackElementType("OR_OPERATOR");
  IElementType OS_CLASS_TYPE = new JackElementType("OS_CLASS_TYPE");
  IElementType OUTPUT_CLASS = new JackElementType("OUTPUT_CLASS");
  IElementType PARAMETER = new JackElementType("PARAMETER");
  IElementType PARAMETERS = new JackElementType("PARAMETERS");
  IElementType PLUS_OPERATOR = new JackElementType("PLUS_OPERATOR");
  IElementType PRIMITIVE_TYPE = new JackElementType("PRIMITIVE_TYPE");
  IElementType PROPERTY = new JackElementType("PROPERTY");
  IElementType RETURN_KEYWORD = new JackElementType("RETURN_KEYWORD");
  IElementType RETURN_STATEMENT = new JackElementType("RETURN_STATEMENT");
  IElementType ROUTINE = new JackElementType("ROUTINE");
  IElementType ROUTINE_BLOCK = new JackElementType("ROUTINE_BLOCK");
  IElementType ROUTINE_CALL = new JackElementType("ROUTINE_CALL");
  IElementType ROUTINE_CALL_STATEMENT = new JackElementType("ROUTINE_CALL_STATEMENT");
  IElementType ROUTINE_NAME = new JackElementType("ROUTINE_NAME");
  IElementType SCREEN_CLASS = new JackElementType("SCREEN_CLASS");
  IElementType STATEMENT = new JackElementType("STATEMENT");
  IElementType STATEMENT_TERMINATOR = new JackElementType("STATEMENT_TERMINATOR");
  IElementType STATIC_KEYWORD = new JackElementType("STATIC_KEYWORD");
  IElementType STRING_CLASS = new JackElementType("STRING_CLASS");
  IElementType STRING_OPERATOR = new JackElementType("STRING_OPERATOR");
  IElementType SYS_CLASS = new JackElementType("SYS_CLASS");
  IElementType THIS_KEYWORD = new JackElementType("THIS_KEYWORD");
  IElementType TIMES_OPERATOR = new JackElementType("TIMES_OPERATOR");
  IElementType TRUE_KEYWORD = new JackElementType("TRUE_KEYWORD");
  IElementType TYPE = new JackElementType("TYPE");
  IElementType USER_CLASS_TYPE = new JackElementType("USER_CLASS_TYPE");
  IElementType VAR_KEYWORD = new JackElementType("VAR_KEYWORD");
  IElementType VOID = new JackElementType("VOID");
  IElementType VOID_KEYWORD = new JackElementType("VOID_KEYWORD");
  IElementType WHILE_FLOW = new JackElementType("WHILE_FLOW");
  IElementType WHILE_KEYWORD = new JackElementType("WHILE_KEYWORD");

  IElementType COMMENT = new JackTokenType("COMMENT");
  IElementType CRLF = new JackTokenType("CRLF");
  IElementType KEY = new JackTokenType("KEY");
  IElementType NONCODE = new JackTokenType("noncode");
  IElementType SEPARATOR = new JackTokenType("SEPARATOR");
  IElementType VALUE = new JackTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == AND_OPERATOR) {
        return new JackAndOperatorImpl(node);
      }
      else if (type == ARRAY_CLASS) {
        return new JackArrayClassImpl(node);
      }
      else if (type == ASSIGNMENT) {
        return new JackAssignmentImpl(node);
      }
      else if (type == ASSIGNMENT_OPERATOR) {
        return new JackAssignmentOperatorImpl(node);
      }
      else if (type == BOOLEAN) {
        return new JackBooleanImpl(node);
      }
      else if (type == BOOLEAN_KEYWORD) {
        return new JackBooleanKeywordImpl(node);
      }
      else if (type == CHAR) {
        return new JackCharImpl(node);
      }
      else if (type == CHAR_KEYWORD) {
        return new JackCharKeywordImpl(node);
      }
      else if (type == CLASS_BLOCK) {
        return new JackClassBlockImpl(node);
      }
      else if (type == CLASS_KEYWORD) {
        return new JackClassKeywordImpl(node);
      }
      else if (type == CLASS_MEMBERSHIP) {
        return new JackClassMembershipImpl(node);
      }
      else if (type == CLOSE_BRACE) {
        return new JackCloseBraceImpl(node);
      }
      else if (type == CLOSE_BRACKET) {
        return new JackCloseBracketImpl(node);
      }
      else if (type == CLOSE_PARENTHESIS) {
        return new JackCloseParenthesisImpl(node);
      }
      else if (type == CODE) {
        return new JackCodeImpl(node);
      }
      else if (type == CODE_BLOCK) {
        return new JackCodeBlockImpl(node);
      }
      else if (type == COMPARISON) {
        return new JackComparisonImpl(node);
      }
      else if (type == COMPARISON_OPERATOR) {
        return new JackComparisonOperatorImpl(node);
      }
      else if (type == CONDITION) {
        return new JackConditionImpl(node);
      }
      else if (type == CONSTRUCTOR) {
        return new JackConstructorImpl(node);
      }
      else if (type == CONSTRUCTOR_KEYWORD) {
        return new JackConstructorKeywordImpl(node);
      }
      else if (type == CONTROL_FLOW) {
        return new JackControlFlowImpl(node);
      }
      else if (type == DECLARATION) {
        return new JackDeclarationImpl(node);
      }
      else if (type == DIVIDE_OPERATOR) {
        return new JackDivideOperatorImpl(node);
      }
      else if (type == DO_KEYWORD) {
        return new JackDoKeywordImpl(node);
      }
      else if (type == ELSE_KEYWORD) {
        return new JackElseKeywordImpl(node);
      }
      else if (type == EQUALS_OPERATOR) {
        return new JackEqualsOperatorImpl(node);
      }
      else if (type == FALSE_KEYWORD) {
        return new JackFalseKeywordImpl(node);
      }
      else if (type == FIELD_KEYWORD) {
        return new JackFieldKeywordImpl(node);
      }
      else if (type == FUNCTION) {
        return new JackFunctionImpl(node);
      }
      else if (type == FUNCTION_KEYWORD) {
        return new JackFunctionKeywordImpl(node);
      }
      else if (type == IF_FLOW) {
        return new JackIfFlowImpl(node);
      }
      else if (type == IF_KEYWORD) {
        return new JackIfKeywordImpl(node);
      }
      else if (type == INT) {
        return new JackIntImpl(node);
      }
      else if (type == INT_KEYWORD) {
        return new JackIntKeywordImpl(node);
      }
      else if (type == KEYBOARD_CLASS) {
        return new JackKeyboardClassImpl(node);
      }
      else if (type == LESS_THAN_OPERATOR) {
        return new JackLessThanOperatorImpl(node);
      }
      else if (type == LET_KEYWORD) {
        return new JackLetKeywordImpl(node);
      }
      else if (type == LIST_SEPARATOR) {
        return new JackListSeparatorImpl(node);
      }
      else if (type == MATH_CLASS) {
        return new JackMathClassImpl(node);
      }
      else if (type == MEMORY_CLASS) {
        return new JackMemoryClassImpl(node);
      }
      else if (type == METHOD) {
        return new JackMethodImpl(node);
      }
      else if (type == METHOD_KEYWORD) {
        return new JackMethodKeywordImpl(node);
      }
      else if (type == MINUS_OPERATOR) {
        return new JackMinusOperatorImpl(node);
      }
      else if (type == MORE_THAN_OPERATOR) {
        return new JackMoreThanOperatorImpl(node);
      }
      else if (type == NEW_KEYWORD) {
        return new JackNewKeywordImpl(node);
      }
      else if (type == NON_CODE) {
        return new JackNonCodeImpl(node);
      }
      else if (type == NOT_OPERATOR) {
        return new JackNotOperatorImpl(node);
      }
      else if (type == NULL_KEYWORD) {
        return new JackNullKeywordImpl(node);
      }
      else if (type == OBJECT_TYPE) {
        return new JackObjectTypeImpl(node);
      }
      else if (type == OPEN_BRACE) {
        return new JackOpenBraceImpl(node);
      }
      else if (type == OPEN_BRACKET) {
        return new JackOpenBracketImpl(node);
      }
      else if (type == OPEN_PARENTHESIS) {
        return new JackOpenParenthesisImpl(node);
      }
      else if (type == OPERATOR) {
        return new JackOperatorImpl(node);
      }
      else if (type == OR_OPERATOR) {
        return new JackOrOperatorImpl(node);
      }
      else if (type == OS_CLASS_TYPE) {
        return new JackOSClassTypeImpl(node);
      }
      else if (type == OUTPUT_CLASS) {
        return new JackOutputClassImpl(node);
      }
      else if (type == PARAMETER) {
        return new JackParameterImpl(node);
      }
      else if (type == PARAMETERS) {
        return new JackParametersImpl(node);
      }
      else if (type == PLUS_OPERATOR) {
        return new JackPlusOperatorImpl(node);
      }
      else if (type == PRIMITIVE_TYPE) {
        return new JackPrimitiveTypeImpl(node);
      }
      else if (type == PROPERTY) {
        return new JackPropertyImpl(node);
      }
      else if (type == RETURN_KEYWORD) {
        return new JackReturnKeywordImpl(node);
      }
      else if (type == RETURN_STATEMENT) {
        return new JackReturnStatementImpl(node);
      }
      else if (type == ROUTINE) {
        return new JackRoutineImpl(node);
      }
      else if (type == ROUTINE_BLOCK) {
        return new JackRoutineBlockImpl(node);
      }
      else if (type == ROUTINE_CALL) {
        return new JackRoutineCallImpl(node);
      }
      else if (type == ROUTINE_CALL_STATEMENT) {
        return new JackRoutineCallStatementImpl(node);
      }
      else if (type == ROUTINE_NAME) {
        return new JackRoutineNameImpl(node);
      }
      else if (type == SCREEN_CLASS) {
        return new JackScreenClassImpl(node);
      }
      else if (type == STATEMENT) {
        return new JackStatementImpl(node);
      }
      else if (type == STATEMENT_TERMINATOR) {
        return new JackStatementTerminatorImpl(node);
      }
      else if (type == STATIC_KEYWORD) {
        return new JackStaticKeywordImpl(node);
      }
      else if (type == STRING_CLASS) {
        return new JackStringClassImpl(node);
      }
      else if (type == STRING_OPERATOR) {
        return new JackStringOperatorImpl(node);
      }
      else if (type == SYS_CLASS) {
        return new JackSysClassImpl(node);
      }
      else if (type == THIS_KEYWORD) {
        return new JackThisKeywordImpl(node);
      }
      else if (type == TIMES_OPERATOR) {
        return new JackTimesOperatorImpl(node);
      }
      else if (type == TRUE_KEYWORD) {
        return new JackTrueKeywordImpl(node);
      }
      else if (type == TYPE) {
        return new JackTypeImpl(node);
      }
      else if (type == USER_CLASS_TYPE) {
        return new JackUserClassTypeImpl(node);
      }
      else if (type == VAR_KEYWORD) {
        return new JackVarKeywordImpl(node);
      }
      else if (type == VOID) {
        return new JackVoidImpl(node);
      }
      else if (type == VOID_KEYWORD) {
        return new JackVoidKeywordImpl(node);
      }
      else if (type == WHILE_FLOW) {
        return new JackWhileFlowImpl(node);
      }
      else if (type == WHILE_KEYWORD) {
        return new JackWhileKeywordImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
