public class empwagebuilder { public static void main(String[] args) {
		System.out.println("Welcome to employee wage problem");
		//Constants
		int isfulltime=1;
		int isparttime=2;
		int month=20;
		int wageperhour=20;
		int maximumhrs=100;
		int numberofworkingdays=20;
		//Variables
      int dailywage;
      int mwage=0;
		int totalworkingdays=0;
		int totalworkhrs=0;
		while(totalworkingdays<numberofworkingdays && totalworkhrs<maximumhrs )
		{
			totalworkingdays++;
			int dailyhour=0;
			int empcheck = (int)Math.floor(Math.random() * 10)%3;
			switch (empcheck) {
         case 1:
            dailyhour=8;
				break;
         case 2:
            dailyhour=4;
				break;
         case 0:
            dailyhour=0;
				break;
      	}
			totalworkhrs+=dailyhour;
		}
		int totalsalary=totalworkhrs*wageperhour;
		System.out.println("Total salary of a employee is :"+totalsalary);
	}
}
