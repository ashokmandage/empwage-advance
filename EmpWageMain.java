public class EmpWageMain
{
	public static void main(String args[])
	{
		System.out.println("welcome in Emp wage problem");
		int IS_PRESENT=1;
		int IS_ABSENT=0;
		int empCheck=(int)((Math.random()*10)%2);
		if(empCheck == IS_PRESENT)
		{
			System.out.println("Employee is present");
		}
		else
		{
			System.out.println("Employee is absent");
		}
	}
}
