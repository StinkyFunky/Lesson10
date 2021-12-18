package worker;

import worker.model.HRManagers;
import worker.model.Programmers;
import worker.model.Staff;

import java.util.*;

import static java.util.Comparator.comparing;

public class Main {

    public static void main(String[] args) {

        Staff staff1 = new Staff(1, "Bob", "Marley",3000);
        Staff staff2 = new Staff(2, "Tony", "Montana",6000);
        Staff staff3 = new Staff(3, "Abaddon", "Ezekyle",5500);
        Staff staff4 = new Staff(4, "Horus", "Lupercal",4500);
        Staff staff5 = new Staff(5, "Corvus", "Corax",4000);

        Programmers programmers1 = new Programmers(6,"seniorAlert", 4000,500,1.1);
        Programmers programmers2 = new Programmers(7,"helloWorldDeveloper", 3000,500,1.5);
        Programmers programmers3 = new Programmers(8,"ddosJunior", 4500,500,0.5);
        Programmers programmers4 = new Programmers(9,"darkSideForce", 5000,500,2.0);
        Programmers programmers5 = new Programmers(10,"trololo", 2500,500,1.7);

        HRManagers hrManagers1 = new HRManagers(11, "", 2550);
        HRManagers hrManagers2 = new HRManagers(12, "name", 3500);
        HRManagers hrManagers3 = new HRManagers(13, "name", 4650);
        HRManagers hrManagers4 = new HRManagers(14, "name", 5050);
        HRManagers hrManagers5 = new HRManagers(15, "name", 6500);

        List<Staff> staff = new ArrayList<>();

        staff.add(staff1);
        staff.add(staff2);
        staff.add(staff3);
        staff.add(staff4);
        staff.add(staff5);

        System.out.println(staff.stream().max(comparing(Staff::getSalary)).get().getWorkerData());

        System.out.println("\n");

        staff.stream().sorted(comparing(Staff::getSalary).reversed()).
                forEach(s -> System.out.println(s.getWorkerData()));
    }
}
