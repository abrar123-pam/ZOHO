import java.util.*;

class Student implements Comparable<Student>{
	public String name;
	public int roll_no;
	public String Rand;
	
	Student(String name,int roll_no,String Rand){
		this.name = name;
		this.roll_no = roll_no;
		this.Rand = Rand;
	}
	
	public int compareTo(Student s){
		return this.Rand.compareTo(s.Rand);
	}	
}


class main{
	
	public static void main(String[] args){
		
		ArrayList<Student> list = new ArrayList<>();
		list.add(new Student("Abrar",4,"1332343"));
		list.add(new Student("DAM",14,"121143"));
		list.add(new Student("BASH",12,"34343"));
		list.add(new Student("Cohli",18,"98332343"));
		
		Collections.sort(list,new IdComparator());
		
		for (Student r : list){
            System.out.println(r.name + " " + r.roll_no +" "+r.Rand);
        }
        System.out.println("*******************************************************");
		
		
		
	}
}