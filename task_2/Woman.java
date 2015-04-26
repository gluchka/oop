package oop.task_2;

import java.util.Scanner;

public class Woman extends Man {

	public Woman(Boolean sex, String name, String surname, float weight,
			float height) {
		super(sex, name, surname, weight, height);
	}

	public Man born_child(Man man, Man wom) {
		System.out.println("METHOD: BORN CHILD");
		double probabilityBorn = Math.random();
		System.out.println("Probability = " + probabilityBorn+ ",  if > 0,5 - daughter will born, else son ");
		if (probabilityBorn > 0.5) {
			System.out.println("¬ведите им€ дочки:");
			String name = new Scanner(System.in).nextLine();
			String surname = man.getSurname();
			float height = (float) (wom.getHeight() + 0.1 * (man.getHeight() - wom
					.getHeight()));
			float weight = (float) (wom.getWeight() + 0.1 * (man.getWeight() - wom
					.getWeight()));
			Man m_child = new Woman(isSex(), name, surname, weight, height);
			System.out.println("девочка " + m_child.getName() + " "
					+ m_child.getWeight());
			System.out.println(m_child.toString());
			return m_child;
		} else {
			System.out.println("¬ведите им€ сына:");
			String name = new Scanner(System.in).nextLine();
			String surname = man.getSurname();
			float weight = (float) (man.getHeight() + 0.1 * (wom.getHeight() - man
					.getHeight()));
			float height = (float) (wom.getWeight() + 0.1 * (man.getWeight() - wom
					.getWeight()));
			Man w_child = new Man(isSex(), name, surname, weight, height);
			System.out.println("мальчик " + w_child.getName() + " "
					+ w_child.getWeight());
			System.out.println(w_child.toString());
			return w_child;
		}
	}

	@Override
	public String toString() {
		return "Woman: "  +"\n"+ " name " + getName()+"\n"
				+ " surname " + getSurname() +"\n"+ " weight"
				+ getWeight()+"\n" + " height " + getHeight() + "]";
	}

}
