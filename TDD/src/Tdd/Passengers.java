package Tdd;

public class Passengers 
{
	private String name;
	private boolean vip;
	public Passengers(String name, boolean vip) {
		this.name = name;
		this.vip = vip;
	}
	public String getName() {
		return name;
	}
	public boolean isVip() {
		return vip;
	}
}
