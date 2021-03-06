

//emp Present Absent code
public class empPresentAbsent
{
        public static void main(String[] args)
        {
                int isPresent=1;
                double empCheck=Math.floor(Math.random() * 10) % 2;
                //System.out.println("randome value: "+Math.random());
                if (empCheck == isPresent)
                {
                        System.out.println("Employee is present");
                }
                else
                {
                        System.out.println("EMployee is Absent");
                }
        }
}


public class dailyEmpWage
{
        public static void main(String[] args)
        {
                //CONSTANTS
                int IS_FULL_TIME=1;
                int EMP_RATE_PER_HOUR=20;

                //vARIABLES
                int empHrs=0;
                int empWage=0;

                //computation
                double empCheck=Math.floor(Math.random() * 10 ) % 2;
                if(empCheck==IS_FULL_TIME)
                {
                        empHrs=8;
                }
                else
                {
                        empHrs=0;
                }
        empWage=empHrs*EMP_RATE_PER_HOUR;
        System.out.println("empWage: " +empWage);
        }
}



// Add part time emp wage
public class partTimeEMpWage
{
        public static void main(String[] args)
        {
                //CONSTANTS
                int IS_PART_TIME=1;
                int IS_FULL_TIME=2;
                int EMP_RATE_PER_HOUR=20;

                //vARIABLES
                int empHrs=0;
                int empWage=0;

                //computation
                double empCheck=Math.floor(Math.random() * 10 ) % 3;
                if(empCheck==IS_PART_TIME)
                {
                        empHrs=4;
                }
                else if(empCheck==IS_FULL_TIME)
                {
                        empHrs=8;
                }
		else
		{
			empHrs=0;
		}
        empWage=empHrs*EMP_RATE_PER_HOUR;
        System.out.println("empWage: " +empWage);
        }
}




//emp Wage for month salary code
public class empWageForMonthSalary
{
       public static final int IS_PART_TIME=1;
       public static final int IS_FULL_TIME=2;
       public static final int empRatePerHours=20;
       public static final int numberOfDays=20;

	public static void main(String[] args)
	{
	   int totalSalary=0;
	   int empHrs=0;
	   int salary=0;

	   for(int day=1;day<=numberOfDays;day++)
	   {
	       double empCheck=Math.floor(Math.random()*10)%3;
	       switch((int)empCheck)
	       {
		  case IS_PART_TIME:
		  empHrs=8;
		  break;

		  case IS_FULL_TIME:
		  empHrs=4;
		  break;

		  default:
		  empHrs=0;
	       }
	   salary=empHrs*empRatePerHours;
	   totalSalary=totalSalary+salary;
	   }
      System.out.println("Total Salary: "+totalSalary);
     }
}



//emp days Reached for month code
public class empDaysReachedForMonth
{
         //Constants
        public static final int IS_FULL_TIME=1;
        public static final int IS_PART_TIME=2;
        public static final int EMP_RATE_PER_HOUR=20;
        public static final int NUM_OF_WORKING_DAYS=20;
        public static final int MAX_HRS_IN_MONTH=100;

//              public empTotalWage(int empRate,int numbOfDays,int maxDays)
//              {
//                      this.EMP_RATE_PER_HOUR=empRate;
//                      this.NUM_OF_WORKING_DAYS=numbOfDays;
//              }

                public static void main(String[ ] args)
                {
                        //variables
                        int empHrs = 0;
                        int empWage = 0;
                        int totalEmpWage = 0, totalWorkingDays=0, totalEmpHrs=0;
                        while(totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS)
                        {
                                totalWorkingDays++;
                                //int empHrs = 0, empWage = 0;
                                int empCheck =(int) Math.floor(Math.random() * 10) % 3;
                                switch (empCheck)
                                {
                                case IS_FULL_TIME:
                                        empHrs = 8;
                                        break;
                                case IS_PART_TIME:
                                        empHrs = 4;
                                        break;
                                default:
                                        empHrs = 0;
                                }
                                totalEmpHrs += empHrs;
                                empWage = empHrs * EMP_RATE_PER_HOUR;
                                totalEmpWage += empWage;
                                System.out.println("Employee Wage : "+empWage);
                        }
                System.out.println("Total Employee Wage: "+totalEmpWage);
                }
}



//emp partFull time using switch code
public class partFullTimeSwitch
{
//CONSTANTS
public static final int IS_PART_TIME=1;
public static final int IS_FULL_TIME=2;
public static final int EMP_RATE_PER_HOUR=20;

        public static void main(String[] args)
        {
                //vARIABLES
                int empHrs=0;
                int empWage=0;

                //computation
                int empCheck=(int) Math.floor(Math.random() * 10 ) % 3;
                switch (empCheck)
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
        	System.out.println("empWage: " +empWage);
        }
}
