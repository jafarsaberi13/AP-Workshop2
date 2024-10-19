public class Main1 {
    public static void main(String[] args) {
        Lab lab = new Lab("MR Smith", "Monday", 30);
        Student student = new Student("James", "Gosling", "0987854");
        Student student1 = new Student("Dennis", "Richie", "1234567");

        student.setGrade(18.0);
        student1.setGrade(17.5);

        student.printStudentInfo(student);
        student1.printStudentInfo(student1);
        lab.printLabInfo((18.0 + 17.5) / 2 ,lab, 2);
    }
}