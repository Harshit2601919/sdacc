package acc;
import policyImp.Company;
public class Account extends Company {
	@Override
	public double calsal(double sal) {
		// TODO Auto-generated method stub
		return sal;
	}
	@Override
	public double calsal(double sal, double bonus) {
		// TODO Auto-generated method stub
		return sal+bonus;
	}
	@Override
	public double calsal(double sal, double bonus, double tax) {
		// TODO Auto-generated method stub
		return sal+bonus-tax;
	}

}
