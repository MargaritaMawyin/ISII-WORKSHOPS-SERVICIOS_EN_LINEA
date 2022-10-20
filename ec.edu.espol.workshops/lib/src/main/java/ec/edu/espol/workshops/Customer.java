package ec.edu.espol.workshops;

import javax.naming.directory.NoSuchAttributeException;

public class Customer {
	private int age;
	private char gender;
	private boolean stateCivil;
	
	public Customer() {

		int age;
		String gender;
		String stateCivil;

		this.age = 18;
		this.gender = 'M';
		this.stateCivil = false;
	}
	public Customer(int age, char gender, boolean stateCivil) {
		this.age = age;
		this.gender = gender;
		this.stateCivil = stateCivil;
	}


	//Getters by Kevin
	public int getAge() {
		return this.age;
	}
	public char getGender() {
		return this.gender ;
	}
	public boolean getStateCivil() {
		return this.stateCivil;
	}
	
	//Setters by Margarita
	public void setAge(int age){
	   this.age=age;
	}
	public void setGender(char gender){
	   this.gender=gender;
	}
	public void setStateCivil(boolean stateCivil){
	   this.stateCivil=stateCivil;
	}
    //Functions for Customer
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
