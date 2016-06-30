// Charles Carper
// 04.07.2014
// Chapter 10 – Cubed Class
// Utilizing the advantages of inheritance

import java.util.Scanner;
public class Chap10test 
{
//-------------------------------------------------------------MAIN METHOD-------------------------------------------------------------------------------//
/*declare all variables, populate them null,have user input data,point to fullname class and call on concatext and dspStringtext
point to mailingaddress class and call concatext and dspStringtext
point to the contact info class and call concatext and dspstringtext ... when compiler can't find dspstringtext in info class it will default to the next class 
close keyboard and skip a line and display end program message
*/
	public static void main(String[] args) 
	{
		String firstName = null, lastName = null, CompleteName = null, address = null, city = null, state = null, zipCode = null, addCityStZip = null, phoneNo = null, email = null, info = null;
		Scanner keyBoard = new Scanner(System.in);
		System.out.println("Enter your First Name: ");
		firstName =  keyBoard.nextLine(); 
		System.out.println("Enter your Last Name: ");
		lastName =  keyBoard.nextLine(); 
		System.out.println("Enter your Address: ");
		address =  keyBoard.nextLine();
		System.out.println("Enter your City: ");
		city =  keyBoard.nextLine();
		System.out.println("Enter your State: ");
		state =  keyBoard.nextLine();
		System.out.println("Enter your Zip Code: ");
		zipCode =  keyBoard.nextLine();
		System.out.println("Enter your Phone Number: ");
		phoneNo =  keyBoard.nextLine();
		System.out.println("Enter your Email Address: ");
		email =  keyBoard.nextLine();
		
		FullName fullNamePointer  = new FullName();
		CompleteName = fullNamePointer.concatText(firstName, lastName);
		fullNamePointer.dspStringText(CompleteName);
		
		MailingAddress addressPointer = new MailingAddress();
		addCityStZip = addressPointer.concatText(address,city,state,zipCode);
		addressPointer.dspStringText(addCityStZip);
		
		ContactInfo contactInfoPointer = new ContactInfo();
		info = contactInfoPointer.concatText(phoneNo,email);
		contactInfoPointer.dspStringText(info);
		
		keyBoard.close();
      	System.out.println();
      	System.out.println("End of Program.");
		 
	}

}