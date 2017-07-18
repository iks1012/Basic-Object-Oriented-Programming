package Quiz11B;

public class Robot {
	protected String name;

	public Robot(String name) {
		this.name = name;
	}
	
	public void start(){
		System.out.println("Robot " + name + " Started");
	}
	
	public void stop(){
		System.out.println("Robot " + name + " Stop");
	}
	
	public void work(){
		System.out.println("Robot " + name + " Working");
	}
	
	
}
