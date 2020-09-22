package Day2.Object;

public class Employee {
    private String name;
    private String id;
    private String level;
    private double salary;

    public Employee() {
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", level='" + level + '\'' +
                ", salary=" + salary +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;

        switch (level.charAt(0)){
            case '1':
                this.salary = 500000;
                break;
            case '2':
                this.salary = 300000;
                break;
            case '3':
                this.salary = 200000;
                break;
            case '4':
                this.salary = 100000;
                break;
            case '5':
                this.salary = 70000;
                break;
            default:
                System.out.println("No such employee level");
                break;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
