public class Duck extends Animal{
		private String beak;
		private int duckling;




	
	public Duck(String name, int weight, String color, String beak, int duckling){
		super(name,weight,color);
		this.beak = beak;
		this.duckling = 2;

	}
	@Override
	public void getAMessage(){
		super.getAMessage();
		System.out.println("My beak is " + beak);
		System.out.println("I have beak the total of " + beak + " duckling");

	}





}