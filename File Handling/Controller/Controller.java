package file.Controller;

import file.models.Student;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Controller {

    private String path = "C:\\Users\\inc5540-37\\IdeaProjects\\search\\src\\file\\data.txt";

    public void save(Student student) {
        try {
            FileWriter fw = new FileWriter(path);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(student.toString());
            bw.close();
            System.out.println("Data saved");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void read() {
        try {
            FileReader fr = new FileReader(path);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                Student student = Student.fromCSV(line);
                System.out.println(student.getName() + "\t" + student.getCollegeName());

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
