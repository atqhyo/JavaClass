public class Person {
    private String gpa;
    private double num;
    private int year;
    private double gpaFirst;
    private double gpaSec;
    private double gpaThird;

    public Person(String gpa, double num, int year, double gpaFirst, double gpaSec, double gpaThird){
        this.gpa = gpa;
        this.num = num;
        this.year = year;
        this.gpaFirst = gpaFirst;
        this.gpaSec = gpaSec;
        this.gpaThird = gpaThird;
    }

    public void displayDetails() {
        //System.out.println(gpa + num + " in " + year + " years of study");
    }

    /*public static void main(String[] args){
        Person person = new Person("My GPA is: ", 3.5, 3);
        person.displayDetails();
    }*/

    public static void main(String[] args) {
        double gpaFirst = 3.4;
        double gpaSec = 3.5;
        double gpaThird = 3.3;
        
        double avgGPA = (gpaFirst + gpaSec + gpaThird)/3;
        System.out.println(avgGPA);
    }
}
