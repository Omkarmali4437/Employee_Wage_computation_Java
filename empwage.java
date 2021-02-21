public class empwagebuilder {
   public static void main(String[] args) {
		System.out.println("Welcome to employee wage problem");
   	int isfulltime=1;
		int isparttime=2;
		int wageperhour=20;
   	int empcheck = (int)Math.floor(Math.random() * 10)%3;

   	if (empcheck == isfulltime)
      {
			System.out.println("Employee is Full Time");
   		int dailyhour=8;
			int dailywage=wageperhour*dailyhour;
			System.out.println("Daily Wage is: "+dailywage);
		}
		else if (empcheck == isparttime)
		{
			System.out.println("Employee is Part Time");
      	int dailyhour=4;
       	int dailywage=wageperhour*dailyhour;
       	System.out.println("Daily Wage is: "+dailywage);

		}
		else
		{
     		System.out.println("Employee is absent");
			int dailyhour=0;
         int dailywage=wageperhour*dailyhour;
         System.out.println("Daily Wage is: "+dailywage);
		}
	}
}
