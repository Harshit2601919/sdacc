package display;
class Emp{
	public String name;
	public int id;
	public double sal;
	public String address;
	
	public Emp(String name,int id,double sal,String address) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.id=id;
		this.sal=sal;
		this.address=address;
	}
	
	public void displayinfo() {
		System.out.println(name+id+sal+address);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+id+sal+address;
	}
}

public class Main1 {
	public static void main(String[] args) {
		Emp emp=new Emp("tom",1,933,"ehjv");
		emp.displayinfo();
		System.out.println(emp.toString());
	}

}
