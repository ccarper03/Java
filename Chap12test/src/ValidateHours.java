
public class ValidateHours extends Exception
{
	public ValidateHours()
	{
		super("HOURS WORKED NOT VALID");
	}
	public ValidateHours(String myMessage)
	{
		super(myMessage);
	}
	
}
