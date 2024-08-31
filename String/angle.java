import java.util.*;

class angle
{
    static int calcAngle(double h, double m)
    {
        if (h <0 || m < 0 || h >12 || m > 60)
            System.out.println("Wrong input");
 
        if (h == 12)
            h = 0;
             if (m == 60)
			   {
				m = 0;
				h += 1;
				if(h>12)
				  h = h-12;
				} 
 
 

        int hour_angle = (int)(0.5 * (h*60 + m));
        int minute_angle = (int)(6*m);
 
        int angle = Math.abs(hour_angle - minute_angle);
 
        angle = Math.min(360-angle, angle);
 
        return angle;
    }
     
    public static void main (String[] args) 
    {
        Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		String[] arr = s.split(":");
		
		System.out.println(calcAngle(Double.parseDouble(arr[0]),Double.parseDouble(arr[1])));
    }
}


 