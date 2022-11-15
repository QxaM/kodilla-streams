package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.*;
import com.kodilla.stream.reference.FunctionalCalculator;

import static java.lang.Character.*;

public class StreamMain {
    public static void main (String[] args){
        System.out.println("Welcome to module 7 - Stream");

        SaySomething saySomething = new SaySomething();
        saySomething.say();

        Processor processor = new Processor();
        ExecuteSaySomething executeSaySomething = new ExecuteSaySomething();
        processor.execute(executeSaySomething);

        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);
        processor.execute(()->System.out.println("This is an example text."));

        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculate expressions with lambdas");
        expressionExecutor.executeExpression(10,5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10,5, (a, b) -> a / b);

        System.out.println("Calculate expressions with method references");
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3,4, FunctionalCalculator::divideAByB);

        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beautify("test text", (s) -> "ABC" + s + "ABC");
        poemBeautifier.beautify("test text", String::toUpperCase);
        poemBeautifier.beautify("test text", (s) -> s.replace(' ', '*'));
        poemBeautifier.beautify("test text", (s) -> {
            char[] textArray = s.toCharArray();
            for(int i=0; i< textArray.length-1; i++) {
                if (i % 2 == 0) {
                    if (!isLetter(textArray[i])) {
                        continue;
                    }
                    if (isLowerCase(textArray[i])) {
                        textArray[i] = toUpperCase(textArray[i]);
                    }
                } else {
                    if (!isLetter(textArray[i])) {
                        continue;
                    }
                    if (isUpperCase(textArray[i])) {
                        textArray[i] = toLowerCase(textArray[i]);
                    }
                }
            }
            s = String.valueOf(textArray);
            return s;
        });

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}
