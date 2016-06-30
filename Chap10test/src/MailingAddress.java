// Charles Carper
// 04.07.2014
// Chapter 10 – Cubed Class
// Utilizing the advantages of inheritance

public class MailingAddress extends FullName 
{
		
//----------------------------------------------------------------concatText METHOD----------------------------------------------------------------------------//
		/*concatenates data and returns it in the variable addCityStZip*/
		public String concatText(String address,String city,String state,String ZipCode)
		{
			return "Mailing address:     " + address + " - " + city + " " + state + ZipCode;
		}
		
//-------------------------------------------------------------------dspMailingAddress METHOD-------------------------------------------------------------------------//
		/*displays city State and zip*/
		public void dspMailingAddress(String addCityStZip)
		{
			System.out.println(addCityStZip);
		}
		
}