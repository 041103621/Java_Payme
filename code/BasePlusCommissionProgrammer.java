/**
modified: Liu Siqian, 041103621
Course: CST8284
Assignment: lab6
Date: Mar 16, 2024
**/

// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!


//BasePlusCommissionProgrammer.java
//BasePlusCommissionProgrammer class extends CommissionProgrammer.

public class BasePlusCommissionProgrammer extends CommissionProgrammer { 

private double baseSalary; // base salary per week

//constructor
public BasePlusCommissionProgrammer(String firstName, String lastName, 
String socialSecurityNumber,double grossSales, double commissionRate, double baseSalary) {
super(firstName, lastName, socialSecurityNumber, grossSales, commissionRate);

if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
}

//set base salary
public void setBaseSalary(double baseSalary) {
if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
} 

//return base salary
public double getBaseSalary() {
return baseSalary;
}

//calculate earnings; override method earnings in CommissionProgrammer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

@Override                                                            

public double getPaymentAmount() {
	
	return getBaseSalary() + super.getPaymentAmount();
}
//return String representation of BasePlusCommissionProgrammer object
@Override     
                                                      
//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
// INSERT YOUR CODE
//END
public String toString() {
	
	//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
	//START     
	// INSERT YOUR CODE
	//END
	
return String.format("base-plus commission Programmer: %s %s\n"
		+ "social security number: %s\n"
		+ "gross sales: $%.2f; commission rate: $%.2f\n"
		+ "base salary: $%.2f",
		//+ "new base salary with 5% increase is: $%.2f\n"
		//+ "payment due: $%.2f\n", 
		getFirstName(), getLastName(), 
		getSocialSecurityNumber(),
		getGrossSales(), getCommissionRate(), 
		getBaseSalary()); 
}

}



