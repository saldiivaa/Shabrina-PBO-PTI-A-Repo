public class Manager extends Employee {
    private double bonus;
    
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;  
    }

    // public Manager(String name) {
    //     super(name);
    // }

    public void setBonus(double bonus){
        this.bonus = bonus;
    }
    
    public double getSalary(){
        double baseSalary = super.getSalary();
        return baseSalary+bonus;
    }
   
}