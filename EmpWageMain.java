public class EmpWageMain
   {
	 public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;

        private final String company;
        private final int empRatePerHour;
        private final int numOfWorkingDays;
        private final int maxHoursPerMonth;

        public EmpWageMain(String company, int empRatePerHour,
                              int numOfWorkingDays, int maxHoursPerMonth)
        {
                this.company = company;
                this.empRatePerHour = empRatePerHour;
                this.numOfWorkingDays = numOfWorkingDays;
                this.maxHoursPerMonth = maxHoursPerMonth;
        }
        private int computeEmpWage()
        {
         int empHrs = 0, totalEmpHrs = 0,totalWorkingDays = 0;
          while(totalEmpHrs <= maxHoursPerMonth && totalWorkingDays < numOfWorkingDays)
        {
                totalWorkingDays++;
                  int empCheck = (int)((Math.random()*10)%3);

                 switch(empCheck)
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
                   totalEmpHrs += empHrs;

       System.out.println("Day#: " + totalWorkingDays + " Emp Hr: "  +empHrs);

        }
        return totalEmpHrs * empRatePerHour;
     }

        public static void main(String args[])
        {
        EmpWageMain dMart = new EmpWageMain("DMart",20,2,10);
        EmpWageMain bigBasket = new EmpWageMain("BigBasket",25,2,15);
        System.out.println("Total Emp Wage for company: " +dMart.company + " is: " + dMart.computeEmpWage());
        System.out.println("Total Emp Wage for company: " +bigBasket.company + " is: " + bigBasket.computeEmpWage());
	}
}
