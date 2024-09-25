import java.util.ArrayList;
import java.util.function.Predicate;

public class EmployeeArrayList {
    //use arraylist instead of using scanner or array
    //beginning of aug employee got payslip
    //if bonus more than 1000 print congrats or happy face

    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double bonus;
    private double totalSalary;

    //constructor
    public EmployeeArrayList(String n, double bs){
        this.name = n;
        this.baseSalary = bs;
        this.healthAllowance = 6000;
        this.transportAllowance = 2000;
        this.bonus = assignBonus();
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
    public static void main(String[] args) {

        System.out.println("Beginning of August! Employee receive their payslips\n");

        ArrayList<EmployeeArrayList> employees = new ArrayList<>();

        employees.add(new EmployeeArrayList("Fareesya", 45000));
        employees.add(new EmployeeArrayList("Maisarah", 50000));
        employees.add(new EmployeeArrayList("Sabrina", 29000));
        employees.add(new EmployeeArrayList("Khairina", 30000));
        employees.add(new EmployeeArrayList("Syahirah", 20000));

        Predicate<EmployeeArrayList> isBonusGreaterThanThousand = employee -> employee.getBonus() > 1000;

            for (EmployeeArrayList emp : employees){
                System.out.println("\nEmployee name: " + emp.getName() + "\nTotal Salary: " + emp.calculateTotalSalary()
                                    + "\nBonus: " + emp.getBonus());

            if (isBonusGreaterThanThousand.test(emp)){
                System.out.println("Congrats! >.<");
            }else {
                System.out.println("Keep up the good work!");
            }
                System.out.println();
        }

    }
}
