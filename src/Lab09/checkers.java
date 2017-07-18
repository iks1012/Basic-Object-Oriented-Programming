package Lab09;
//for tictactoe change rows and cols to 3 and 3
public class checkers{
    public static void main(String args[]){
        final int ROWS = 3;
        final int COLUMNS = 3;
        boolean[] rowsStr = new boolean[ROWS];
        boolean[] colsStr = new boolean[COLUMNS];
        boolean minorD = true;
        boolean majorD = true;
    	int[][] checkers = new int[ROWS][COLUMNS];
    	for(int i = 0; i < ROWS; i++){
    		for(int j = 0; j < COLUMNS; j++){
    			checkers[i][j] = (int)Math.round(Math.random());
    			rowsStr[j] &= (j>=1) ? ((checkers[i][j] == checkers[i][j-1]) ? true : false) : ((checkers[i][j] == checkers[i][j+1]) ? true : false);
    			colsStr[i] &= (i>=1) ? ((checkers[i][j] == checkers[i-1][j]) ? true : false) : ((checkers[i][j] == checkers[i+1][j]) ? true : false);
    			if((i>0 && j>0 && i == j))
    				majorD &= (checkers[i-1][i-1] == checkers[i][i]);
    			if((j==(ROWS-i-1) && i > 0 && i < ROWS-2))
    				minorD &= (checkers[i][(ROWS-1-i)] == checkers[i-1][ROWS-2-i]);
    				
    		}
    	}
    	for(int i = 0 ; i < ROWS; i++){
    		for(int j = 0; j < COLUMNS; j++)
    			System.out.print(checkers[i][j]);
    		System.out.println("");
    	}
    		
    	if(majorD){
    		System.out.println("All "+ checkers[0][0] + "'s on the major diagonal");
    	}
    	if(minorD){
    		System.out.println("All "+ checkers[0][ROWS-1] + "'s on the minor diagonal");
    	}
    	for(int i = 0; i < ROWS; i++){
    		if(rowsStr[i]){
    			System.out.println("All "+ checkers[i][0] + "'s on row " + i);
    		}
    	}
    	for(int i = 0; i < COLUMNS; i++){
    		if(colsStr[i]){
    			System.out.println("All "+ checkers[0][i] + "'s on column " + i);
    		}
    	}
    }
}
/** OUTPUT For 3x3
010
100
010
All 0's on the major diagonal
All 0's on the minor diagonal
All 0's on column 2
**/