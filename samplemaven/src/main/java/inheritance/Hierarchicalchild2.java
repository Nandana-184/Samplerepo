package inheritance;

public class Hierarchicalchild2 extends Hierarchicalparent{

	public static void main(String[] args) {
		Hierarchicalchild2 obj = new Hierarchicalchild2();
		obj.display();
		obj.display2();
		// TODO Auto-generated method stub

	}
	public void display2()
	{
		System.out.println("this is the child B");
	}
}
