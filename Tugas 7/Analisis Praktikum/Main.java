// public class Main {
//     public static void main(String[] args) {
//     Employee a = new SalariedEmployee(null, null, 0, null);
//     String b = a.getName();
//     }
//    }

public class Main {
    public static void main(String[] args) {
        SalariedEmployee salariedEmployee = new SalariedEmployee("Daniel", "135", 800.00, "2000-05-01");
        HourlyEmployee hourlyEmployee = new HourlyEmployee("Karina", "234", 16.75, 40, "2001-5-20");
        CommissionEmployee commissionEmployee = new CommissionEmployee("Keanu", "145", 10000, .06,"2002-5-25");
        BasePlusCommissionEmployee basePlusCommissionEmployee = new BasePlusCommissionEmployee("Bondan", "234", 5000,.04,300, "2003-5-05");
        //menambahkan objek piece worker
        PekerjaProduksi p = new PekerjaProduksi("Danang", "999", 50, 50, "2004-5-2");
        PekerjaProduksi q = new PekerjaProduksi("Dining", "888", 50, 50, "2004-5-2");
        PekerjaProduksi r = new PekerjaProduksi("Dunung", "777", 50, 50, "2004-5-2");
        PekerjaProduksi s = new PekerjaProduksi("Donong", "666", 50, 50, "2004-5-2");


        System.out.println("Employees diproses secara terpisah:\n");
        System.out.printf("%s\n%s: $%,.2f\n\n", salariedEmployee, "pendapatan",salariedEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",hourlyEmployee, "pendapatan",hourlyEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",commissionEmployee, "pendapatan",commissionEmployee.earnings());
        System.out.printf("%s\n%s: $%,.2f\n\n",basePlusCommissionEmployee,"earned",basePlusCommissionEmployee.earnings());
        //menambahkan piece worker ke dalam output emplpyess yang diproses secara terpisah
        System.out.printf("%s\n%s: $%,.2f\n\n", p, "pendapatan",p.earnings());

        //modifikasi array
        Employee[] employees = new Employee[8];
        employees[0] = salariedEmployee;
        employees[1] = hourlyEmployee;
        employees[2] = commissionEmployee;
        employees[3] = basePlusCommissionEmployee;
        employees[4] = p;
        employees[5] = q;
        employees[6] = r;
        employees[7] = s;

        System.out.println("Employees diproses secara polimorfisme:\n");
        for (Employee currentEmployee : employees) {
            System.out.println(currentEmployee);
            if (currentEmployee instanceof BasePlusCommissionEmployee) {
                BasePlusCommissionEmployee employee = (BasePlusCommissionEmployee) currentEmployee;
                employee.setBaseSalary(1.10 * employee.getBaseSalary());
                System.out.printf("Gaji pokok setelah dinaikkan 10%%: $%,.2f\n",employee.getBaseSalary());
            }
            System.out.printf("pendapatan: $%,.2f\n\n",currentEmployee.earnings());
        }
        for (int j = 0; j < employees.length; j++) {
            System.out.printf("Employee %d = %s\n", j,employees[j].getClass().getName());
        }
    }
}