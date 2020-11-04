class EmpWageComputation 
{
  public static final int IS_PART_TIME = 1;
  public static final int IS_FULL_TIME = 2;
  public static int computeEmpWage(String company,int empWagePerHr,int numOfWorkingDays,int MAX_HOURS_IN_MONTH) 
  {
  int workedHrs = 0;
  int totalWorkingHours = 0;
  int totalWorkingDays=0;

  while(totalWorkingHours<=MAX_HOURS_IN_MONTH && totalWorkingDays<numOfWorkingDays)
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
           totalWorkingHours+=workedHrs;
           System.out.println("Day: " + totalWorkingDays + " Emp Hr: " +workedHrs);
          }
         int totalWage=totalWorkingHours*empWagePerHr;
         System.out.println("Total employee wage for company: " +company+" is: "+totalWage);
         return totalWage;
       }
       public static void main(String args[]){
        computeEmpWage("DMart",20,2,10);
        computeEmpWage("Reliance",10,4,20);
      
    }
 }

