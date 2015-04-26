package oop.task_1;

public class Sensore extends Phone {

	private int simCount;
	static int count = 0;
	static double priceSensore = 0;

	public Sensore() {
	}

	public Sensore(double price, String name, int simCount) {
		super(price, name);
		setSimCount(simCount);
		count++;
		priceSensore += price;
	}

	public int getSimCount() {
		return simCount;
	}

	public void setSimCount(int simCount) {
		this.simCount = simCount;
	}

	public static void avg() {
		System.out.println("Average prise of all sensore phones");
		System.out.println(priceSensore / count);
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append(" Sensore phone: : " + getName());
		result.append(" price: " + getPrice());
		result.append(" sim count : " + simCount);
		result.append("}");
		return result.toString();
	}
}
