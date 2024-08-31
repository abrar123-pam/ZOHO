import java.util.*;

class Minimum_flip {

    public static String convert(int num){
        String s = "";
        while(num > 1){
            int rem = num % 2;
            s += rem+"";
            num /= 2;
        }

        return s;

    }

    public static int minBitFlips(int start, int goal) {
        String stBinary = convert(start);
		System.out.println(stBinary);
        String goalBinary = convert(goal);
		System.out.println(goalBinary);

        int count = 0;
        for(int i=0;i<stBinary.length();i++){
            if(stBinary.charAt(i) != goalBinary.charAt(i))
                count++;
        }

        return count;
    }
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		
		minBitFlips(s,e);
	}
}