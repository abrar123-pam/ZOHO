import java.util.HashMap;
import java.util.Map;

public class distinctIntegers {

    public static int kDistinctChars(int k ,String s){

        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int right = 0;
        int maxSum = 0;

        while (right <s.length()){
            map.put(s.charAt(right), map.getOrDefault(s.charAt(right),0)+1);

            if(map.size() == k){
                int count = 0;
                for(Integer cnt : map.values()){
                    count += cnt;
                }

                maxSum = Math.max(maxSum,count);
            }else if (map.size() > k ){
                map.remove(s.charAt(left));
                left++;
            }
            right++;


        }

        return  maxSum;
    }

    public static void main(String[] args) {
        String s = "abcddefg";

        int ans = kDistinctChars(3,s);
        System.out.println(ans);
    }
}
