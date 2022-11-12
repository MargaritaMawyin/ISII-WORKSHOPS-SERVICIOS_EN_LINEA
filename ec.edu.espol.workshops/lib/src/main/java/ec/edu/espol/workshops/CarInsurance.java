package ec.edu.espol.workshops;

import java.util.Scanner;

import org.checkerframework.common.returnsreceiver.qual.This;

/**
 * Summary of JavaDoc will be here.
 *
 * @author KevinChevez, MargaritaMawyin, PedroBajana
 */
public class CarInsurance {

  /**
   * Static variable that contains the base of premium.
   */
  private static int BASE_PREMIUM = 500;

  /**
   * Main of the application, this main will be run.
   *
   * @param args Receive the arguments but this won't used.
   */
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Type your age");
    int age = getIntegerValue(sc);
    if(age == -1) {
      System.out.println("Input only number between 18 and 120");
      System.exit(age);
    }
    verifyLimitAge(age);
    
    System.out.println("Type your gender \n 0)Male \n 1)Female");
    int res = getIntegerValue(sc);
    if(res == -1) {
      System.out.println("Input only 0 or 1");
      System.exit(res);
    }
    verifyValuesInRange(res, 0, 1);
    char gender = res == 0 ? 'M' : 'F';
    
    System.out.println("What is your civil state? \n 0)single \n 1)married ");
    int valueObtained = getIntegerValue(sc);
    if(valueObtained == -1) {
      System.out.println("Input only 0 or 1");
      System.exit(valueObtained);
    }
    verifyValuesInRange(valueObtained, 0, 1);
    boolean married = valueObtained == 1;
    System.out.println(verify_business_rules(new Customer(age, gender, married)));

    sc.close();
  }
  
  /**
   * 
   * @return
   */
  public static int getIntegerValue(Scanner sc) {
    try {
      int value = sc.nextInt();
      return value;
    } catch (Exception e) {
      return -1;
    }
  } 
 
  /**
   * @param age
   */
  public static void verifyLimitAge(int age) {
    if(age<18 || age>=120) {
      System.out.println("Input only number between 18 and 120");
      System.exit(-1);
    }
  }
  
  /**
   * @param value
   * @param min
   * @param max
   */
  public static void verifyValuesInRange(int value, int min, int max) {
    if(value<min || value>max) {
      System.out.println("Input only "+min+" or "+max);
      System.exit(-1);
    }
  }

  /**
   * Static function which verify the rules of the business.
   *
   * @param customer Receive a Customer object to verify if the 
   * customer complies with the rules.
   * @return An integer with the amount of premium or -1 in error.
   */
  public static int verify_business_rules(Customer customer) {
    int premiumCar = BASE_PREMIUM;
    if (validatePolitics(customer)) {
      if (!customer.isMarried() && customer.isMale() && customer.ageLessThan(25)) {
        premiumCar += 1500;
      }
      if (!customer.isMale() || customer.isMarried()) {
        premiumCar -= 200;
      }
      if (customer.ageMoreThan(45) && customer.ageLessThan(65)) {
        premiumCar -= 100;
      }
      return premiumCar;
    } else {
      return -1;
    }
  }

  /**
   * Static function to validate if the Customer given as parameter complies with
   * the Politics of the company.
   *
   * @param customer The Customer object which will be validated.
   * @return True if it's OK, or false if the customer don't complies with the
   *         rules of the company.
   */
  public static boolean validatePolitics(Customer customer) {
    return customer.ageLessThan(80);
  }

}
