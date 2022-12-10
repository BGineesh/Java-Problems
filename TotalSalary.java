// Write a program to calculate the total salary of a person. The user has to enter the basic salary (an integer) and the grade (an uppercase character), and depending upon which the total salary is calculated as -
//     totalSalary = basic + hra + da + allow – pf
    
    import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {

		int basic, allow=0;
		Scanner sc =new Scanner(System.in);
		basic=sc.nextInt();
	    char grade=sc.next().charAt(0);
	    double hra=(0.2*basic), da=(0.5*basic), pf=(0.11*basic), totalSalary;
		
	     if(grade=='A'){
		    allow=1700;
	    }
		else if(grade=='B'){
		    allow=1500;
	    }
	    else{
		   allow=1300;
	    }

	    totalSalary=basic+hra+da+allow-pf;
		
	    System.out.print(Math.round(totalSalary));

	}
}
