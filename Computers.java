package estore;

public class Computers extends Electronics
{
	
	private int memorySize;

	public int getMemorySize() {
		return memorySize;
	}

	public void setMemorySize(int memorySize) {
		this.memorySize = memorySize;
	}
	
	private String processorType;

	public String getProcessorType() {
		return processorType;
	}

	public void setProcessorType(String processorType) {
		this.processorType = processorType;
	}

	public void computerWarrenty()
	{
		int warrenty=9;
		System.out.println("the warrenty of computer is:" + warrenty);
	}
	public void computerTax()
	{
		super.Tax();
	}
}
