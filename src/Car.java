public class Car {

	private String color;
	private int speed;
	private int maxSpeed;

	
	/**
	 * Creates a new car instance
	 * @param color
	 * @param maxSpeed
	 */
	public Car(String color, int maxSpeed){
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.speed = 0;
	}
	
	/**
	 * Return the current speed of the car.
	 */
	public int getSpeed(){
		return(this.speed);
	};
	
	/**
	 * Accelerates the car up to the maximum amount
	 * set in the object constructor.
	 * @param amount	The amount the car will accelerate
	 */
	public void accelerate(int amount){
		int limit = this.maxSpeed - this.speed;
		if(amount >= limit){
		  this.speed = limit;
		}else{
		  this.speed+= amount;
		}
	}
	/**
	 * Decelerates the car by amount but not below 0
	 * @param amount the amount he car will decelerate
	 */
	public void decelerate(int amount){
		int speed = this.speed - amount;
		if (speed <= 0){
			this.speed = 0;
		} else{
			this.speed = speed;
		}
	}
	
	/**
	 * Displays the object as a string in the format
	 * "Color: red, Speed: 100"
	 */
	public String toString(){
		return("Color: " + this.color + ", Speed: " + this.speed);
	}

}
