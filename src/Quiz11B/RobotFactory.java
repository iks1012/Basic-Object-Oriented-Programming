package Quiz11B;

public class RobotFactory {

	public static void main(String[] args) {
		Robot r1 = new Robot("R2-D2");
		r1.start();
		r1.work();
		r1.stop();
		
		Robot r2 = new WasteDisposalRobot("C-3PO");
		((Robot)r2).work();
		r2.work();
		
		r2 = new ToxicWasteDisposalRobot("Wall-E", "Uranium"); //we can use r2 b/c polymorphism
		r2.work();
		
		//wasteDisposalRobot r3 =  new Robot("Optimus Prime");
		// ^ that will not compile bc not every robot isA waste disposal robot.
	}

}
