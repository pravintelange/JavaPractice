//Java Program to Generate Multiplication Table using for loop
package ProgramPractice50;

public class MultiplicationTable {

    public static void main(String[] args) {

       int num=2;
       for(int i=1;i<=10;i++) {
    	   System.out.printf("%d * %d = %d \n",num,i,num*i);
       }
    }
}