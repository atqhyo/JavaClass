import java.time.LocalDate;
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
    private LocalDate payslipDate;

    //constructor
    public EmployeeArrayList(String n, double bs){
        this.name = n;
        this.baseSalary = bs;
        this.healthAllowance = 6000;
        this.transportAllowance = 2000;
        this.bonus = assignBonus();
        this.payslipDate = LocalDate.of(2024, 8, 1);
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

    public void setPaySlipDate(double ps){
        this.bonus = ps;
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
    public LocalDate getPaySlipDate(){
        return payslipDate;
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
        LocalDate nowD = LocalDate.of(2024, 8, 1);
        if (nowD.getMonthValue() == 8 && nowD.getDayOfMonth() <= 31) {
            System.out.println("\nBeginning of August! Employees receive their payslips on " + nowD + "\n");

            ArrayList<EmployeeArrayList> employees = new ArrayList<>();
            
            employees.add(new EmployeeArrayList("Fareesya", 45000));
            employees.add(new EmployeeArrayList("Maisarah", 50000));
            employees.add(new EmployeeArrayList("Sabrina", 29000));
            employees.add(new EmployeeArrayList("Khairina", 30000));
            employees.add(new EmployeeArrayList("Syahirah", 20000));

            Predicate<EmployeeArrayList> isBonusGreaterThanThousand = employee -> employee.getBonus() > 1000;

            for (EmployeeArrayList emp : employees) {
                System.out.println("\nEmployee Payslip" + "\n-----------------" +
                                   "\nEmployee name: " + emp.getName() +
                                   "\nBase Salary: RM" + emp.getBaseSalary() +
                                   "\nHealth Allowance: RM" + emp.getHealthAllowance() + 
                                   "\nTransport Allowance: RM" + emp.getTransportAllowance() +
                                   "\n\nPayslip Date: " + emp.getPaySlipDate() +
                                   "\nTotal Salary: RM" + emp.calculateTotalSalary() +
                                   "\nBonus: RM" + emp.getBonus());

                if (isBonusGreaterThanThousand.test(emp)) {
                    System.out.println("Congrats! >.<");
                } else {
                    System.out.println("Keep up the good work!");
                }
            }
        } else {
            System.out.println("Not in the beginning of August yet.");
        }
        System.out.println(" ");
    }
}
