class EmpWageComputation 
{
  public static final int IS_PART_TIME = 1;
  public static final int IS_FULL_TIME = 2;
  public static final int empWagePerHr = 20;
  public static final int NUM_OF_WORKING_DAYS=20;
  public static final int MAX_HOURS_IN_MONTH=100; 
  int workedHrs = 0;
  int empWage=0;
  int totalWage=0;
  int totalWorkingHours = 0;
  int totalWorkingDays=0;

  public void wageComputation()
  {
     empWage=workedHrs*empWagePerHr;
     totalWage+=empWage;
     totalWorkingHours+=workedHrs;
     System.out.println("Employee's day " + totalWorkingDays + " Wage is: " +empWage);
  }
  public void computation()
  {
     while(totalWorkingDays<NUM_OF_WORKING_DAYS && totalWorkingHours<MAX_HOURS_IN_MONTH)
     {
        totalWorkingDays++;
        int type_of_Employee = (int) Math.floor(Math.random() * 10) % 3;
        switch (type_of_Employee) 
           {
		case IS_FULL_TIME : 
                      System.out.println("Employee is full time working");
		      workedHrs = 8;
		      break;
		case IS_PART_TIME :
                      System.out.println("Employee is working part time");
		      workedHrs = 4;
		      break;
		default :
                      System.out.println("Employee is absent");
		      workedHrs = 0;
	   }
        wageComputation();
      }   
     System.out.println("Total working hours in month:"+totalWorkingHours);
     System.out.println("Total monthly wages is:"+totalWage);
  }
     
  public static void main(String args[]){
        EmpWageComputation object=new EmpWageComputation();
        object.computation();
    }
 }

