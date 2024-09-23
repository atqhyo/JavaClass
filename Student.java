import java.text.*;
import java.util.Scanner;

public class Student {
    private String name;
    private int[] scores;
    private double averageScore;

    public Student(String name, int[] scores){
        this.name = name; 
        this.scores = scores;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setScores(int[] scores){
        this.scores = scores;
    }

    public String getName(){
        return name;
    }
    public int[] getScores(){
        return scores;
    }

    public double calculateAverage(){
        int total = 0;

        for (int score: scores){
            total = total + score;
        }
        averageScore = total / (double) scores.length;
        return averageScore;
    }

    public String assignGrade(){
        String grade = "";

        if(averageScore >= 90){
            grade = "A";
        }
        if(averageScore >= 80 && averageScore <= 89 ){
            grade = "B";
        }
        if(averageScore >= 70 && averageScore <= 79){
            grade = "C";
        }
        if(averageScore >= 60 && averageScore <= 69){
            grade = "D";
        }
        if(averageScore <= 60){
            grade = "Fail";
        }

        return grade;
    }

    // public static void main(String[] args) {
    //     Student[] students = new Student[5];

    //     students[0] = new Student("Faree",  new int[]{83, 76, 90});
    //     students[1] = new Student("Mai",  new int[]{65, 78, 88});
    //     students[2] = new Student("Sab",  new int[]{80, 68, 94});
    //     students[3] = new Student("Rara",  new int[]{69, 87, 72});
    //     students[4] = new Student("Khai",  new int[]{76, 93, 85});

    //     for (int i = 0; i<students.length; i++){
    //         System.out.println("\nStudents: " + students[i].getName() + "\nAverage score: " + students[i].calculateAverage() + "\nGrade: " + students[i].assignGrade());
    //     }
    // }

    // public static void main(String[] args) {
    //     Student[] students = new Student[5];

    //     Scanner sc = new Scanner(System.in);
    //     //DecimalFormat df = new DecimalFormat("#.##");

    //     for(int i = 0; i>students.length;i++){
    //         System.out.println("\nEnter Student Name: " + (i + 1) + ":");
    //         String name = sc.nextLine();

    //         int[] scores = new int[3];

    //         System.out.println("Enter Math Score: ");
    //         scores[0] = sc.nextInt();

    //         System.out.println("Enter Science Score: ");
    //         scores[1] = sc.nextInt();
            
    //         System.out.println("Enter English Score: ");
    //         scores[2] = sc.nextInt();

    //         students[i] = new Student(name, scores);
    //     }

    //     for (Student student : students) {
    //         System.out.println("\nStudent: " + student.getName());
    //         System.out.println("Average Score: " + student.calculateAverage());
    //         System.out.println("Grade: " + student.assignGrade());
    //         System.out.println("-------------");
    //     }

    //     sc.close();
    // }

    public static void main(String[] args) {
        Student[] students = new Student[5];
        
        Scanner scanner = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#.##");
        
        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter the name of student " + (i + 1) + ":");
            String name = scanner.nextLine();
            
            int[] scores = new int[3];
            System.out.println("\nEnter the Math score for " + name + ":");
            scores[0] = scanner.nextInt();
            System.out.println("Enter the Science score for " + name + ":");
            scores[1] = scanner.nextInt();
            System.out.println("Enter the English score for " + name + ":");
            scores[2] = scanner.nextInt();
            scanner.nextLine();
            
            students[i] = new Student(name, scores);
        }
        
        for (int i = 0; i<students.length; i++){
            System.out.println("\nStudents: " + students[i].getName() + "\nAverage score: " + df.format(students[i].calculateAverage()) + "\nGrade: " + students[i].assignGrade());
        }
        
        scanner.close();
    }

}

