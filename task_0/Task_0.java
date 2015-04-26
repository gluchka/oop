package oop.task_0;


public class Task_0  {

static Airline[] airline = new Airline[4];
	
	public static void main(String[] args) {
		
		try {

			airline[0] = new Airline("�������", 111, "qqq", 15.50, "�������");
			airline[1] = new Airline("�����", 222, "qqq", 12.20, "�����");
			airline[2] = new Airline("����", 333, "qqq", 12.12, "�����������");
			airline[3] = new Airline("�����", 111, "aaa", 12.31, "�����");
		} catch (IllegalArgumentException ex) {
			System.out.println(ex.getMessage());
		}

		
		methodOfDestination("�������");
		flyForWeakday("�����");
		methodDayTimeIncrease("�����",12.20);
	}

	public static void methodOfDestination(String dest) {
		for (int i = 0; i < airline.length; i++) {
			if (airline[i].getDestination() == dest) {
				System.out.println("1: In this direction following planes fly:  "
						+ airline[i].toString());
			}
		}
	}

	public static void flyForWeakday(String day) {
		for (int i = 0; i < airline.length; i++) {
			if (airline[i].getDayOfWeak() == day) {
				System.out.println("2: In this day following planes fly:  "
						+ airline[i].toString());
			}
		}
	}
	
	public static void methodDayTimeIncrease(String day, double date) {
		for (int i = 0; i < airline.length; i++) {
			if (airline[i].getDayOfWeak() == day &&  date>=airline[i].getTimeFlight()) {
				System.out.println("3: In this day:  "
						+ airline[i].toString());
			}
		}
	}

	
}
