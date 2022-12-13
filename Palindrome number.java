Write a program to determine if given number is palindrome or not. Print true if it is palindrome, false otherwise.
  
Palindrome are the numbers for which reverse is exactly same as the original one. For eg. 121
  
  
 
  
 import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		int n;
		try(Scanner sc = new Scanner(System.in)){
			n=sc.nextInt();
		}
		int l=n;
		int i=0;
		while(n>0){
			int j=n%10;
			i=(i*10)+j;
			n=n/10;
		}
		if(l==i){
			System.out.print("true");
		}
		else{
			System.out.print("false");
		}
	}
}
