

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
