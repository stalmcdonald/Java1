package SS;

public class Moon implements solarsystem {
	String name;
	double amount;
	
	public Moon(String name,double amount){
		setLargestMoon(name);
		setNumberofMoons(amount);
	}
	@Override
	public boolean setLargestMoon(String name) {
		this.name = name;
			return true;
		
	}

	@Override
	public boolean setNumberofMoons(double amount) {
		this.amount = amount;
			return true;
	}

	@Override
	public String getLargestMoon() {
		return this.name;
	}

	@Override
	public double getNumberofMoons() {
		return this.amount;
	}

}
