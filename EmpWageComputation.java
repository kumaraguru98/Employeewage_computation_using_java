class CompanyEmpWage
{
    final String COMPANY_NAME;
    final int WAGE_PER_HR;
    final int MAX_WORKING_DAYS;
    final int MAX_WORKING_HRS;
    int totalWage;

    CompanyEmpWage(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        COMPANY_NAME = companyName;
        WAGE_PER_HR = wagePerHr;
        MAX_WORKING_DAYS = maxWorkingDays;
        MAX_WORKING_HRS = maxWorkingHrs;
        totalWage = 0;
    }

    void getTotalEmployeeWage(int totalWage)
    {
        this.totalWage = totalWage;
    }

    public String toString()
    {
        System.out.println("Details of " + COMPANY_NAME + " employee");
        System.out.println("        ");
        System.err.println("Wage per hour:" + WAGE_PER_HR);
        System.out.println("Maximum working days:" + MAX_WORKING_DAYS);
        System.out.println("Maximum working hours:" + MAX_WORKING_HRS);
        return "Total wage for a month of " + COMPANY_NAME + " employee is " + totalWage + "\n";
    }
}

public class EmpWageComputation
{

    public static final int PART_TIME = 1;
    public static final int FULL_TIME = 2;
    int noOfCompanies;
    int i;
    CompanyEmpWage[] companies;

    public EmpWageComputation(int noOfCompanies)
    {
        this.noOfCompanies = noOfCompanies;
        companies = new CompanyEmpWage[noOfCompanies];
        i= 0;
    }

    void addCompany(String companyName, int wagePerHr, int maxWorkingDays, int maxWorkingHrs)
    {
        companies[i++] = new CompanyEmpWage(companyName, wagePerHr, maxWorkingDays, maxWorkingHrs);
    }

    int generateEmpCheck()
    {
        return (int) (Math.random() * 100) % 3;
    }

    int getWorkingHrs(int type_of_Employee)
    {
        switch (type_of_Employee)
        {
        case FULL_TIME:
            return 8;
        case PART_TIME:
            return 4;
        default:
            return 0;
        }
    }

    void totalWageCalculation()
    {
        for (CompanyEmpWage company : companies)
        {
            int totalWage = totalWageCalculation(company);
            company.getTotalEmployeeWage(totalWage);
            System.out.println(company);
        }
    }

    int totalWageCalculation(CompanyEmpWage companyEmpWage)
    {
        System.out.println("Computation of total wage of " + companyEmpWage.COMPANY_NAME + " employee");
        System.out.println("     ");
        System.out.printf("%3s     %3s     %3s     %3s\n", "Day", "Workinghrs", "Wage", "Total working hrs");

        int workingHrs, totalWage = 0;
        for (int day = 1, totalWorkingHours = 0; day <= companyEmpWage.MAX_WORKING_DAYS
                && totalWorkingHours <= companyEmpWage.MAX_WORKING_HRS; day++, totalWorkingHours += workingHrs)
        {
            int type_of_Employee = generateEmpCheck();
            workingHrs = getWorkingHrs(type_of_Employee);
            int wage = workingHrs * companyEmpWage.WAGE_PER_HR;
            totalWage += wage;
            System.out.printf("%3d       %3d      %3d      %3d\n", day, workingHrs, wage, totalWorkingHours + workingHrs);
        }
        return totalWage;
    }

    public static void main(String args[])
    {
        EmpWageComputation empWageComputation = new EmpWageComputation(3);
        empWageComputation.addCompany("DMart", 30, 25, 100);
        empWageComputation.addCompany("Reliance", 20, 20, 95);
        empWageComputation.addCompany("Pantaloons",40,28,98);
        empWageComputation.totalWageCalculation();
    }
}

