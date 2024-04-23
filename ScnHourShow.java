import java.util.Scanner;

class scnremainhourshow {
	static float hour_in_min =60;
	static float got_hour_IN_MIN_forperpercentage;
	static float got_min_for_per_percent;
	static float hoe_much_time_willtake_in_min;
	static float hoe_much_time_willtake_in_Hour;
	
	public static void remianing_hour_ans(){
		System.out.println("Enter Scan remaining Hour");
		Scanner  scnuser_enter_hour = new Scanner(System.in);  
		float  scnuser_enter_hour_var =  scnuser_enter_hour.nextFloat();

		System.out.println("Enter Scan remaining Min");
		Scanner  scnuser_enter_min = new Scanner(System.in);  
		float  scnuser_enter_min_var =  scnuser_enter_min.nextFloat();
		
		System.out.println("Enter Scan in progress Percentage ");
		Scanner  scnuser_enter_scanpercentage = new Scanner(System.in);  
		float scnuser_enter_scanpercentage_var =  scnuser_enter_scanpercentage.nextFloat();
		
		
		got_hour_IN_MIN_forperpercentage=scnuser_enter_hour_var*hour_in_min+scnuser_enter_min_var;
		System.out.println("Till "+scnuser_enter_scanpercentage_var+"% It TOok  "+got_hour_IN_MIN_forperpercentage+" minutes");
		System.out.println("");
		got_min_for_per_percent=got_hour_IN_MIN_forperpercentage/scnuser_enter_scanpercentage_var;
		System.out.println("FOR PER 1% IT IS TAKEING "+got_min_for_per_percent+" MINUTES");
		System.out.println("");
		hoe_much_time_willtake_in_min=got_min_for_per_percent*100;
		System.out.println("REAMINING MINUTES TO COMPLETE SCAN "+hoe_much_time_willtake_in_min);
		System.out.println("");
		hoe_much_time_willtake_in_Hour=(hoe_much_time_willtake_in_min/hour_in_min);
		System.out.println("");
		System.out.println("TO COMPLETE SCAN IT WILL TAKE "+hoe_much_time_willtake_in_Hour+" HOURS");
		
	}
	
}

public class ScnHourShow {
	public static void main(String[] args) {
		scnremainhourshow.remianing_hour_ans();
	}
	
}
