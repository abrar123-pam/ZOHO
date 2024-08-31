package test;

public class increasingstring {

        public static  String sortString(String s) {
            StringBuilder sb = new StringBuilder();

            pickSmallestChar(sb,s);

            pickSecondSmallest(sb,s);
            return "";
        }

    private static void pickSecondSmallest(StringBuilder sb, String s) {

    }

    public static void pickSmallestChar(StringBuilder sb,String s){
            char[] ch = s.toCharArray();
            char smallest = ch[0];
            for(int i=1;i<s.length();i++){
                if(ch[i] < smallest){
                    smallest = ch[i];
                }
            }
            sb.append(ch) ;
            System.out.println(smallest);
        }

    public static void main(String[] args) {
        String s = "aaaabbbbcccc";

        System.out.println(sortString(s));
    }
}
