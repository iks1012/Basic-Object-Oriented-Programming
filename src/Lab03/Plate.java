package Lab03;

public class Plate {

	public static void main(String[] args) {
		char data[] = new char[8];
		data[3] = '-';
		for(int x=0; x<8; x++){
			if(x==3){
				//do nothing because of the '-'
				System.out.print(data[x]);
			}
			else if(x>=0 && x<=2){
				data[x] = (char)((int)(Math.random()*(90-65+1)+65));
				System.out.print(data[x]);
			}
			else{
				data[x] = (char)((int)(Math.random()*(57-48+1)+48));
				System.out.print(data[x]);
			}
		}
	}
}
