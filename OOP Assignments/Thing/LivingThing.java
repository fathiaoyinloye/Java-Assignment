public class LivingThing extends Thing{
	private int lifespan;
	private boolean canProduceTheirOwnFood;
	protected String movementForm;

	public LivingThing(double weight, boolean canProduceTheirOwnFood){
		super(weight);
		this.canProduceTheirOwnFood = canProduceTheirOwnFood;
	
	}
	public  boolean getCanProduceTheirOwnFood(){
		return canProduceTheirOwnFood;


	}

	public void setMovementForm(String movementForm){
		this.movementForm = movementForm;


	}
	
	public String getMovementForm(){
		return movementForm;


	}
	

	public String foodEaten(String food){
		return food;



	}
	
	


}