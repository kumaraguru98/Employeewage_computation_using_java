public class EmpWageComputation 
{
   public static void main(String[] args) 
     {
        int IS_FULL_TIME = 1;
        double type_of_Employee = Math.floor(Math.random()*10) % 2;
	if (type_of_Employee == IS_FULL_TIME)
         {
	     System.out.println("Employee is present");
         }
	else
         {
	     System.out.println("Employee is absent");
         }
     }
}
