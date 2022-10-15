package ec.edu.espol.workshops;

public class Customer {
	private int age;
	private char gender;
	private boolean stateCivil;
	
	public Customer() {
		this.age = 18;
		this.gender = 'M';
		this.stateCivil = false;
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

	public boolean isMarried() {
		return this.getStateCivil();
	}
	
	public boolean isMale() {
		return (this.gender == 'M');
	}
	
	public boolean ageLessThan(int age) {
		return (this.age < age);
	}
}
