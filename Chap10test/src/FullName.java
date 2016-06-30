// Charles Carper
// 04.07.2014
// Chapter 10 – Cubed Class
// Utilizing the advantages of inheritance

public class FullName 
{	
	
	public String CompleteName;
//-----------------------------------------------------------concatText METHOD---------------------------------------------------------------------------------//
	/*concatenates full name message with the first and last name*/
	public String concatText(String firstName,String lastName)
	{
		
		return  "Full Name:      "  + firstName+lastName;
	}
	
//----------------------------------------------------------dspStringText METHOD---------------------------------------------------------------------------//
	/*Displays full name*/
	public void dspStringText(String CompleteName)
	{
		System.out.println(CompleteName);
	} 
	
}