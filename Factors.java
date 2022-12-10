Write a program to print all the factors of a number other than 1 and the number itself.
Input Format :
A single integer, n


import java.util.Scanner;
public class Solution {
    
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();

        int i=2;
        while(i<=n){
            if(n%i==0 && i !=n){
                System.out.print(i+ " ");
            }
            i++;
        }

        // for(int i=2;i<=n;i++){
        //     if(n%i==0){
        //         if(i!=n){
        //             System.out.print(i+" ");
        //         }
        //     }
        // }
    }
}
