package EmpSalarySlip;

public class EmpDetails {
    private int id;
    private String name;
    private double salary;
    private String email;
    private String company;
    private double hra;
    private double ta;
    private double da;
    private double tds;

    public EmpDetails() {
        this.company = "Brain Mentors";
        this.hra = 25.00;
        this.ta = 20.00;
        this.da = 18.00;
        this.tds = 15.00;
    }

    public EmpDetails(int id, String name, double salary) {
        this();
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCompany() {
        return this.company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getHRA() {
        return salary * hra/100;
    }

    public double getTA() {
        return salary * ta/100;
    }

    public double getDA() {
        return salary * da/100;
    }

    public double getTDS() {
        return salary * tds/100;
    }

    public double showEmp() {
        this.salary = this.salary + getHRA() + getDA() + getTA() - getTDS();
        return this.salary;
    }

}