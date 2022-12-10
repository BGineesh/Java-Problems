Write a program to print multiplication table of n
Input Format :
A single integer, n
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int n, i=1, v;
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		
		// while(i<=10){
		// 	v=n*i;
		// 	System.out.println(v);
		// 	i++;
		// }
		
		for(i=1;i<=10;i++){
			v=n*i;
			System.out.println(v);
			
		}
	}
}
