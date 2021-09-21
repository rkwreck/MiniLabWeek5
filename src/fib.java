package com.example.spring_portfolio.minilabs;
import java.util.Scanner;

public class fib {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Fibonaaci. How many numbers of the Fibonacci sequence do you need?");
        String fib = input.nextLine();

        int fnum = Integer.parseInt(fib);
        int num1 = 0, num2 = 1;        //initialize sequence
        int count = 0;

        while (count < fnum) {

            System.out.println(num1 + " ");  //print the number

            int num3 = num2 + num1;   //swap
            num1 = num2;
            num2 = num3;
            count = count + 1;
        }

        int next = count + 1;
        System.out.print("It took " + count + " iterations of the while loop. ");
        System.out.print("The " + next + " number of the Fibonacci sequence is " + num1 + ".");  //print output

    }
}
