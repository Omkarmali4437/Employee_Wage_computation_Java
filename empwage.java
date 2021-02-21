public class empwagebuilder {
   public static void main(String[] args) {
		System.out.println("Welcome to employee wage problem");
   	int isfulltime=1;

   	int empcheck = (int)Math.floor(Math.random() * 10)%2;

   	if (empcheck == isfulltime)
      	System.out.println("Employee is present");
   	else
     		System.out.println("Employee is absent");

	}
}
