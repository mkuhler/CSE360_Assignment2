// Name : 			Madison Kuhler
// Student ID : 	1205898599
// Class ID : 		LA8
// Description :	This class is used to test the AddingMachine class. 

package cse360assign2;

public class TestMachine {

	public static void main(String[] args) {
		AddingMachine testMachine = new AddingMachine();
		
		// Test initial value and getTotal
		System.out.println("The initial value is: " + testMachine.getTotal());
		
		//Test add method
		testMachine.add(7);
		System.out.println("0 + 7 = " +  testMachine.getTotal());
		
		// Test subtract method
		testMachine.subtract(3);
		System.out.println("7 - 3 = " +  testMachine.getTotal());
		
		// Test toString Method
		System.out.println("The toString method prints: " + testMachine.toString());
		
		// Test clear Method
		testMachine.clear();	// clear the existing record and reset to 0
		
		testMachine.add(4);
		testMachine.subtract(2);
		testMachine.add(5);
		System.out.println("The toString method prints: " + testMachine.toString());
	}

}
