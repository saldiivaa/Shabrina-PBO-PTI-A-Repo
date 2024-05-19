public class PermanentEmployee extends Employee {
    private String department;

    public PermanentEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, String department) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void displayEmployeeType() {
        System.out.println("Employee Type: Permanent");
    }

    public void attendMeeting() {
        System.out.println("Attending departmental meeting...");
    }

    public void manageTeam() {
        System.out.println("Managing team...");
    }
}
