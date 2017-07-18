package Review;

public class FunWithSuperAndThis {
	public static void main(String[] args){
		A a = new C();
	}
}
class A{
	public A(){
		System.out.println("A() ");
	}
}
class B extends A{
	public B(){
		this(5);
		System.out.println("B() ");
	}
	public B(int x){
		System.out.println("B(int x) ");
	}
}
class C extends B{
	public C(){
		System.out.println("C() ");
	}
}