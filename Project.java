/*
Name: Gavin Geiger
Date: 9-6-24
Description: The Code Grabs User Input Of Two Numbers And Completes 5 Math Equasions Of Those Numbers Using Different Operations
*/

import java.util.Scanner;
public class Project
{
    public static void main (String [] args)
    {
        //Tells The User The Meaning/Function Of The Program
        System.out.println("This Program Will Complete Math Operations Based On The Numbers You Input");
        
        //Declares int Variables And Sets Them Equal To What The User Inputs
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter Your First Number: ");
        int one = sc.nextInt();
        System.out.print("Please Enter Your Second Number: ");
        int two = sc.nextInt();
        
        //Uses Different Math Operations From User Input And Displays Them With Text
        System.out.println("Your Answer Using Addition With The Two Numbers " + (one+two));
        System.out.println("Your Answer Using Subtraction With The Two Numbers " + (one-two));
        System.out.println("Your Answer Using Multiplication With The Two Numbers " + one*two);
        System.out.println("Your Answer Using Division With The Two Numbers " + one/two);
        System.out.println("Your Answer Using The Mod Operator With The Two Numbers " + one%two);
    }
}