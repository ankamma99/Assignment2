package estore;

public class Tvs extends Electronics
{
	private String remote;

	public String getRemote() {
		return remote;
	}

	public void setRemote(String remote) {
		this.remote = remote;
	}
	
	private int pixels;

	public int getPixels() {
		return pixels;
	}

	public void setPixels(int pixels) {
		this.pixels = pixels;
	}

	
	private int inches;

	public int getInches() {
		return inches;
	}

	public void setInches(int inches) {
		this.inches = inches;
	}
	
	public void tvWarrenty()
	{
		int warrenty=6;
		System.out.println("the warrenty of tv is:" + warrenty);
	}
	public void tvTax()
	{
		super.Tax();
	}
}
