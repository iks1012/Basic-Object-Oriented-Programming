package Homework6;

public class CarRepairShop {	
	private int length = 100000;//10000000

	private String[] VIN = new String[length];
	private String[] desc = new String[length];
	private String[] make  = new String[length];
	private String[] VINTix = new String[length];
	
	private int[] year = new int[length];
	private int[] ticketNumber = new int[length];
	
	private double[] cost = new double[length];
	
	private int x = 0; //UNIVERSAL COUNTER FOR CAR ENTRY

	private int y = 0; //UNIVERSAL COUNTER FOR CARTIX

	public String[] expandString(String[] str){
		String[] tempStr = new String[length];
		for(int i = 0; i < str.length ; i++)
			tempStr[i] = str[i];
		str = new String[length];
		for(int i = 0; i < length; i++)
			str[i] = tempStr[i];
		return str;
	}
	
	public int[] expandInt(int[] nums){
		int[] tempInt = new int[length];
		for(int i = 0; i < nums.length ; i++)
			tempInt[i] = nums[i];
		nums = new int[length];
		for(int i = 0; i < length; i++)
			nums[i] = tempInt[i];
		return nums;
	}
	
	public double[] expandDouble(double[] nums){
		double[] tempDouble = new double[length];
		tempDouble = new double[length];
		for(int i = 0; i < nums.length ; i++)
			tempDouble[i] = nums[i];
		nums = new double[length];
		for(int i = 0; i < length; i++)
			nums[i] = tempDouble[i];
		return nums;
	}
	
	public void expandArrays(){
		length *= 2;
		VIN = expandString(VIN);
		make = expandString(make);
		desc = expandString(desc);
		year = expandInt(year);
		ticketNumber = expandInt(ticketNumber);
		cost = expandDouble(cost);
	}
	
	public int addNewCar(String vin, String make, int year) {
		boolean doesntContain = true;
		
		for(int i = 0; i < length; i++){
			if(VIN[i]!=null && VIN[i].equals(vin))
				doesntContain &= false;
		}
		if(x >= (VIN.length)){
			expandArrays();
		}
		if(doesntContain){
			VIN[x] = vin;
			this.make[x] = make;
			this.year[x] = year;
			x++;
			return x;
		}
		else{
			return -1;
		}
	}
	
	public int addRepairTicket(String vin, double cost, String description) {
		boolean flag = false;
		for(int i = 0; i < x  && !flag; i++){
			if(VIN[i].equals(vin)){
				flag = true;
			}
			
		}

		if(flag){
			this.VINTix[y] = vin;
			this.cost[y] = cost;
			this.desc[y] = description;
			ticketNumber[y] = ++y;
			return ticketNumber[(y-1)];
		}
		else
			return -1;
	}
	
	public double getRepairCost(int ticketNum) {
		ticketNum--;
		if(ticketNumber[ticketNum] != 0){
			return cost[ticketNum];
		}
		else{
			return -1;
		}
	}
	
	public double getTotalRepairCosts(String vin) {
		double finalCost = 0;
		boolean flag = false;
		for(int i = 0; i < y; i++){
			if(VINTix[i].equals(vin)){
				finalCost += cost[i];
				flag |= true;
			}
			else{
				flag |= false;
			}
		}
		
		if(flag){
			return finalCost;
		}
		else{
			return -1;
		}
	}

	public String getWorstCarMake() {
		String highestVIN = "";
		int maxVal = 0;
		int[] count = new int[x];
		for(int i = 0; i < x; i++){
			for(int j = 0; j < y; j++){
				if(VIN[i].equals(VINTix[j])){
					count[i]++;
				}
				else{
					//do nothing
				}
				
			}
		}
		for(int i = 0; i < x; i++){
			if(count[i] > maxVal){
				maxVal = count[i];
				highestVIN = VIN[i];
			}
		}
		
		if(maxVal == 0){
			return null;
		}
		else{
			return highestVIN;
		}
	}
	
	public boolean updateRepairCost(int ticketNum, double newCost) {
		ticketNum--;
		if(cost[ticketNum] != 0){
			cost[ticketNum] = newCost;
			return true;
		}
		else{
			return false;
		}
	}
	
	public boolean deleteRepair(int ticketNum) {
		ticketNum--;
		if(ticketNumber[ticketNum] == 0){
			return false;			
		}
		else{
			VINTix[ticketNum] = "";
			cost[ticketNum] = 0;
			desc[ticketNum] = "";
			ticketNumber[ticketNum] = 0;
			return true;
		}
	}
	
	public boolean deleteAllRepairsForCar(String vin) {
		boolean returnThis = false;
		for(int i = 0; i < y; i++){
			 if(VINTix[i].equals(vin)){
				VINTix[i] = "";
				cost[i] = 0;
				desc[i] = "";
				ticketNumber[i] = 0;
				returnThis |= true;
			 }
			 else{
				 returnThis|=false;
			 }
			 
		}
		return returnThis;
	}
	
	public boolean deleteCarAndRepairs(String vin) {
		boolean returnThis = false;
		for(int i = 0; i < x && !returnThis; i++){
			if(VIN[i].equals(vin)){
				returnThis |= true;
				VIN[i] = "";
				make[i] = "";
				year[i] = 0;
			}
		}
		for(int i = 0; i < y; i++){
			if(VINTix[i].equals(vin)){
				VINTix[i] = "";
				cost[i] = 0;
				desc[i] = "";
			}
		}
		
		return returnThis;
	}
}
