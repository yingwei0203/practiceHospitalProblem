
public class Temprature {
	private Location location;
	private double temperature;
	public Temprature(double temperature) {
		this.temperature = temperature;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature, Location location) {
		this.temperature = temperature;
		this.location = location;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	public double transferInFahrenheit() {
		return (temperature * (9 / 5.0) + 32);
	}
}
