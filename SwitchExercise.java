public class SwitchExercise {
    public static void main(String[] args) {
        String dayName;
        int calories = 1500;

        for (int i = 1; i <= 7; i++){

        switch (i) {
            case 1:
                dayName = "Monday";
                calories = calories + 0;
                break;
            case 2:
                dayName = "Tuesday";
                calories = calories + 0;
                break;
            case 3:
                dayName = "Wednesday";
                calories = calories + 100;
                break;
            case 4:
                dayName = "Thursday";
                calories = calories + 100;
                break;
            case 5:
                dayName = "Friday";
                calories = calories + 100;
                break;
            case 6:
                dayName = "Saturday";
                calories = calories + 100;
                break;
            case 7:
                dayName = "Sunday";
                calories = calories + 0;
                break;
            default:
                dayName = "Invalid Value";
                break;
        }
        System.out.println(dayName + ": " + calories);
        }
    }
}
