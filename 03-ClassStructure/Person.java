public class Person {
    String name;
    double weight;
    double height;
    
    public Person(String name) {
        this.name = name;
    }
    

    public Person(String name, double weight, double height) {
        this.name = name;
        this.weight = weight;
        this.height = height;
    }

    public void setWeightAndHeight(double weight,double height) {
        this.weight = weight;
        this.height = height;
    }

    public double calculateBMI() {
        double heightInMeters = this.height/100;
        double BMI = this.weight/Math.pow(heightInMeters,2);
        return BMI;
    }

    public void displayRecord() {
        System.out.print("full info:");
        System.out.print(" name:" + this.name);
        System.out.print(" weight:" +this.weight);
        System.out.print(" height:" +this.height);
        if (calculateBMI() > 24.9) {
            System.out.print(" BMI:"+calculateBMI() + " BMI too high");   
        } else if (calculateBMI() < 18.5) {
           System.out.print(" BMI:"+calculateBMI() + " BMI too low"); 
        } else {
            System.out.print(" BMI:"+calculateBMI());
        }
    }

    public static void main(String[] args) {
        Person p = new Person("Mike");
        p.setWeightAndHeight(76, 190);
        p.displayRecord();
    }
}
