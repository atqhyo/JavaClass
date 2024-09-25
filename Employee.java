// import java.text.DecimalFormat;
// import java.util.Scanner;

public class Employee{
    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double bonus;
    private double totalSalary;

    //constructor
    public Employee(String n, double bs){
        this.name = n;
        this.baseSalary = bs;
        this.healthAllowance = 0.0;
        this.transportAllowance = 0.0;
        this.bonus = 0.0;
    }

    //setter
    public void setEmployee(String n, double bs){
        this.name = n;
        this.baseSalary = bs;
    }

    public void setHealthAllowance(double ha){
        this.healthAllowance = ha;
    }

    public void setTransportAllowance(double ta){
        this.transportAllowance = ta;
    }

    public void setBonus(double bo){
        this.bonus = bo;
    }

    //getter
    public String getName(){
        return name;
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    public double getHealthAllowance(){
        return healthAllowance;
    }
    public double getTransportAllowance(){
        return transportAllowance;
    }
    public double getBonus(){
        return bonus;
    }

    // method calculateTotalSalary()
    public double calculateTotalSalary(){
        totalSalary = baseSalary + healthAllowance + transportAllowance + bonus;
        return totalSalary;
    }

    //method assignBonus()
    public double assignBonus(){

        if (baseSalary > 50000){
            bonus = baseSalary * 0.10; // bonus 10%
        }else if (baseSalary >= 30000 && baseSalary <= 50000){
            bonus = baseSalary * 0.05; // bonus 5%
        }else if (baseSalary < 30000){
            bonus = 0; // no bonus
        }

        return bonus;
    }

    // public static void main(String[] args) {
    //     Employee[] employees = new Employee[7];  // Increase the array size to 7

    //     try {
    //         // Adding 5 employees
    //         employees[0] = new Employee("Fareesya", 45000);
    //         employees[1] = new Employee("Maisarah", 50000);
    //         employees[2] = new Employee("Sabrina", 29000);
    //         employees[3] = new Employee("Khairina", 30000);
    //         employees[4] = new Employee("Syahirah", 20000);

    //         // Processing each employee's salary and allowances
    //         for (Employee emp : employees) {
    //             if (emp != null) {  // Check if the employee object is not null
    //                 emp.setHealthAllowance(6000);
    //                 emp.setTransportAllowance(2300);
    //                 emp.assignBonus();
    //                 emp.calculateTotalSalary();
    //             }
    //         }

    //         // Printing out each employee's details
    //         for (int i = 0; i < employees.length; i++) {
    //             if (employees[i] != null) {  // Check if the employee object is not null
    //                 System.out.println("\nEmployee name: " + employees[i].getName() + "\nBase Salary: RM" + employees[i].getBaseSalary()
    //                         + "\nHealth Allowance: RM" + employees[i].getHealthAllowance() + "\nTransport Allowance: RM" + employees[i].getTransportAllowance()
    //                         + "\nBonus: RM" + employees[i].getBonus() + "\nTotal Salary: RM" + employees[i].calculateTotalSalary());
    //             } else {
    //                 System.out.println("\nEmployee " + (i + 1) + " is not assigned.");
    //             }
    //         }

    //     } catch (ArrayIndexOutOfBoundsException e) {
    //         System.out.println("Caught an exception: " + e.getMessage());
    //     } finally {
    //         System.out.println("End of employee processing.");
    //     }
    // }

    public static void main(String[] args) {
        Employee[] employees = new Employee[3];

        try{
            employees[0] = new Employee("Fareesya", 45000);
            employees[1] = new Employee("Maisarah", 50000);
            employees[2] = new Employee("Sabrina", 29000);
            employees[3] = new Employee("Khairina", 30000);
            employees[4] = new Employee("Syahirah", 20000);

            for (Employee emp : employees){
                emp.setHealthAllowance(6000);
                emp.setTransportAllowance(2300);
                emp.assignBonus();
                emp.calculateTotalSalary();
            }
    
            for (int i = 0; i < employees.length+1; i++){
                System.out.println("\nEmployee name: " + employees[i].getName() + "\nBase Salary: RM" + employees[i].getBaseSalary()
                                    + "\nHealth Allowance: RM" + employees[i].getHealthAllowance() + "\nTransport Allowance: RM" + employees[i].getTransportAllowance()
                                    + "\nBonus: RM" + employees[i].getBonus() + "\nTotal Salary: RM" + employees[i].calculateTotalSalary());
            }
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught bad: " + e.getMessage());
        }finally {
            System.out.println("Employee will executed anyway");
        }
        System.out.println("Program is continuing");

    //     Scanner sc = new Scanner(System.in);

    //     for(int i = 0; i<employees.length;i++){
    //         System.out.println("\nEnter Employee Name:");
    //         String name = sc.next();

    //         System.out.println("Enter Basic Salary: ");
    //         double basicSalary = sc.nextDouble();

    //         employees[i] = new Employee(name, basicSalary);
    //     }
    //     sc.close();
    }
}