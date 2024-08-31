import java.util.*;

class task3{
	
	public static double pow(double f, int n, double res){
		if(n == 0){
			return res;
		}
		
		return pow(f,n-1,res*f);
	}
	
	public static double poww(double f, int n, double res){
		if(n == 0){
			return res;
		}
		
		return pow(f,n+1,res*f);
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double f = sc.nextDouble();
		
		int n = sc.nextInt();
		if(n < 0){
			n =- n;
			f = 1/f;
		}
		double res = 1.000;
		
		double anss = pow(f,n,res);
		System.out.println(anss);
		
		
	}
}