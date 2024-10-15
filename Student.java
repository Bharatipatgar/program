public class Student {
    String name;
    int age;
    String studentID;
    String gradeLevel;
    String major;

    
    public Student() {
        System.out.println("No parameterized constructor");
    }

    
    public Student(String name, int age, String studentID, String gradeLevel, String major) {
        this.name = name;
        this.age = age;
        this.studentID = studentID;
        this.gradeLevel = gradeLevel;
        this.major = major;
    }

    
    public void study() {
        System.out.println(name + " is studying.");
    }

    
    public void takeExam() {
        System.out.println(name + " is taking an exam.");
    }

    
    public void StudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Student ID: " + studentID);
        System.out.println("Grade Level: " + gradeLevel);
        System.out.println("Major: " + major);
    }
}

