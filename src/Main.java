import java.awt.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);

        boolean con = true;
        boolean concon = true;
        while (con) {
            while (concon) {
                System.out.println("Choose problem number from 1-10");
                int selected = scan.nextByte();
                switch (selected) {
                    case (1):
                        // 5
                        // 10 1 32 3 45
                        System.out.println("Task is :\n" +
                                "You are given a number “n” and an array of “n” elements,\n" +
                                "write the function that returns minimum of them.\n" +
                                "Please enter size of array:");
                        float number1 = scan.nextByte();
                        float[] array1 = new float[(int) number1];
                        System.out.println("Please enter numbers ");
                        for (int i = 0; i < number1; i++) {
                            array1[i] = Float.parseFloat(scan.next());
                        }
                        Problem1 problem1 = new Problem1();
                        System.out.println("Minimal number is => " + problem1.findminimum(array1, number1));
                        concon=false;
                        break;
                    case (2):
                        // 4
                        // 3 2 4 1
                        System.out.println("You are given a number “n” and an array of “n” elements,\n" +
                                "write the function that returns average of them.\n" +
                                "Please enter size of array: (also not natural like '2.5' )");
                        float number2 = scan.nextFloat();
                        float[] array2 = new float[(int) number2];
                        System.out.println("Please enter your numbers:");
                        for (int i = 0; i < number2; i++) {
                            array2[i] = Float.parseFloat(scan.next());
                        }
                        Problem2 problem2 = new Problem2();
                        System.out.println("Your average number is => " + problem2.findaverage(array2, number2));
                        concon=false;
                        break;
                    case (3):
                        //7
                        //10
                        System.out.println("You are given a number “n”, write the function for checking\n" +
                                "whether“n” is prime.\n" +
                                "Please enter the number for checking: (only natural numbers)");
                        int number3 = scan.nextByte();
                        Problem3 problem3 = new Problem3();
                        System.out.println("Your number is " + problem3.findifitisprime(number3));
                        concon=false;
                        break;
                    case (4):
                        //5
                        System.out.println("You are given a number “n”, write the program using recursion for\n" +
                                "finding n! \n" +
                                "Please enter your number, but you can not type negative number. It is not possible to solve factorial of negative number or not natural: ");
                        int number4 = scan.nextByte();
                        Problem4 problem4 = new Problem4();
                        System.out.println("Factorial is equal to => " + problem4.findFactorial(number4));
                        concon=false;
                        break;
                    case (5):
                        // 5 = 5
                        // 17 = 1597
                        System.out.println("You are given a number “n”, write the function for finding n-th\n" +
                                "elements in Fibonacci sequence using recursion. (Fn = Fn-1+ Fn-2).\n" +
                                "F0= 0, F1 = 1.\n" +
                                "Please enter your number(only natural): ");
                        int number5 = scan.nextInt();
                        Problem5 problem5 = new Problem5();
                        System.out.println(" Answer is => " + problem5.findFibanacci(number5));
                        concon=false;
                        break;
                    case (6):
                        // 2
                        // 10
                        // 1024
                        System.out.println("You are given numbers “a” and “n”, write the function that\n" +
                                "returns “a^n”.\n" +
                                "Please enter your number: ");
                        int number = scan.nextInt();
                        System.out.println("Please enter next number: ");
                        int power = scan.nextInt();
                        Problem6 problem6 = new Problem6();
                        System.out.println("Answer is => " + problem6.findPower(number, power));
                        concon=false;
                        break;
                    case (7):
                        //4
                        //1 4 6 2
                        //2 6 4 1
                        System.out.println("You are given a number “n” and an array of “n” elements,\n" +
                                "write the program that returns given array in reverse order\n" +
                                "without using array data structure.\n" +
                                "(Hint: recursion)\n" +
                                "Please enter first number:");
                        int repeat = scan.nextInt();
                        Problem7 problem7 = new Problem7();
                        problem7.reverseArray(repeat);
                        concon=false;
                        break;
                    case (8):
                        //123456 yes
                        //123a12 no
                        System.out.println("You are given a string “s”, write the function for checking\n" +
                                "whether “s” is all consists of digits.\n" +
                                "Please enter your String: ");
                        String str = scan.next();
                        Problem8 problem8 = new Problem8();
                        problem8.onlyNumberChecker(str);
                        concon=false;
                        break;
                    case (9):
                        // 2 1 = 2
                        // 7 3 = 35
                        System.out.println("You are given numbers“n” and “k”,write the program that\n" +
                                "finds Cn^k (binomial coefficient) using formula\n" +
                                "Cn^k=Cn−1^(k−1)+Cn−1^k where Cn^0=Cn^n=1.\n" +
                                "and please enter your 'n': ");
                        int numberN = scan.nextInt();
                        System.out.println("Enter your 'k': ");
                        int numberK = scan.nextInt();
                        Problem9 problem9 = new Problem9();
                        System.out.println("binomial coefficient => " + problem9.rec(numberN, numberK));
                        concon=false;
                        break;
                    case (10):
                        // 32 48 = 16
                        // 10 7 = 1
                        System.out.println("You are given “a” and “b”, write the function for finding\n" +
                                "GCD(a, b) using recursion. (Hint: Euclidean Algorithm)\n" +
                                "Please enter 'a': ");
                        int numberA = scan.nextInt();
                        System.out.println("Enter 'b': ");
                        int numberB = scan.nextInt();
                        Problem10 problem10 = new Problem10();
                        System.out.println("GCD is => " + problem10.findgcd(numberA, numberB));
                        concon=false;
                        break;
                    default:
                        System.out.println("Wrong, please enter correctly: ");
                        selected = scan.nextInt();
                        concon = true;
                }
            }

            boolean answerb=true;
            while (answerb) {
                System.out.println("\n Continue ? Y/N :");
                String answer = scan.next();
                switch (answer) {
                    case ("Y"):
                        concon=true;
                        answerb=false;
                        break;
                    case ("N"):
                        con = false;
                        answerb=false;
                        System.out.println("Exit");
                        break;
                    default:
                        System.out.println("Wrong format\n" +
                                "try again: ");
                }
            }
        }
    }
}
