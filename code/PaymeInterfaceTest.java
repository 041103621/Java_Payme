/**
modified: Liu Siqian, 041103621
Course: CST8284
Assignment: lab6
Date: Mar 16, 2024
**/
// LAB 6: PaymeInterfaceTest.java

//This is the test for your interface Payme.

public class PaymeInterfaceTest  {

public static void main(String[] args) {
	
 //TO DO: IN THIS PORTION OF THE CODE, SEVERAL CHANGES SHOULD BE MADE:
// CREATE SIX-ELEMENTS Payme array HERE 
	
 //START CODE 
	Payme[] paymeObjects = new Payme[6];
//END CODE
 

// TO DO: POPULATE THE ARRAY YOU CREATED WITH OBJECTS THAT IMPLEMENT Payable
//CHECK THE OUTPUT FILE AND REUSE EXACTLY THE DETAILS PROVIDED SUCH AS FIRST NAME
// LAST NAME, SOCIAL INSURANCE NUMBER, ETC.

 // START CODE
	paymeObjects[0] = new Invoice("22776", "brakes", 3, 300);
	paymeObjects[1] = new Invoice("33442", "gear", 5, 90.99);
	paymeObjects[2] = new SalariedProgrammer("Chioma", "Chidimma", "345-67-0001", 320);
	paymeObjects[3] = new HourlyProgrammer("Amara", "Chukwu", "234-56-7770", 18.95, 40);
	paymeObjects[4] = new CommissionProgrammer("Peter", "Goodman", "123-45-6999", 16500, 0.44);
	paymeObjects[5] = new BasePlusCommissionProgrammer("Siqian", "Liu", "623-45-6949", 1200, 0.44, 720); //Use my name 
// END CODE


 System.out.println(
    "Payment for Invoices and Programmers are processed polymorphically:\n"); 

 // generically process each element in array paymeObjects
 
 for (Payme currentPayme : paymeObjects) {
    // output currentPayme and its appropriate payment amount
    System.out.printf("%s \n\n", currentPayme.toString()); 
       
    if (currentPayme instanceof BasePlusCommissionProgrammer) {
       // downcast Payme reference to 
       // BasePlusCommissioProgrammer reference
    	BasePlusCommissionProgrammer programmer = 
          (BasePlusCommissionProgrammer) currentPayme;
       programmer.toString();
       double oldBaseSalary = programmer.getBaseSalary();
       programmer.setBaseSalary(1.05 * oldBaseSalary);
       System.out.printf(
          "new base salary with 5%% increase is: $%.2f\npayment due: $%.2f\n", 
          programmer.getBaseSalary(), programmer.getPaymentAmount());
    } 

 }
}
}


