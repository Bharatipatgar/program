public class StudentDetails {
  public static void main(String args[]) {
      
      Student student = new Student();
      student.name = "Bharti";
      student.age = 22;
      student.studentID = "S12345";
      student.gradeLevel = "3rd Year";
      student.major = "Computer Science";

      System.out.println("Name of the student: " + student.name);
      System.out.println("Age of student: " + student.age);
      System.out.println("ID of the student: " + student.studentID);
      System.out.println("Grade level of student: " + student.gradeLevel);
      System.out.println("Major taken by student: " + student.major);

      
      Student student1 = new Student();
      student1.name = "Indu";
      student1.age = 24;
      student1.studentID = "S12346";
      student1.gradeLevel = "1st Year";
      student1.major = "Mathematics";

      System.out.println("Name of the student: " + student1.name);
      System.out.println("Age of student: " + student1.age);
      System.out.println("ID of the student: " + student1.studentID);
      System.out.println("Grade level of student: " + student1.gradeLevel);
      System.out.println("Major taken by student: " + student1.major);

      
      Student student2 = new Student();
      student2.name = "Deepu";
      student2.age = 20;
      student2.studentID = "S12347";
      student2.gradeLevel = "2nd Year";
      student2.major = "Science";

      System.out.println("Name of the student: " + student2.name);
      System.out.println("Age of student: " + student2.age);
      System.out.println("ID of the student: " + student2.studentID);
      System.out.println("Grade level of student: " + student2.gradeLevel);
      System.out.println("Major taken by student: " + student2.major);

      
      Student student3 = new Student("Kumud", 21, "S12348", "4th Year", "Civil Engineering");
      Student student4 = new Student("Chandu", 25, "S12349", "5th Year", "English");
      Student student5 = new Student("Kusum", 26, "S12341", "6th Year", "Electrical Engineering");
      Student student6 = new Student("Ramya", 27, "S12342", "7th Year", "Mechanical Engineering");
      Student student7 = new Student("Dhanya", 28, "S12343", "8th Year", "Machine Learning");
      Student student8 = new Student("Prachi", 29, "S12344", "9th Year", "Social Science");
      Student student9 = new Student("Vibha", 30, "S12345", "10th Year", "Arts");

      
      student3.StudentInfo();
      student4.StudentInfo();
      student5.StudentInfo();
      student6.StudentInfo();
      student7.StudentInfo();
      student8.StudentInfo();
      student9.StudentInfo();
  }
}
