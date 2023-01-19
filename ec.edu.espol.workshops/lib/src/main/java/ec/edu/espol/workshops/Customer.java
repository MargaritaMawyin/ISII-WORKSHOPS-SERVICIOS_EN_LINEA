package ec.edu.espol.workshops;

/**
 * Summary of JavaDoc will be here.
 *
 * @author KevinChevez, MargaritaMawyin, PedroBajana
 */
public class Customer {
  private int age;
  private char gender;
  private boolean stateCivil;

  /**
   * Summary of JavaDoc will be here.
   *
   * @param age Description will be here.
   * @param gender Description will be here.
   * @param stateCivil Description will be here.
   */
  public Customer(int age, char gender, boolean stateCivil) {
    this.age = age;
    this.gender = gender;
    this.stateCivil = stateCivil;
  }

  public boolean getStateCivil() {
    return this.stateCivil;
  }

  // Functions for Customer
  public boolean isMarried() {
    return this.getStateCivil();
  }

  public boolean isMale() {
    return (this.gender == 'M');
  }

  public boolean ageLessThan(int age) {
    return (this.age < age);
  }

  public boolean ageMoreThan(int age) {
    return (this.age > age);
  }
}
