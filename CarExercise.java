public class CarExercise {
    private String model;
    private double petrolUsage;

    public void setCar(String model, double petrolUsage){
        this.model = model;
        this.petrolUsage = petrolUsage;
    }

    public String getModel(){
        return model;
    }

    public double getPetrolUsage(){
        return petrolUsage;
    }

    public static void main(String[] args) {
        CarExercise car = new CarExercise();

        String[][] model = {
            {"Myvi","Axia"}, //array
            {"Alza","Kancil"}, //array
        };

        double[][] petrolUsage = {
            {45.3,50.2}, //array
            {55.5,42.5}, //array
        };

            for (int i = 0; i < model.length; i++) {
                for (int j = 0; j < model[i].length; j++) {
                    car.setCar(model[i][j], petrolUsage[i][j]);

                    System.out.println("The petrol usage of " + car.getModel() + " is " + car.getPetrolUsage() + " liters per 100km");
                }
            }
        
    }


}
