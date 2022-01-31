package employeewagebuilder;

public class  DailyWage
 {

	public static final int IS_PRESENT = 1;

	public static void main(String[] args) {

		int workHrs;
		int workPerHrRate=20;

		double empCheck=(int)(Math.random()*10)%2;

		if( IS_PRESENT== empCheck ) {
			workHrs=8;	
			System.out.println("employee is present & working hrs = "+workHrs);
			System.out.println("employee daily wage = "+(workPerHrRate*workHrs));
		}

		else {
			workHrs=0;
			System.out.println("employee not present & working hrs = "+workHrs);
			System.out.println("employee daily wage = "+(workPerHrRate*workHrs));
	
	
	
	
	

			}

	    }

	}
