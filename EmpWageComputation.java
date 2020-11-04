public class EmpWageComputation 
{
  public static final int IS_PART_TIME = 1;
  public static final int IS_FULL_TIME = 2;
  public static final int empWagePerHr = 20;
  public static void main(String args[])
  {
      int workedHrs = 0;
      int empWage = 0;
      int type_of_Employee = (int) Math.floor(Math.random() * 10) % 3;
      switch (type_of_Employee) 
           {
		case IS_FULL_TIME : 
		       workedHrs = 8;
			break;
		case IS_PART_TIME :
			workedHrs = 4;
			break;
		default :
			workedHrs = 0;
	   }
     empWage = workedHrs * empWagePerHr;
     System.out.println("Employee Wage : " + empWage);
  }
}

