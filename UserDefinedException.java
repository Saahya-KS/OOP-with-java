import java.util.*;

class WrongAgeException extends Exception
{
	private int age;
	private String errormessage;
	WrongAgeException(int x, String em)
	{
		age=x;
		errormessage=em;
	}
	public String toString()
	{
		String m = errormessage + "\nEnter valid age other than " +age;
		return m;
	}
}

class Father
{
	public int father_age;
	public Father(int a) throws WrongAgeException
	{	father_age=a;
		if(father_age<=0)
		{	
			throw new WrongAgeException(father_age,"Father's age cannot be zero or negative");
		}
	}
}

class Son extends Father
{
	public int son_age;
	public Son(int father_age, int s) throws WrongAgeException
	{	
		super(father_age);
		
		if(s<=0)
		{
			throw new WrongAgeException(s,"Son's age cannot be zero or negative");
		}

		else if(s >= father_age)
		{
			throw new WrongAgeException(s,"Son's age cannot be lesser than father's age");
		}
		else
		{
			son_age=s;
			System.out.println("Son's age assigned: "+son_age);
		}
	}
}

class UserDefinedException
{
	public static void main(String args[])
	{
		try
		{
			Scanner sc= new Scanner(System.in);
			System.out.print("Enter father's age: ");
			int f_age=sc.nextInt();
			System.out.print("Enter son's age: ");
			int s_age=sc.nextInt();

			Son s= new Son(f_age, s_age);
		}
		catch(Exception e)
		{
			System.out.println("Invalid Input "+e);
		}
	}
}
			