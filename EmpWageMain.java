public class EmpWageMain
{
	public static void main(String args[])
	{
		System.out.println("welcome in Emp wage problem");
		int fullTimeEmp=1;
                int empRatePerHour=20;
                int empHrs=0;
                int empWage=0;
		int partTime=2;
		int empCheck=(int)((Math.random()*10)%3);
		  if(fullTimeEmp == empCheck)
			{
                        empHrs=8;
			}
			else if(partTime==empCheck)
			{
			empHrs=4;
			}
			else
			empHrs=0;
                empWage=empHrs*empRatePerHour;
                System.out.println("employee wage: "+empWage);

	}
}
