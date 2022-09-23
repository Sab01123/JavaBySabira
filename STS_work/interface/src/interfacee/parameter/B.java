package interfacee.parameter;

public class B implements A{

	@Override
	public void fun1() {
		System.out.println("fun1 B");
		
	}

	@Override
	public void fun2() {
System.out.println("fun2 B");		
	}
	
	//sepecific fun 
	void fun3()
	{
		System.out.println("fun3 B");
	}
}
