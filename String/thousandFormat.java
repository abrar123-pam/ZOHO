import java.util.*;

class thousandFormat{

	public static String checkFormat(String s){
		StringBuilder sb = new StringBuilder();
        if(n==0) return "0";
        int i=1;
        while(n >0){
            sb.append(String.valueOf(n%10));
            n /= 10;
            if(i % 3 == 0&& n > 0){
                sb.append(".");
            }
            i += 1;
        }

        return String.valueOf(sb.reverse());
	
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in );
		String ip = sc.next();
		
		System.out.println(checkFormat(ip));
	}
}