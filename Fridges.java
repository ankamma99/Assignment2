package estore;

public class Fridges extends Electronics
{
	private int capacityInLiters;

	public int getCapacityInLiters() {
		return capacityInLiters;
	}

	public void setCapacityInLiters(int capacityInLiters) {
		this.capacityInLiters = capacityInLiters;
	}

	public void fridgeWarrenty()
	{
		int warrenty=7;
		System.out.println("the warrenty of fridge is:" + warrenty);
	}
	public void fridgeTax()
	{
		super.Tax();
	}
}
