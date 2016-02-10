package com.company;

import java.util.Scanner;

/**
 * http://topjavatutorial.com/category/java-quiz
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Select menu:");
        System.out.println("1 - Quiz 1");
        System.out.println("2 - Quiz 2");
        System.out.println("3 - Quiz 3");
        System.out.println("4 - HashSet size");
        System.out.println("5 - Test equals");
        System.out.println("6 - Test lambda func");
        System.out.println("7 - Test char");
        System.out.println("8 - Loop int");

        System.out.println("11 - multiple overloading");
        System.out.println("14 - foreach");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                JavaOperator.printXY();
                break;
            case 2:
                JavaOperator.printSuccess();
                break;
            case 3:
                JavaOperator.printFinally();
                break;
            case 4:
                JavaOperator.printSizeHashSet();
                break;
            case 5:
                Name.testEquals();
                break;
            case 6:
                JavaOperator.printLabmda();
                break;
            case 7:
                JavaOperator.testCharacter();
                break;
            case 8:
                JavaOperator.loopingIntegers();
                break;
            case 11:
                Quizz11.test();
                break;
            case 14:
                Quiz14.forEachTest();
                break;
            default:
                System.out.println("Finished");
        }
    }
}
