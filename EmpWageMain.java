public class EmpWageMain
{
	public static void main(String args[])
	{
		System.out.println("welcome in Emp wage problem");
		int fullTimeEmp=1;
                int empRatePerHour=20;
                int empHrs=0;
                int empWage=0;
		int IS_PRESENT=1;
		int IS_ABSENT=0;
		int empCheck=(int)((Math.random()*10)%2);
		  if(fullTimeEmp == empCheck)
                        empHrs=8;
			else
			empHrs=0;
                empWage=empHrs*empRatePerHour;
                System.out.println("employee wage: "+empWage);
			
	}
}
