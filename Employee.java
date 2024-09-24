public class Employee{
    private String name;
    private double baseSalary;
    private double healthAllowance;
    private double transportAllowance;
    private double bonus;
    private double totalSalary;

    public Employee(String n, double bs){
        this.name = n;
        this.baseSalary = bs;
        this.healthAllowance = 0.0;
        this.transportAllowance = 0.0;
        this.bonus = 0.0;
    }

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

    public double calculateTotalSalary(){
        totalSalary = baseSalary + healthAllowance + transportAllowance + bonus;
        return totalSalary;
    }

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
        Employee[] employees = new Employee[5];

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

        for (int i = 0; i < employees.length; i++){
            System.out.println("\nEmployee name: " + employees[i].getName() + "\nBase Salary: " + employees[i].getBaseSalary()
                                + "\nHealth Allowance: " + employees[i].getHealthAllowance() + "\nTransport Allowance: " + employees[i].getTransportAllowance()
                                + "\nBonus: " + employees[i].getBonus() + "\nTotal Salary: " + employees[i].calculateTotalSalary());
        }
    }
}