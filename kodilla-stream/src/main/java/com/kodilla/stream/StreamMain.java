package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.Executor;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.Processor;
import com.kodilla.stream.reference.FunctionalCalculator;

public class StreamMain {
    public static void main(String[] args) {

        //module 7
        System.out.println("----------MODULE 7----------");
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        expressionExecutor.executeExpression(5, 10, (a, b) -> a + b);
        expressionExecutor.executeExpression(5, 10, (a, b) -> a - b);
        expressionExecutor.executeExpression(5, 10, (a, b) -> a * b);
        expressionExecutor.executeExpression(5, 10, (a, b) -> a / b);

        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

        // task 7.1
        System.out.println("----------TASK 7.1----------");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("example", text -> "ABC" + text);
        poemBeautifier.beautify("example2", text -> text.toUpperCase());
        poemBeautifier.beautify("EXAMPLE3", text -> text.toLowerCase());
        poemBeautifier.beautify("example4", text -> text.subSequence(3,6).toString());
    }
}
