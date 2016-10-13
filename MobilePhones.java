package estore;

public class MobilePhones extends Electronics
{
private double  batteryCapacity;

public double getBatteryCapacity() {
	return batteryCapacity;
}

public void setBatteryCapacity(double batteryCapacity) {
	this.batteryCapacity = batteryCapacity;
}

private String headPhonesType;

public String getHeadPhonesType() {
	return headPhonesType;
}

public void setHeadPhonesType(String headPhonesType) {
	this.headPhonesType = headPhonesType;
}

public void mobileWarrenty()
{
	int warrenty=10;
	System.out.println("the warrenty of mobile is:" + warrenty);
}
public void mobileTax()
{
	super.Tax();
}
}
