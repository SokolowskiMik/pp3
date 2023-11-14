public class Personas {
    private String name;
    private int age;
    
    public Personas(String name, int age) {
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

    public boolean isAdult() {
        if (this.age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%s,%d",this.name,this.age);
    }
    
    public static void main(String[] args) {
        Personas p = new Personas("Anna",21); 
        System.out.println(p.getAge()); 
        System.out.println(p.isAdult());
        p.setAge(17);
        System.out.println(p.isAdult());
        System.out.println(p.toString()); 
    }
}
