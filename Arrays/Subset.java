import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class test2 {
    public static void calcSubset(List<Character> A,List<List<Character> > res,List<Character> subset,int index)
    {
        res.add(new ArrayList<>(subset));

        for (int i = index; i < A.size(); i++) {
            subset.add(A.get(i));
            calcSubset(A, res, subset, i + 1);
            subset.remove(subset.size() - 1);
        }
    }

    public static List<List<Character> > subsets(List<Character> A)
    {
        List<Character> subset = new ArrayList<>();
        List<List<Character>> res = new ArrayList<>();

        int index = 0;
        calcSubset(A, res, subset, index);

        return res;
    }

    public static void main(String[] args)
    {
        List<Character> array = Arrays.asList('x','y','z');
        List<List<Character> > res = subsets(array);

		System.out.println(res);

        
    }
}
