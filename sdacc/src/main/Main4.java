package main;
import emp.Emp;
import manager.Manager;
public class Main4 {
	public static void main(String[] args) {
		Emp emp=new Emp();
		System.out.println(emp.calsal(100));
		
		Manager manager=new Manager();
		System.out.println(manager.calsal(100,100));
	}

}
