public class Animal{

	private String name;
	private int weight;
	private String color;
	


	public Animal(String name, int weight, String color){
		this.name = name;
		this.weight = weight;
		this.color = color;

	}


	public void getAMessage(){
		System.out.println("The animal is a " + name);	
		System.out.println("Its weight is " + weight);
		System.out.println("Its color is " + color);


	}











}