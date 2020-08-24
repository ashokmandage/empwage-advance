public class EmpWageMain
  {
		public static final int IS_FULL_TIME=1;
                public static final int IS_PART_TIME=2;
                public static final int EMP_RATE_PER_HOUR=20;
                 public static final int NUMBER_WORKING_DAYS=20;
        public static void main(String args[])
        {
                EmpWageMain empwagewhile=new EmpWageMain();
                empwagewhile.calculate20wage();
        }
        public void calculate20wage()
        {
                int empHrs;
                int empWage;
                int totalEmpWage=0;
                int totalMaxEmpHrs=100;
                int totalHrs=0;
                int totalWorkingDays=0;
        while(totalHrs<=totalMaxEmpHrs && totalWorkingDays<=NUMBER_WORKING_DAYS)
        {
                totalWorkingDays++;
                  int randomCheck=(int)((Math.random()*10)%3);

                 switch(randomCheck)
                {
                        case IS_PART_TIME:
                        empHrs=4;
                        break;

                        case IS_FULL_TIME:
                        empHrs=8;
                        break;

                        default:
                                empHrs=0;
                }
                   totalHrs=totalHrs+empHrs;

                }
                totalEmpWage=totalHrs*EMP_RATE_PER_HOUR;
                System.out.println("employee total hours: "+totalHrs);

                System.out.println("totalwage: "+totalEmpWage);
	}
}
