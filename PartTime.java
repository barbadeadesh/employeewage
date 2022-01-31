package employeewagebuilder;

public class PartTime {

	public static final int PER_HOUR_WAGE = 20;
	
	public static void main(String[] args) {
		
		int workingHour=0;
		int isPresent;
		int salary=0;

		isPresent=(int)(Math.random()*3);
		if(isPresent == 0)
		{
			System.out.println("Employee is absent");
			workingHour=0;
		}

		else if(isPresent == 1)
		{
			System.out.println("Employee is working as full time");
			workingHour=16;
		}

		else
		{
			System.out.println("Employee is working as part time");
			workingHour=8;
		}



	    salary=( PER_HOUR_WAGE * workingHour);
		System.out.println("Employee per day salary = "+salary);

	}

}