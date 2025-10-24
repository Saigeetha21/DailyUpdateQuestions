package mar5.Array.com;

public class Food {
	private String quantity;
	private String quality;
	public Food(String quantity, String quality) {
		super();
		this.quantity = quantity;
		this.quality = quality;
	}
	public String getQuantity() {
		return quantity;
	}
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	
	public static void main(String[] args) {
		Food food[] = new Food[3];
		food[0]= new Food("small","good");
		food[1]= new Food("medium","delicuos");
		food[2]= new Food("large","not good");
		
		for(int i = 0;i<food.length;i++)
			System.out.println("food is tasty:"+(i+1)+ ",quantity:"+ food[i].getQuantity() + ",quality:"+food[i].getQuality());
			
	}

}
