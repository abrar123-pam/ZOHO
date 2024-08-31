import java.util.*;
import java.io.*;
class Serial{
	
	public static void main(String[] args){
		try{
			Data data = new Data("Abrar",04,"CSE");
			
			FileOutputStream fos = new FileOutputStream("ob.txt");
			
			ObjectOutputStream os = new ObjectOutputStream(fos);
			
			os.writeObject(data);
			os.close();
			fos.close();
			
			System.out.println("oos state created");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		try{
			FileInputStream fs = new FileInputStream("ob.txt");
			
			ObjectInputStream oi = new ObjectInputStream(fs);
			
			Data data = (Data)oi.readObject();
			data.display();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}