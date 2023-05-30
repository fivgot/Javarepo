package praktiskais4;

public class Newclass1
{
	private String clstring;
	private int clnumber;
	
	public Newclass1(String str, int intg)
	{
		str = getClstring();
		intg  = clnumber;
	}
	
	public int Getnumber()
	{
		return clnumber;
	}
	public String GetString()
	{
		return getClstring();
	}
	public void SetNumber(int number)
	{
		number = clnumber;
	}
	public void SetString(String str)
	{
		str = getClstring();
	}
	public void Printclassinfo(Newclass1 cl)
	{
		cl.Getnumber();
		cl.GetString();
	}

	public String getClstring() {
		return clstring;
	}

	public void setClstring(String clstring) {
		this.clstring = clstring;
	}

	public String addletter(String str1, String str2) {
		String newstring = str1 + str2;
		return newstring;
	}
	public static class CalcParameter {
		public int int1;
		public int int2;

		public CalcParameter(int int1, int int2) {
			this.int1 = int1;
			this.int2 = int2;
		}
	}
	public int calc(CalcParameter parameterObject)
	{
		int sum = parameterObject.int1+parameterObject.int2;
		return sum;
	}
	
}
