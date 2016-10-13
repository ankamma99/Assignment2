package estore;

public class AirConditioners extends Electronics
{
private int acType;

public int getAcType() {
	return acType;
}

public void setAcType(int acType) {
	this.acType = acType;
}

public void airConditionerWarrenty()
{
	int warrenty=11;
	System.out.println("the warrenty of airConditioner is:" + warrenty);
}
public void airConditionerTax()
{
	super.Tax();
}
}
