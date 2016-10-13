package estore;

public class Microwaves extends Electronics
{

	private double dimensions;

	public double getDimensions() {
		return dimensions;
	}

	public void setDimensions(double dimensions) {
		this.dimensions = dimensions;
	}
	
	public void microwaveWarrenty()
	{
		int warrenty=8;
		System.out.println("the warrenty of microwave is:" + warrenty);
	}
	public void microwaveTax()
	{
		super.Tax();
	}
}
