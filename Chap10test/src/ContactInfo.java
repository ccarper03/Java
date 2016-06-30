// Charles Carper
// 04.07.2014
// Chapter 10 – Cubed Class
// Utilizing the advantages of inheritance

public class ContactInfo extends MailingAddress 
{	
	
//--------------------------------------------------------------concatText METHOD------------------------------------------------------------------------------//
	/* accepts parameters, concatenates data and returns variable info*/
	public String concatText(String phoneNo,String email)
	{
		return  "Contact Info:     " + phoneNo + " - " + email;
		
	}
}
