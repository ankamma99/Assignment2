package estore;

public class MainClass
{
	public static void main(String args[])
	{
		Electronics Sar=new Electronics();
		Tvs Sar1=new Tvs();
		Fridges Sar2=new Fridges();
		Microwaves Sar3=new Microwaves();
		Computers Sar4=new Computers();
		AirConditioners Sar5=new AirConditioners();
		MobilePhones Sar6=new MobilePhones();
		
		Sar1.Tax();
		Sar2.fridgeWarrenty();
		Sar.setColor("black");
		
		System.out.println(Sar.getColor());
		}
	
	   
}

