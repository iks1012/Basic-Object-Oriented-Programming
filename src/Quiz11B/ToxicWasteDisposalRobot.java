package Quiz11B;

public class ToxicWasteDisposalRobot extends WasteDisposalRobot{
	protected String wasteType;

	public ToxicWasteDisposalRobot(String name, String wasteType) { // Notice how String name is there... especially how its the parameter for the parent class
		super(name);
		this.wasteType = wasteType;
	}
	
	
	@Override
	public void work(){
		System.out.println("Toxic Waste Robot " + name + " is cleaning up " + wasteType);
		
	}
	
	
}
