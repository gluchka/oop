package oop.task_1;



public class Monoblock extends Phone{

private double time;
static int count=0;
static double priceMoblock=0;
	
	public Monoblock(){}
	public Monoblock(double price, String name, double time) {
		super(price, name);
		setTime(time);
		count++;
		priceMoblock+=price;
	}
	
	public double getTime() {
		return time;
	}

	public void setTime(double time) {
		this.time = time;	
	}
	
	public static void avg(){
		System.out.println("Average prise of all monoblocks");
		System.out.println(priceMoblock/count);
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(" Monoblock phone: : " + getName());
		result.append(" price: " + getPrice());
		result.append(" time: " + time);
		result.append("}");
		return result.toString();
	}
	
}
