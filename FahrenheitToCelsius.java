// Given three values - Start Fahrenheit Value (S), End Fahrenheit value (E) and Step Size (W), you need to convert all Fahrenheit values from Start to End at the gap of W, into their corresponding Celsius values and print the table.
// Input Format :
// 3 integers - S, E and W respectively 
// Output Format :
// Fahrenheit to Celsius conversion table. One line for every Fahrenheit and corresponding Celsius value in integer form. The Fahrenheit value and its corresponding Celsius value should be separate by single space.
  
  
  import java.util.Scanner;
public class Solution {


	public static void main(String[] args) {
		
		int S, E, W, i;
		Scanner sc = new Scanner(System.in);
		S = sc.nextInt();
		E = sc.nextInt();
		W = sc.nextInt();
		while (S<=E){
			i=(((S-32)*5)/9);
			System.out.println(S+" "+i);
			S=S+W;

		}
		
	}

}
