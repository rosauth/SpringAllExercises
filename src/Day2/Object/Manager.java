package Day2.Object;

public class Manager extends Employee{
    private double extra;
    private String department;
    private Staff[] staff;

    public double getExtra() {
        return extra;
    }

    public void setExtra(double extra) {
        this.extra = extra;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Staff[] getStaff() {
        return staff;
    }

    public void setStaff(Staff[] staff) {
        this.staff = staff;
    }
    
    private void listStaff(){
        System.out.println("------------------------------");
        for (Staff value : staff) {
            value.staffInfo();
        }
        System.out.println("------------------------------");
    }
    
    public void staffInfo(){
        System.out.println("Manager: " + this.getDepartment());
        System.out.println("Employee ID: " + this.getId());
        System.out.println("Name: " + this.getName());
        System.out.println("Level: " + this.getLevel());
        System.out.println("Salary: " + this.getSalary());
        System.out.println("Extra: " + this.getExtra());
        System.out.println("Department: " + this.getDepartment());
        
        this.listStaff();
    }
    
    public double getSalary(){
        return super.getSalary() + extra;
    }
}
