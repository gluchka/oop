package oop.task_0_1;

import java.util.ArrayList;

public class Client {

	private static int clientId;
	public static String name;
	public static String surname;

	static ArrayList<Client> client = new ArrayList<Client>();

	public Client(int clientId, String name, String surname) {
		setClientId(clientId);
		this.name = name;
		this.surname = surname;
	}

	public static void main(String []args) {
		client.add(new Client(1, "ivan", "sviridov"));
		client.add(new Client(2, "petro", "ternov"));
		client.add(new Client(3, "denys", "kalinin"));
		client.add(new Client(4, "pol", "ress"));
		System.out.println(client.size()+" count of clients");
		System.out.println(client);
		System.out.println("Sorted tarifs by license fee");
		Tarif.sortTarifs();
		Tarif.sortByParametrs(111, 333, 11, 44, 1);
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		if (clientId > 0)
			this.clientId = clientId;
		else
			throw new IllegalArgumentException(
					"Exception: client id must be positive");
	}

}
