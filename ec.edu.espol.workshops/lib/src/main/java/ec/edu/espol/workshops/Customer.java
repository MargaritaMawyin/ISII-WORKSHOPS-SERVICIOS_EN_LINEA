package ec.edu.espol.workshops;

public class Customer {
	private int age;
	private String gender;
	private String stateCivil;
	
	public Customer() {
		this.age = 18;
		this.gender = "Masculino";
		this.stateCivil = "Casado";
	}

	//Getters by Kevin
	public int getAge() {
		return this.age;
	}
	public String getGender() {
		return this.gender ;
	}
	public String getStateCivil() {
		return this.stateCivil;
	}
	
	//Setters by Margarita
	public void setAge(int age){
	   this.age=age;
	}
	public void setGender(String gender){
	   this.gender=gender;
	}
	public void setStateCivil(String stateCivil){
	   this.stateCivil=stateCivil;
	}

}
