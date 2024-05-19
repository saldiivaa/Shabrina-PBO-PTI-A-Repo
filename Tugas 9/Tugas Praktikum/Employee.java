public abstract class Employee implements Payable {
    private int registrationNumber;
    private String name;
    private int salaryPerMonth;
    private Invoice[] invoices;

    public Employee(int registrationNumber, String name, int salaryPerMonth, Invoice[] invoices) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.salaryPerMonth = salaryPerMonth;
        this.invoices = invoices;
    }

    public int getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(int registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(Integer salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

    public Invoice[] getInvoices() {
        return invoices;
    }

    public void setInvoices(Invoice[] invoices) {
        this.invoices = invoices;
    }

    public double calculateTotalInvoices() {
        double totalInvoiceAmount = 0;
        for (Invoice invoice : invoices) {
            totalInvoiceAmount += invoice.getPayableAmount();
        }
        return totalInvoiceAmount;
    }

    @Override
    public double getPayableAmount() {
        return salaryPerMonth - calculateTotalInvoices();
    }

    public void addInvoice(Invoice invoice) {
        Invoice[] newInvoices = new Invoice[invoices.length + 1];
        System.arraycopy(invoices, 0, newInvoices, 0, invoices.length);
        newInvoices[invoices.length] = invoice;
        invoices = newInvoices;
    }

    public void removeInvoice(String productName) {
        Invoice[] newInvoices = new Invoice[invoices.length - 1];
        int index = 0;
        for (Invoice invoice : invoices) {
            if (!invoice.getProductName().equals(productName)) {
                newInvoices[index++] = invoice;
            }
        }
        invoices = newInvoices;
    }

    public abstract void displayEmployeeType();

    public static void companyPolicy() {
        System.out.println("Company policy: All employees must adhere to the company's code of conduct.");
    }

    @Override
    public String toString() {
        // Ini membuat sebuah instance baru dari StringBuilder, yang digunakan untuk menggabungkan string secara efisien
        // Fungsi append sangat berguna untuk menggabungkan beberapa bagian string atau data lain ke dalam satu StringBuilder secara efisien. 
        StringBuilder sb = new StringBuilder();
        sb.append("Employee ID: ").append(registrationNumber).append("\n")
          .append("Name: ").append(name).append("\n")
          .append("Salary per Month: ").append(salaryPerMonth).append("\n")
          .append("Remaining Salary after Deductions: ").append(getPayableAmount()).append("\n")
          .append("Invoices:\n");
        for (Invoice invoice : invoices) {
            sb.append(invoice).append("\n");
        }
        return sb.toString();
    }
}
