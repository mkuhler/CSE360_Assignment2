// Name : 			Madison Kuhler
// Student ID : 	1205898599
// Class ID : 		LA8
// Description :	This class is an adding machine, which performs a select amount of algebraic operations. 
//  				It also keeps a record of all of the operations within a string, which can be printed using the toString method.

package cse360assign2;

public class AddingMachine {

	private int total;
	private String record;
	
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		record = "0";
	}
	
	public int getTotal () {
		return total;	// return the int "total" containing the sum of all operations
	}
	
	public void add (int value) {
		total += value;		// add the value to the total
		record = record.concat(" + " + value);	// Add the value and operation to the record
	}
	
	public void subtract (int value) {
		total -= value;		// subtract the value from the total
		record = record.concat(" - " + value);	// Add the value and operation to the record
	}
		
	public String toString () {
		return record;		// return the string "record", which contains all existing operations
	}

	public void clear() {
		record = "0";	// clear the existing record by setting it to 0
	}
}
