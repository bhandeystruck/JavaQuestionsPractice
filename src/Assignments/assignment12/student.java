package Assignments.assignment12;

public class student {
    private int roll;
    private String name;
    private String nationality;


    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }


    public void displayDetails(){
        System.out.println("Roll of student : "+ this.roll);
        System.out.println("Name of student : "+ this.name);
        System.out.println("Nationality of student : "+ this.nationality);


    }
}
