public class Student  {
    String name;
    int age;
    String idCard;
    boolean isValid;
    int semNum;
    float avGrade;

    void sayHello() {
        System.out.println("Hello from " +name);
    }

    void displayName() {
        System.out.println(name);
    }

    void displayAge() {
        System.out.println(age);
    }

    void introduceStudent() {
        System.out.println("Student id: " + idCard + " is id valid?: " + isValid + " Semester: " + semNum + " average grade: "  + avGrade);
    }

    void studentInfo() {
        String validity = (isValid) ? "Id is valid" : "Id is not valid";
        System.out.println(name + " " + semNum + " " + avGrade + " " + validity);
    }
}