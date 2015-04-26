package oop.task_0;


public class Airline {

	private  String destination;
	private int flightNumber;
	private String flyTypel;
	private double timeFlight;
	private String dayOfWeak;


	
	
	public Airline(String destination, int flightNumber, String flyTypel,
			double timeFlight, String dayOfWeak) {

		setDestination(destination);
		setFlightNumber(flightNumber);
		setFlyTypel(flyTypel);
		setTimeFlight(timeFlight);
		setDayOfWeak(dayOfWeak);

	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		if(destination=="Киев" || destination=="Харьков" || destination=="Львов" || destination=="Одесса")
		this.destination = destination;
		else throw new IllegalArgumentException(
				"Exception: Entered incorrect destination");
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		if (flightNumber > 0)
			this.flightNumber = flightNumber;
		else
			throw new IllegalArgumentException(
					"Exception: Can't be given negative flight number");
	}

	public String getFlyTypel() {
		return flyTypel;
	}

	public void setFlyTypel(String flyTypel) {
		this.flyTypel = flyTypel;
	}

	public double getTimeFlight() {
		return timeFlight;
	}

	public void setTimeFlight(double timeFlight) {
		this.timeFlight = timeFlight;
	}

	public String getDayOfWeak() {
		return dayOfWeak;
	}

	public void setDayOfWeak(String dayOfWeak) {
		if (dayOfWeak == "понедельник" || dayOfWeak == "вторник"
				|| dayOfWeak == "среда" || dayOfWeak == "четверг")
			this.dayOfWeak = dayOfWeak;
		else
			throw new IllegalArgumentException(
					"Exception: Entered incorrect day of weak");
	}

	
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();

		result.append(" destination from : " + getDestination());
		result.append(" flightNumber: " + getFlightNumber());
		result.append(" flyType : " + getFlyTypel());
		result.append(" timeFlight: " + getTimeFlight());
		result.append(" dayOfWeak: " + getDayOfWeak());
		result.append("}");

		return result.toString();

	}

}
