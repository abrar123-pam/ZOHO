package test;

public class bitcheck {
    public static void main(String[] args) {
        int x = 13;

        int a = 10;
        int b = 20;
//        -----------------------------------------------------

        //Set or Not set    -> (n & (1 << i) != 0)
        //Set the ith bit   -> (n | (1 << i)
        //Clear the ith bit -> (n & ~(i<<2))
        // toggle           -> a = (a ^ (1 << 2));
        //Remove last st    -> (n & n-1)
        //Remove   last bit -> (n & n-1)
        //power of 2        -> (n & n-1) == 0
        //for Remainder     -> (n & 1) == 1
        //for division      -> (n >> 1)










//        -------------------------------------------------------
//
//        System.out.println(a);
//        System.out.println(b);
//
//        a = a^b;
//        b = a^b;
//        a = a^b;
//
//        System.out.println(a);
//        System.out.println(b);

//        int i = 1;
//        //Set or not set
//        if((a & (1 << i)) != 0){
//            System.out.println(a + " is a bit");
//        }else{
//            System.out.println(a + " is not a bit");
//        }

        //set the bit
        System.out.println(a);
        //a = (a | (1<<2));
       // a = (a & ~(1 <<1));
        a = (a ^ (1 << 2));
        System.out.println(a);
    }
}
