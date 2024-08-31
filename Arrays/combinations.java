package Practice;
import java.util.*;


public class combinations {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list =  new ArrayList<>();

        recursive(result,list,1,n,k);

        return result;
    }

    public static void recursive(List<List<Integer>> result,List<Integer> list,int st,int n, int k){
        if(list.size() == k){
            result.add(new ArrayList<>(list));
            return;
        }


        for(int i = st;i<=n;i++){
            list.add(i);
            recursive(result,list,i+1,n,k);
            list.remove(list.size() -1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> ans = combine(4,2);
        System.out.println(ans);
    }
}
