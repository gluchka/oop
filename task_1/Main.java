package oop.task_1;

public class Main {
	
	
	public static void main(String [] args){
		Container<Phone> t = new Container<Phone>();
	t.add(new Monoblock(200,"Nokia",50));
	t.add(new Sensore(300,"Samsung",3500));
	t.add(new Monoblock(20,"Nokia",50));
	t.add(new Sensore(3,"Samsung",3500));
	
	t.print();	
	System.out.println("Sorted by price");
	t.sort();
	t.print();
		
Monoblock.avg();
Sensore.avg();
	}
	
}
