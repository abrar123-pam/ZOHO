import java.io.Serializable;

class Data implements Serializable{
	
	private String name;
	private int regNo;
	transient private String dept;
	
	Data(String name,int RegNo,String dept){
		this.name = name;
		this.regNo = regNo;
		this.dept = dept;
	}
	
	public void display(){
		
		System.out.println(name + regNo + dept);
	}
}