package oop.task_2;


import java.util.Scanner;

public class Human {

	public static void main(String[] args) {
	
//		Man one = new Woman(false, "lena", "ivanova", 65, 170);
//		Man two = new Man(true, "kostia", "petrov", 85, 185);
		
		Man one = createHuman();
		System.out.println(one );
		Man two = createHuman();
		System.out.println(two );

one.relationship(two);	
	}
		public static Man createHuman (){
			Man persone;

			System.out.println("¬ведите пол:");
			boolean sex2 = new Scanner(System.in).nextBoolean();
			System.out.println("¬ведите им€:");
			String name2 = new Scanner(System.in).nextLine();
			System.out.println("фамилию:");
			String surname2 = new Scanner(System.in).nextLine();
			System.out.println("вес:");
			float weight2 = new Scanner(System.in).nextFloat();
			System.out.println("рост:");
			float height2 = new Scanner(System.in).nextFloat();
		
		if (sex2 == true) 
			persone = new Man(sex2, name2, surname2, weight2, height2);
		 else 
			 persone = new Woman(sex2, name2, surname2, weight2, height2);
		
		return persone;
	}
}
