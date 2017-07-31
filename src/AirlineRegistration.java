// Copyright Wintriss Technical Schools 2013
import javax.swing.JOptionPane;

/**
 * Airline registration 
 * 
 * You are writing a program for a new airline to take their registration information at the check-in counter
 * and print their boarding pass. You need to collect the following information: 
 * 		First name 
 * 		Last name
 * 		Destination airport 
 * 		Birthday (for security purposes) 
 * 		Male/female (for security purposes) 
 * 
 * Print the boarding pass in this format:
 * LAST NAME / FIRST NAME (BIRTHDAY, M/F) 
 * Traveling to: DESTINATION
 * 
 * Toolbox: main() method, JOptionPane.showInputDialog, variables
 * 
 **/
public class AirlineRegistration {
public static void main(String[] args) {
	

String fn=JOptionPane.showInputDialog("First name");
String ln=JOptionPane.showInputDialog("Last name");
String d=JOptionPane.showInputDialog("Distination");
String bd=JOptionPane.showInputDialog("Birthday");
String mf=JOptionPane.showInputDialog("Male/Female");
System.out.println(fn+" "+ln+" "+d+" "+bd+" "+mf);
JOptionPane.showConfirmDialog(null,fn+" "+ln+" "+ d+" "+bd+" "+mf );

}

}



/**Extra Difficult Challenge: have the program repeat until plane is full (10 passenger plan) and print out the number of passengers after each boarding pass.
*/
