public class StudentOne {
    private String name;
    private int age;

    /* mozna tworzyc klikaajac prawym source action i tam wybieramy construktor albo getter albo setter */
    public StudentOne(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
}
