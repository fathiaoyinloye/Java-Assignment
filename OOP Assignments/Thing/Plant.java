public class Plant extends LivingThing{
	private int noOfCellWall;
	private final boolean canProduceTheirOwnFood;


	public Plant(Double weight, boolean canProduceTheirOwnFood ){
		super(weight, canProduceTheirOwnFood);
		this.canProduceTheirOwnFood = canProduceTheirOwnFood;
	}


}