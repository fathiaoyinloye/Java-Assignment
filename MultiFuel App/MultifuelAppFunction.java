public class MultifuelAppFunction{

	public static int chooseFuelType(String fuel_type){
		int price = 0;
		switch(fuel_type){
			case "1" -> price = 650;
			case "2" -> price = 720;
			case "3" -> price = 720;
			case "4" -> price = 720;
			default ->  price = 0;
		

		}
		return price;


	}
	public static int calculateTotalLiters(int am){
		int totalLiters = 0;
		if (price < 1 || price > 50)
			totalLiters = 0;
		else: 
		

	}




	public static void main(String... args){
		System.out.print(chooseFuelType("1"));
	


	}



}
	