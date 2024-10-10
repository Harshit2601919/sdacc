package overloading_overiding;
class Person{
	public void displaydetails(String name) {
		System.out.println("name"+name);
		
	}
	
	public void displaydetails(String name,int age) {
		System.out.println("name"+name+"age"+age);
	}
}

class Emp extends Person{
	@Override
	public void displaydetails(String name, int age) {
		// TODO Auto-generated method stub
		System.out.println("name"+name+"age"+age);
	}
}
public class Main2 {
	public static void main(String[] args) {
		Person person =new Person();
		person.displaydetails("tom");
		person.displaydetails("harru",45);
		
		Emp emp=new  Emp();
		emp.displaydetails("bro", 1);
		
		
	}

}
