package abstractt;
abstract class Animal{
	abstract void sound(); 
}

class Dog extends Animal{
	@Override
	void sound() {
		// TODO Auto-generated method stub
		System.out.println("barrks");
		
	}
}
public class Main3 {
	public static void main(String[] args) {
		Dog dog=new Dog();
		dog.sound();
	}

}
