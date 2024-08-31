import java.util.*;

class ChessBoardCOlor {
    public boolean squareIsWhite(String coordinates) {
        if(coordinates.charAt(0) % 2 == 0 && coordinates.charAt(1) % 2 != 0){
			return true;
		}else if(coordinates.charAt(0) % 2 != 0 && coordinates.charAt(1) % 2 == 0){
			return true;
		}
		
		return false;
    }
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		System.out.println(squareIsWhite(s));
	}
}