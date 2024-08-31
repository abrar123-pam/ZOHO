package file;

import file.Controller.Controller;
import file.models.Student;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("abrar",22,"MSAJCE");
        Student student2 = new Student("vishal",21,"VELAMAl");

        Controller controller = new Controller();

        try {
            controller.save(student1);
            controller.save(student2);

            controller.read();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
