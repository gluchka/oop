package oop.task_0_1;


public class Tarif {

	private String name;
	private double licenseFee;
	private int freeMinute;
	private int internet3G;

	private Tarif(String name, double licenseFee, int freeMinute, int internet3g) {
		setName(name);
		setLicenseFee(licenseFee);
		setFreeMinute(freeMinute);
		setInternet3G(internet3g);
	}

	static Tarif[] tarif = { new Tarif("three", 333, 33, 3),
			new Tarif("one", 111, 11, 1), new Tarif("five", 111, 55, 5),
			new Tarif("four", 444, 44, 4), new Tarif("two", 222, 22, 1), };

	public static void sortTarifs() {
		for (int i = tarif.length - 1; i > 0; i--) {
			for (int j = 0; j < i; j++) {
				if (tarif[j].getLicenseFee() > tarif[j + 1].getLicenseFee()) {
					Tarif tt = tarif[j];
					tarif[j] = tarif[j + 1];
					tarif[j + 1] = tt;
				}
			}
		}
		for (Tarif o : tarif)
			System.out.println(o);
	}

	public static void sortByParametrs(double licFeeFrom, double licFeeTo,
			int freeMinFrom, int freeMinTo, int inet3G) {
		System.out.println("Conditions: license fee from " + licFeeFrom
				+ " to " + licFeeTo + " count of free minutes from "
				+ freeMinFrom + " to " + freeMinTo + " count of Mb " + inet3G);
		System.out.println(" all given characteristics respond tariff:");
		for (int i = tarif.length - 1; i > 0; i--) {

			if ((tarif[i].getLicenseFee() >= licFeeFrom && tarif[i]
					.getLicenseFee() < licFeeTo)
					&& (tarif[i].getFreeMinute() >= freeMinFrom && tarif[i]
							.getFreeMinute() < freeMinTo)
					&& tarif[i].getInternet3G() == inet3G) {
				System.out.println(tarif[i]);
			}
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getLicenseFee() {
		return licenseFee;
	}

	public void setLicenseFee(double licenseFee) {
		this.licenseFee = licenseFee;
	}

	public int getFreeMinute() {
		return freeMinute;
	}

	public void setFreeMinute(int freeMinute) {
		this.freeMinute = freeMinute;
	}

	public int getInternet3G() {
		return internet3G;
	}

	public void setInternet3G(int internet3g) {
		if (internet3g > 0 && internet3g < 1000)
			internet3G = internet3g;
		else
			throw new IllegalArgumentException("Incorrect value of internet3g");
	}

	@Override
	public String toString() {
		return "Tarif [name=" + name + ", licenseFee= " + licenseFee
				+ ", freeMinute= " + freeMinute + ", internet3G= " + internet3G
				+ "]";
	}
}
