public class Method{
	public static void main(String[] args) {
		m1();
		m2(2);
	//	m3();
	//	m4(2);
		Method m=new Method();
		m.m3();
		m.m4(2);
		System.out.println("I'm Integer Method : "+m.add(2,3));	
		m.m5();

		Child c=new Child();
		//System.out.println("I'm Abstact Method:"+c.run());
		//void Cannot be concatinated
		c.run();
	}

	public static void m1() 
	{
		System.out.println("I'm Non Parameterized Method.");	
	}

	public static void m2(int a)
	{
		System.out.println("I'm Parameterized Method.");
	}

	public void m3()
	{
		System.out.println("I,m Non Static Non Parameterized Method, Cannot Referenced From Static Content");
	}

	public void m4(int a)
	{
		System.out.println("I'm static Parameterized Method. Cannot Referenced From Static Content");
	}

	public int add(int a,int b)
	{
		return a+b;
	}

	final void m5(){
		System.out.println("I'm Final Method.");
	}

	
}

abstract class Run{
	abstract void run();
}

class Child extends Run 
{
    void run() {
        System.out.println("I'm Abstract Method Implemented in Child Class.");
    }
}