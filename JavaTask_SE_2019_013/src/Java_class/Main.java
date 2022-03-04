package Java_class;

import java.awt.*;
import java.util.Scanner;


public class Main {
    //function for summation
    public static double sum(double num1, double num2){
        double sum = num1+num2;
        return sum;
    }
    //function for difference
    public static double difference(double num1,double num2){
        double diff = num1-num2;
        return diff;
    }
    //function for multiplication
    public static double multiplication(double num1,double num2){
        double multi = num1*num2;
        return multi;
    }
    //function for division
    public static double division(double num1,double num2){
        double divi = num1/num2;
        return  divi;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num1,num2,result=0;
        int operator;

        System.out.println("Hello!\n------------------------\nWhat do you want to do?");
        System.out.println("Press number 1 for sum\nPress number 2 for difference\nPress number 3 for multiplication\nPress number 4 for division");
        operator = sc.nextInt();
        System.out.println("Enter the first number  : ");
        num1 = sc.nextDouble();
        System.out.println("Enter the second number : ");
        num2 = sc.nextDouble();

        switch (operator) {
            case 1:
                result = sum(num1, num2);
                break;
            case 2:
                result = difference(num1, num2);
                break;
            case 3:
                result = multiplication(num1, num2);
                break;
            case 4:
                result = division(num1, num2);
                break;
            default:
                System.out.println("Invalid Operator");
        }
        System.out.println("The answer is " + result);


        sc.close();
    }




}



