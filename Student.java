public class Student {
    private String name;
    private int scores[] = {0,0,0};
    private double averageScore;

    public Student(String name, int[] scores){
        this.name = name; 
        this.scores = scores;
    }

    public void setStudent(String name, int[] scores){
        this.name = name; 
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
        averageScore = total / 3;
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

    public static void main(String[] args) {
        Student[] students = new Student[5];

        students[0] = new Student("Faree",  new int[]{83, 76, 90});
        students[1] = new Student("Mai",  new int[]{65, 78, 88});
        students[2] = new Student("Sab",  new int[]{80, 68, 94});
        students[3] = new Student("Rara",  new int[]{69, 87, 72});
        students[4] = new Student("Khai",  new int[]{76, 93, 85});

        for (int i = 0; i<students.length; i++){
            System.out.println("\nStudents: " + students[i].getName() + "\nAverage score: " + students[i].calculateAverage() + "\nGrade: " + students[i].assignGrade());
        }
    }

}

