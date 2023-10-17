public class StudentTest {
    public static void main(String[] args) {
        // object creation
        Student s = new Student();

        // object manipulation
        s.name = "Peter";
        s.age = 21;
        s.idCard = "213414";
        s.isValid = true;
        s.semNum = 3;
        s.avGrade = 4.5f;
        System.out.println(s.name + " " + s.age);
        s.sayHello();
        s.displayName();
        s.displayAge();
        s.introduceStudent();
        s.studentInfo();

        Student s2 = new Student();
        s2.name = "Mike";
        s2.age = 20;
        s2.idCard = "215414";
        s2.isValid = false;
        s2.semNum = 3;
        s2.avGrade = 2.0f;
        System.out.println(s2.name + " " + s2.age);
        s2.sayHello();
        s2.displayName();
        s2.displayAge();
        s2.studentInfo();
    }
}
