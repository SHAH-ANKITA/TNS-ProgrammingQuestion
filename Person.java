
public class Person {
private String name;
private int income;
private float tax;
private String email;

public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}

public int getIncome() {
	return income;
}

public void setIncome(int income) {
	this.income = income;
}

public float getTax() {
	return tax;
}

public void setTax(float tax) {
	this.tax = tax;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

	

	@Override
public String toString() {
	return "Person [name=" + name + ", income=" + income + ", tax=" + tax + ", email=" + email + "]";
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Person p=new Person();
    p.toString();
   System.out.println(p);
	}

}

/*
 * 
 * 
 * 
 * */
