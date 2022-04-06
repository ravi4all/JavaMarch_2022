package EmpSalarySlip;

public class EmpTest {
    public static void main(String[] args) {
        EmpDetails obj = new EmpDetails(101, "Surya Kumar", 50000);
        // System.out.println(obj.getSalary());
        // obj.setSalary(obj.getSalary() + 10000);
        // System.out.println(obj.getSalary());
        System.out.println("Basic Salary is : " + obj.getSalary());
        System.out.println("Net Salary is : " + obj.showEmp());
    }
}
