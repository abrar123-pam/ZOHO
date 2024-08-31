import java.util.Comparator;

public class IdComparator implements Comparator<Student>{
		
	@Override
	public int compare(Student s1,Student s2){
		return s1.roll_no - s2.roll_no;
	}
}