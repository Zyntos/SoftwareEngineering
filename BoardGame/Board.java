

public class Board {
	
	private String field[][] = new String[3][3];
	private final String SIGN_X = "X";
	//private final String SIGN_O = "O";	//Player2
	
	public Board() {
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 3; j++) {
				field[i][j] = (" ");
			}
		}
	}
	
	public void setMark(String mark, int x, int y) throws InvalidPositionException {
		if((x == 0 || x == 1 || x == 2) && (y == 0 || y == 1 || y == 2))
			this.field[x][y] = mark;
		else 
			throw new InvalidPositionException();
	}
	
	public boolean hasWinner() {
		boolean winnerX = false;
		boolean winnerO = false;
		
		//Rows
		if(field[0][0].equals(SIGN_X) && field[0][1].equals(SIGN_X) && field[0][2].equals(SIGN_X)) {
			winnerX = true;
		}
		else if (field[1][0].equals(SIGN_X) && field[1][1].equals(SIGN_X) && field[1][2].equals(SIGN_X)) {
			winnerX = true;
		}
		else if (field[2][0].equals(SIGN_X) && field[2][1].equals(SIGN_X) && field[2][2].equals(SIGN_X)) {
			winnerX = true;
		}
		
		//Columns
		if(field[0][0].equals(SIGN_X) && field[1][0].equals(SIGN_X) && field[2][0].equals(SIGN_X)) {
			winnerX = true;
		}
		else if (field[0][1].equals(SIGN_X) && field[1][1].equals(SIGN_X) && field[2][1].equals(SIGN_X)) {
			winnerX = true;
		}
		else if (field[0][2].equals(SIGN_X) && field[1][2].equals(SIGN_X) && field[2][2].equals(SIGN_X)) {
			winnerX = true;
		}
		
		
		if(field[0][0].equals(SIGN_X) && field[1][1].equals(SIGN_X) && field[2][2].equals(SIGN_X)) {
			winnerX = true;
		}
		else if (field[0][2].equals(SIGN_X) && field[1][1].equals(SIGN_X) && field[2][0].equals(SIGN_X)) {
			winnerX = true;
		}
		
	
		
		return winnerX || winnerO;
	}
}
