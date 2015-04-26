package oop.task_2;

public class Man {

	private boolean sex;
	private String name;
	private String surname;
	private float weight;
	private float height;
	public Man(){};
	public Man(Boolean sex, String name, String surname, float weight,
			float height) {
		setSex(sex);
		setName(name);
		setSurname(surname);
		setWeight(weight);
		setHeight(height);
	}

	public boolean speak(Man one, Man two) {
		System.out.println("METHOD: SPEAK");
		double probabilitySpeak = Math.random();
		 System.out.println("the probability of a conversation:  " +
		 probabilitySpeak);
		if ((one.sex == true) && (two.sex == true) && (probabilitySpeak < 0.5)) {
			System.out.println(" will not speak");
			return false;
		} else {
			System.out.println("will speak");
			return true;
		}
	}

	public  boolean suffer_society(Man one, Man two) {
		System.out.println("METHOD: SUFFER SOCIETY");
		double ss1 = Math.random();
		System.out.println("suffer_society probability    " + ss1);
		if ((one.sex == false) && (two.sex == false) && (ss1 < 0.05)) {
			 System.out.println("suffer_society false");
			return false;
		} else if (((one.sex == false) && (two.sex == true) && (ss1 < 0.7))
				|| ((one.sex == true) && (two.sex == false) && (ss1 < 0.7))) {
			 System.out.println("suffer_society false");
			return false;
		} else if ((one.sex == true) && (two.sex == true) && (ss1 < 0.056)) {
			 System.out.println("suffer_society false");
			return false;
		} else {
			 System.out.println("suffer_society true");
			return true;
		}
	}

	public  boolean get_together(Man one, Man two) {
		System.out.println("METHOD: GET TOGETHER");
		double gtmin = Math.random();
		System.out.println("gtmin less then 10%: " + gtmin);
		double gtmax = Math.random();
		System.out.println("gtmax more then 10%: " + gtmax);
		if (((Math.abs((two.height / one.height) - 1) * 100) >= 10)
				&& (gtmax > 0.15)) {
			System.out.println("true get_together more then 10% ");
			return true;
		} else if (((Math.abs((two.height / one.height) - 1) * 100) < 10)
				&& (gtmin > 0.05)) {
			System.out.println(" true get_together less then 10% ");
			return true;
		} else {
			System.out.println("get_together false");
			return false;
		}
	}

	public  Man relationship(Man two) {
		if (((this.speak(this, two)) && (this.suffer_society(this, two)) && (this
				.get_together(this, two))) == true && (this.sex == two.sex)) {
			System.out.println("ничего не получилось (однополые втретились) "
					+ this.getClass().getName() + " "
					+ two.getClass().getName());
			System.out.println(this.sex + " " + two.sex + " "
					+ (this.sex == two.sex));
			return null;
		} else if(((this.speak(this, two)) && (this.suffer_society(this, two)) && (this
				.get_together(this, two))) == true && (this.sex != two.sex)) {
			Woman wm;
						if (this.sex == false) {
				wm = (Woman) this;
				return wm.born_child( two, this);
			} else {
				wm = (Woman) two;
				return wm.born_child(this, two);
			}
		} 
		else return null;
	}


	public boolean isSex() {
		return sex;
	}

	public void setSex(boolean sex) {
		if (sex == true || sex == false)
		this.sex = sex;
		else 
			throw new IllegalArgumentException(
					"Exception: You mast write true or false");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public float getWeight() {
		return weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}
	@Override
	public String toString() {
		return "Man: " +"\n " + "name: " + getName()+"\n"
				+ " surname: " + getSurname() +"\n"+ " weight: "
				+ getWeight() +"\n"+ " height: " + getHeight() + "]";
	}
}
