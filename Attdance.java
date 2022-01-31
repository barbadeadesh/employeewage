package employeewagebuilder;

public class Attdance {

	public static void main(String[] args) {
		//constant
				int IS_FULL_TIME = 1;
				//Computation
				double empCheck = Math.floor(Math.random() * 10) % 2;
			
				if(empCheck == IS_FULL_TIME)
					System.out.println("employee is present");
				else 
					System.out.println("employee is  Absent");

	}

}
