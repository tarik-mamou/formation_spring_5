package spel.programmation;

import org.springframework.expression.EvaluationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.expression.spel.support.StandardEvaluationContext;
import spel.Cours;

public class JavaPur {

    public static void main(String[] args) {
        Cours cours = new Cours("francais");
        EvaluationContext context = new StandardEvaluationContext(cours);

        ExpressionParser expressionParser = new SpelExpressionParser();
        Expression expression = expressionParser.parseExpression("nom");
        String integer = (String) expression.getValue(context);
        System.out.println(integer);
    }
}
