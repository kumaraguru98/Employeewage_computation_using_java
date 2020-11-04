public class EmpWageComputation 
{
  public static final int IS_PART_TIME = 1;
  public static final int IS_FULL_TIME = 2;
  public static final int empWagePerHr = 20;
  public static final int NUM_OF_WORKING_DAYS=20;
  public static final int MAX_HRS_IN_MONTH=100; 
  public static void main(String args[])
  {
      int workedHrs = 0;
      int totalEmpHrs = 0;
      int totalWorkingDays=0;
      while(totalEmpHrs<=MAX_HRS_IN_MONTH && totalWorkingDays<NUM_OF_WORKING_DAYS)
      {
        totalWorkingDays++;
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
     totalEmpHrs+=workedHrs;
     System.out.println("Day: " + totalWorkingDays+ "   Employeee Hours worked:" +workedHrs);
     }
     int totalWage=totalEmpHrs*empWagePerHr;
     System.out.println("Total Emp Wage:" +totalWage);
  }
}

