import java.util.*;

class DayofTheLeapYear{

	public static int checkDay(String[] arr, Map<Integer,Integer> map){
		
		int mon = Integer.parseInt(arr[1].trim());
		
		int day = Integer.parseInt(arr[2].trim());
		
		if(mon == 1){
			return day;
		}
		
		int sum = 0;
		for(int i=1;i<mon;i++){
			int cdays = map.get(1);
			sum += cdays;
		}
		sum += day;
		
		
		return sum;
		
		
		
	}

	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		String[] arr = input.split("-");
		
		Map<Integer,Integer> map = new HashMap<>();
		
		map.put(1,31);
		map.put(2,28);
		map.put(3,31);
		map.put(4,30);
		map.put(5,31);
		map.put(6,30);
		map.put(7,31);
		map.put(8,31);
		map.put(9,30);
		map.put(10,31);
		map.put(11,30);
		map.put(12,31);
		
		int day = checkDay(arr,map);
		System.out.println(day);
		
	}
}