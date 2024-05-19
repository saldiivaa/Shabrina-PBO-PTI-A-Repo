public class Main {
    public static void main(String[] args) {
        // Membuat beberapa objek Invoice
        Invoice invoice1 = new Invoice("Laptop", 1, 1500);
        Invoice invoice2 = new Invoice("Mouse", 2, 1500);

        // Membuat array Invoice
        Invoice [] invoices1 = {invoice1};
        Invoice [] invoices2 = {invoice2};

        // Membuat objek PermanentEmployee
        PermanentEmployee permanentEmployee = new PermanentEmployee(101, "John Doe", 2000, invoices1, "HR");

        // Membuat objek InternEmployee
        InternEmployee internEmployee = new InternEmployee(102, "Jane Smith", 5000, invoices2, "Project X", 6);

        // Memanggil metode dari subclass PermanentEmployee
        System.out.println("=== Permanent Employee ===");
        permanentEmployee.displayEmployeeType();
        permanentEmployee.attendMeeting();
        permanentEmployee.manageTeam();

        // Memanggil metode dari superclass Employee
        System.out.println("\n=== Employee ===");
        System.out.println(permanentEmployee);

        // Memanggil metode dari interface Contract yang diimplementasikan
        System.out.println("\n=== Contract ===");
        System.out.println("Contract Duration: " + internEmployee.getContractDuration());
        internEmployee.attendTrainingSession();
        internEmployee.trackContractDuration();

        // Memanggil metode dari subclass InternEmployee
        System.out.println("\n=== Intern Employee ===");
        internEmployee.displayEmployeeType();
        internEmployee.attendTraining();
        internEmployee.workOnProject();

        // Memanggil metode dari superclass Employee
        System.out.println("\n=== Employee ===");
        System.out.println(internEmployee);

        // Memanggil metode dari interface Payable yang diimplementasikan
        System.out.println("\n=== Payable ===");
        System.out.println("Remaining Salary: " + internEmployee.getPayableAmount());
    }
}
