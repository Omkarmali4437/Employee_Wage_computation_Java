public class empwagebuilder {
	public static void main(String[] args) {
		System.out.println("Welcome to employee wage problem");
		int isfulltime=1;
		int isparttime=2;
		int dailyhour;
		int dailywage;
		int wageperhour=20;
		int empcheck = (int)Math.floor(Math.random() * 10)%3;
		switch (empcheck) {
			case 1:
				System.out.println("Employee is Full Time");
				dailyhour=8;
				dailywage=wageperhour*dailyhour;
				System.out.println("Daily Wage is: "+dailywage);
				break;
			case 2:
				System.out.println("Emplpyee is Part Time");
				dailyhour=4;
				dailywage=wageperhour*dailyhour;
				System.out.println("Daily Wage is: "+dailywage);
				break;
			case 0:
    			System.out.println("Employee is Absent");
    			break;
		}
	}
}
