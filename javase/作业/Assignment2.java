/*
* Data type and operators assignment
*
*/



import java.util.Scanner;
import java.util.Scanner;
public class Assignment2 {
	public static void main(String[] args) {

		//homework 1
		//Scanner next, nextInt, nextDouble will only read in the string or int, but the \n will stilll be in the buffer
		/*System.out.println("Please input your name here:");
		Scanner input = new Scanner(System.in);
		String Name = (String) input.next();
		System.out.println("Please input your age here:");
		int age = input.nextInt();
		System.out.println("Please input your gender here:");
		String gender = input.next();
		System.out.println("The computer recorded that ：");
		System.out.println("Your nanme is：" + Name);
		System.out.println("Your age is：" + age);
		System.out.println("Your gender is：" + gender);*/


		//homework 2
		/*Scanner input = new Scanner(System.in);
		System.out.println("Please input the radius of the circle:");
		double radius = input.nextDouble();
		System.out.println("The radius of the circle is: R = " + radius);
		System.out.println("The perimeter of the circus is: c = 2 * 3.14 * " + radius + " = " + 2 * 3.14 * radius);
		System.out.println("The area of the circus is: s = 3.14 * " + radius + " * " + radius +  " = " + 3.14 * radius * radius);*/

		//homework 3
		/*int deposit = 10000;
		double flexible = 0.35 / 100;
		double threeFixed = 1.10 / 100;
		double halfYearFixed = 1.3 / 100;
		double oneYearFixed = 1.5 / 100;
		double twoYearFixed = 2.1 / 100;

		System.out.println("Your accound amount is: " + deposit);
		System.out.println("After 1 year flexbile saving, your accound amount will be: " + Math.round(deposit * (1 + flexible)));
		System.out.println("After 1 year fixed saving, your accound amount is: " + Math.round(deposit * (1 + oneYearFixed)));
		System.out.println("After 2 years flexbile saving, your accound amount is: " + Math.round(deposit * (1 + 2 * flexible)));
		System.out.println("After 2 years fixed saving, your accound amount is: " + Math.round(deposit * ( 1 + 2 * twoYearFixed)));*/

		//homework 4
		Scanner input = new Scanner(System.in);
		System.out.println("Please input a 4-digit number:");
		int number = input.nextInt();
        int bit4 = number / 1000;
        int bit3 = (number / 100) % 10;
        int bit2 = (number / 10) % 10;
        int bit1 = number % 10;

        //encrypt
        bit4 = (bit4 + 5) % 10;
        bit3 = (bit3 + 5) % 10;
        bit2 = (bit2 + 5) % 10;
        bit1 = (bit1 + 5) % 10;

        //swap
        int temp = bit4;
        bit4 = bit1;
        bit1 = temp;

        temp = bit2;
        bit2 = bit3;
        bit3 = temp;


        //if no (), the "+" sign will process the numbers as Strings, so just simply concatenation, no sum up
        System.out.println("The encrypted number is " + (bit4 * 1000 + bit3 * 100 + bit2 * 10 + bit1));
	}
}