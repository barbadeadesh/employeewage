package employeewagebuilder;

public class MonthlyWage {
	public static final int PER_HOUR_WAGE = 20;
	public static final int DAYS_IN_MONTH = 20;
	
	public static void main(String[] args) {
		
		int salary=0;
		int workingHour=0;
		int totalSalary=0;
		int isPresent;

		for (int day=1; day<=DAYS_IN_MONTH ;day++)
		{
			isPresent=(int)(Math.random()*3);
			switch(isPresent){
			case 0:
				System.out.println("Employee is absent");
				workingHour=0;
				break;

			case 1:
				System.out.println("Employee is present");
				workingHour=8;
				break;

			default :
				System.out.println("Employee is working as part time");
				workingHour=4;

			}

			salary=( PER_HOUR_WAGE * workingHour );
			totalSalary=(totalSalary + salary);
		}

		System.out.println("Employee has earned totalSalary in a month = " +totalSalary);

	}

}
