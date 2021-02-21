public class empwagebuilder {
   public static void main(String[] args) {
		System.out.println("Welcome to employee wage problem");
   	int isfulltime=1;
		int dailyhour=8;
   	int empcheck = (int)Math.floor(Math.random() * 10)%2;

   	if (empcheck == isfulltime)
      {
			System.out.println("Employee is present");
   		int wageperhour=20;
			int dailywage=wageperhour*dailyhour;
			System.out.println("Daily Wage is: "+dailywage);
		}
		else
		{
     		System.out.println("Employee is absent");
			int wageperhour=0;
         int dailywage=wageperhour*dailyhour;
         System.out.println("Daily Wage is: "+dailywage);
		}
	}
}
