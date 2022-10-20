package ec.edu.espol.workshops;

import java.util.Scanner;


public class CarInsurance {
	
	public static int BASE_PREMIUM = 500; 

	public static void main(String[] args) {
		Customer customer = new Customer();
		Scanner sc = new Scanner(System.in);
		System.out.println("Type your age");
		int age = sc.nextInt();
		System.out.println("Type your gender \n 0)Male \n 1)Female");
		int res = sc.nextInt();
		char gender = res == 0 ? 'M': 'F';
		System.out.println("What is your civil state? \n 0)single \n 1)married ");
		boolean married = sc.nextInt()==1;
		Customer customer2 = new Customer(age, gender, married) ;
		verify_business_rules(customer2);
		System.out.println(verify_business_rules(customer2));
	}
	public static int verify_business_rules(Customer customer) {
		int premium_car = 500;
		if (validatePolitics(customer)) {
			
			if (!customer.isMarried() && customer.isMale() && customer.ageLessThan(25)) {
				premium_car += 1500;
			}
			else if (!customer.isMale() || customer.isMarried()) {
				premium_car -= 200;
			} 
			else if(customer.ageMoreThan(45) && customer.ageLessThan(65)){
				premium_car -= 100;
			}
			return premium_car;
		}
		else {
			return -1;
		}
	}
	
	public static boolean validatePolitics(Customer customer) {
		 return customer.ageLessThan(80);
	}
	
	

}
