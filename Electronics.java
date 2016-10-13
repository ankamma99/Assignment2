package estore;
import java.util.Scanner;

public class Electronics 
{
private String color;

public String getColor() {
	
	return color;
}

public void setColor(String color) {
	this.color = color;
	
}


private int voltage;

public int getVoltage() {
	return voltage;
}

public void setVoltage(int voltage) {
	this.voltage = voltage;
}


private int cost;

public int getCost() {
	return cost;
}

public void setCost(int cost) {
	this.cost = cost;
}

private String brand;

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}



public void Tax() {
	double price;
	double result;
	float tax;	
	Scanner in = new Scanner(System.in);
	System.out.println("enter the price");
	price=in.nextDouble();
	tax=(float)(0.115* price);
	result=price+tax;
	System.out.println("the total price is :" +result);
	
}
}

