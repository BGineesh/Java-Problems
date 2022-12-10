Write a program to input an integer N and print the sum of all its even digits and sum of all its odd digits separately.
Digits mean numbers, not the places! That is, if the given integer is "13245", even digits are 2 & 4 and odd digits are 1, 3 & 5.
Input format :
 Integer N
 
 import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		int n, tN=0, tO=0;

		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n!=0){
			int value=n%10;
			if(value%2==0){
			tN+=value;
			}
		   if(value%2!=0){
			tO+=value;
			}
			n=(int)(n/10);
		}
		System.out.println(tN+" "+tO);
	}
}
