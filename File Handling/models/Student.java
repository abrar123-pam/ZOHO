package file.models;

public class Student {
    private String name;
    private int age;
    private String collegeName;

    public Student(String name, int age, String collegeName) {
        this.name = name;
        this.age = age;
        this.collegeName = collegeName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        // Output format suitable for CSV
        return name + "," + age + "," + collegeName;
    }

    public static Student fromCSV(String csv) {
        String[] tokens = csv.split(",");
        return new Student(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
    }

}
