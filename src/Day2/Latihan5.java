package Day2;

import Day2.Object.Manager;
import Day2.Object.Staff;

public class Latihan5 {
    public static void main(String[] args) {
        System.out.println("T E S T I N G");
        Manager[] manager = new Manager[2];
        Staff[] staff = new Staff[2];
        Staff[] anotherStaff = new Staff[3];

        /*
        * Manager
        */
        manager[0] = new Manager();
        manager[0].setName("Jack");
        manager[0].setId("101A");
        manager[0].setLevel("1");
        manager[0].setExtra(500000);
        manager[0].setDepartment("Administration");

        manager[1] = new Manager();
        manager[1].setName("Rosie");
        manager[1].setId("102A");
        manager[1].setLevel("1");
        manager[1].setExtra(250000);
        manager[1].setDepartment("Marketing");

        /*
        * Staff
        */
        staff[0] = new Staff();
        staff[0].setName("En");
        staff[0].setId("0A3");
        staff[0].setLevel("2");
        staff[0].setOvertime(10);
        staff[0].setOvertimeFee(10000);

        staff[1] = new Staff();
        staff[1].setName("Nate");
        staff[1].setId("0A4");
        staff[1].setLevel("2");
        staff[1].setOvertime(10);
        staff[1].setOvertimeFee(55000);

        manager[0].setStaff(staff);

        /*
        * Another Staff
        */
        anotherStaff[0] = new Staff();
        anotherStaff[0].setName("Anna");
        anotherStaff[0].setId("0B1");
        anotherStaff[0].setLevel("3");
        anotherStaff[0].setOvertime(15);
        anotherStaff[0].setOvertimeFee(10000);

        anotherStaff[1] = new Staff();
        anotherStaff[1].setName("Dan");
        anotherStaff[1].setId("0B2");
        anotherStaff[1].setLevel("3");
        anotherStaff[1].setOvertime(5);
        anotherStaff[1].setOvertimeFee(50000);

        anotherStaff[2] = new Staff();
        anotherStaff[2].setName("Dean");
        anotherStaff[2].setId("0B3");
        anotherStaff[2].setLevel("3");
        anotherStaff[2].setOvertime(6);
        anotherStaff[2].setOvertimeFee(20000);

        manager[1].setStaff(anotherStaff);

        manager[0].staffInfo();
        manager[1].staffInfo();
    }
}
