package interfaces;
interface Appliance{
	public static final int a=10;
	public abstract void turnson();
	public abstract void turnsoff();
	
}

class Light implements Appliance{
	@Override
	public void turnsoff() {
		// TODO Auto-generated method stub
		System.out.println("turnoff");
		
	}
	@Override
	public void turnson() {
		// TODO Auto-generated method stub
		System.out.println("turnson");
		
	}
}
public class Main4 {
	public static void main(String[] args) {
		Light light=new Light();
		light.turnsoff();
		light.turnson();
		System.out.println(Light.a);
	}

}
