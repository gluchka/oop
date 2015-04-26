package oop.task_1;

public class Container<T extends Phone> {

	static int count = 0;
	Phone[] elementData = new Phone[16];

	public void add(T element) {

		if (count + 1 < elementData.length) {
			elementData[count++] = element;
		} else {
			Phone[] temp = new Phone[count * 3 / 2 + 1];
			for (int i = 0; i < temp.length; i++) {
				temp[i] = elementData[i];
			}
			elementData = temp;
			elementData[count++] = element;
		}
	}

	public int getCount() {
		return count;
	}

	public Phone find(int index) {
		return elementData[index];
	}

	public void print() {
		for (int i = 0; i < elementData.length; i++) {
			if (elementData[i] != null) {
				System.out.println(elementData[i]);
			}
		}
	}

	public void sort() {
		for (int j = 0; j < count - 1; j++) {
			for (int i = 0; i < count - 1; i++) {
				if ((elementData[i].getPrice() > elementData[i + 1].getPrice())) {
					Phone temp = elementData[i];
					elementData[i] = elementData[i + 1];
					elementData[i + 1] = temp;
				}
			}
		}
	}

}
