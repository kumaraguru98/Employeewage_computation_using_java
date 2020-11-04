public class EmpWageComputation 
{
   public static void main(String[] args){
   int IS_FULL_TIME = 1;
   int IS_PART_TIME = 2;
	int workedHrs = 0;
	int empWage = 0;
	int empWagePerHr = 20;

	double type_of_Employee = Math.floor(Math.random() * 10) % 3;
	if (type_of_Employee == IS_FULL_TIME)
        {
	     workedHrs = 8;
        }
        else if(type_of_Employee == IS_PART_TIME)
        {
             workedHrs = 4;
        }
	else
        {
	     workedHrs = 0;
        }

	empWage = workedHrs * empWagePerHr;
	System.out.println("Employee Wage : " + empWage);
   }
}

