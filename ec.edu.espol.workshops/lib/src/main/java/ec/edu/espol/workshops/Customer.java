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

  // Getters by Kevin
  public int getAge() {
    return this.age;
  }

  public char getGender() {
    return this.gender;
  }

  public boolean getStateCivil() {
    return this.stateCivil;
  }

  // Setters by Margarita
  public void setAge(int age) {
    this.age = age;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public void setStateCivil(boolean stateCivil) {
    this.stateCivil = stateCivil;
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
