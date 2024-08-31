import java.util.*;
class UniquePath
{
    public static void main(String args[])
    {
        String all = "zabcdefghijklmnopqrstuvwxyz";
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = s.length();
        Set<String> set = new HashSet<>();
        for(int i = 0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                String t = s.substring(i,j+1);
                if(all.contains(t))
                    set.add(t);
            }

        }
        System.out.println(set.size());
    }
}
/*class UniquePath{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String input = sc.next();
		
		method(input);
	}
	
	public static void method(String input){
		HashSet<String> set = new HashSet<>();
		String all = "zabcdefghijklmnopqrstuvwxyz";
		int j =0;
		for(int i=0;i<input.length();i++){
			recursive(input,set,j,i,all);
		}
		
		System.out.println(set.size());
		
	}
	
	public static void recursive(String input,HashSet<String> set, int j,int i,String all){
		if(i >= input.length()){
			return;
		}
		
		 String t = input.substring(j, i + 1);
         if(all.contains(t))
            set.add(t);
        recursive(input, set, j, i + 1,all);
	}
}*/