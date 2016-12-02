
public class hw4 {
	//will switch between c and f and vise-versa
	public static void convertTemp(double temperature, String temperatureScale){
		if(temperatureScale.toLowerCase().equals("c")){
			System.out.println(temperature+" "+temperatureScale+" is equal to "+(32.0+temperature*1.8)+" F");
		} else if(temperatureScale.toLowerCase().equals("f")){
			System.out.println(temperature+" "+temperatureScale+" is equal to "+(5./9.0*(temperature-32.0))+" C");
		} else{
			System.out.println(temperatureScale+" temperature scale not recognized");
		}
	}
	
	
	
}
