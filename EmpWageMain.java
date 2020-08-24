public class EmpWageMain
 {
		public static final int IS_FULL_TIME=1;
                public static final int IS_PART_TIME=2;
                public static final int EMP_RATE_PER_HOUR=20;
                public static final int NUMBER_WORKING_DAYS=20;
        public static void main(String args[])
        {
                EmpWageMain switchcase=new EmpWageMain();
                switchcase.calculate20wage();
        }
        public void calculate20wage()
        {
                int empHrs;
                int empWage;
                int totalEmpWage=0;
        for(int day=1;day<=NUMBER_WORKING_DAYS;day++)
        {
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
                empWage=empHrs*EMP_RATE_PER_HOUR;
                totalEmpWage=totalEmpWage+empWage;
                System.out.println("emloyee wage: "+empWage);

                }
                System.out.println("totalwage: "+totalEmpWage);

	}
}
