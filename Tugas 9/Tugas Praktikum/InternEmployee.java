public class InternEmployee extends Employee implements Contract {
    private String project;
    private int contractDuration;

    public InternEmployee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices, String project, int contractDuration) {
        super(registrationNumber, name, salaryPerMonth, invoices);
        this.project = project;
        this.contractDuration = contractDuration;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public int getContractDuration() {
        return contractDuration;
    }

    public void setContractDuration(int contractDuration) {
        this.contractDuration = contractDuration;
    }

    @Override
    public void displayEmployeeType() {
        System.out.println("Employee Type: Intern");
    }

    public void attendTraining() {
        System.out.println("Attending training session...");
    }

    public void workOnProject() {
        System.out.println("Working on project: " + project);
    }

    @Override
    public void attendTrainingSession() {
        System.out.println("Intern attending training session...");
    }

    @Override
    public void trackContractDuration() {
        System.out.println("Intern tracking contract duration...");
    }

    @Override
    public double getPayableAmount() {
        // Menghitung total invoice dan menguranginya dari gaji bulanan
        double totalInvoiceAmount = calculateTotalInvoices();
        return getSalaryPerMonth() - totalInvoiceAmount;
    }
}
