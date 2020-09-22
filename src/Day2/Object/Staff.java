package Day2.Object;

public class Staff extends Employee{
    private int overtime;
    private double overtimeFee;

    public int getOvertime() {
        return overtime;
    }

    public void setOvertime(int overtime) {
        this.overtime = overtime;
    }

    public double getOvertimeFee() {
        return overtimeFee;
    }

    public void setOvertimeFee(double overtimeFee) {
        this.overtimeFee = overtimeFee;
    }

    public double getSalary(){
        Employee employee = new Employee();
        return super.getSalary() + overtime*overtimeFee;
    }

    public void staffInfo(){
        System.out.println("Employee ID: " + this.getId());
        System.out.println("Name: " + this.getName());
        System.out.println("Level: " + this.getLevel());
        System.out.printf("Salary: %.0f\n", this.getSalary());
        System.out.println("Overtime: " + this.getOvertime());
        System.out.printf("Overtime Fee: %.0f\n", this.getOvertimeFee());
    }
}
