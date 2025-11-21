public class ThingDriverClass{
	public static void main (String... args){
		Thing pen = new Thing(3.4);
		pen.setName("pen");
		System.out.println(pen.getWeight());
		System.out.println(pen.getName());
		System.out.println("---------------");

		
		LivingThing dog = new LivingThing(4.5, false);
		dog.setName("Lucky");
		dog.setMovementForm("doGwalk");
		System.out.println(dog.getCanProduceTheirOwnFood());
		System.out.println(dog.getName() + " ate " + dog.foodEaten("bone"));
		System.out.println(dog.getMovementForm());
		System.out.println("---------------");





		NonLivingThing bag = new NonLivingThing(4.5);
		bag.setName("PurpleBag");
		System.out.println(bag.getName());
		System.out.println(bag.getWeight());
		System.out.println("---------------");



		Plant flower = new Plant(4.5, true);
		flower.setName("Hibiscus");
		flower.setMovementForm("part of its body");
		System.out.println(flower.getCanProduceTheirOwnFood());
		System.out.println(flower.getName() + " ate " + dog.foodEaten("sunlight"));
		System.out.println(flower.getMovementForm());
		System.out.println("---------------");




	}



}