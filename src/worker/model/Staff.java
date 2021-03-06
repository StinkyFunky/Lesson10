package worker.model;

public class Staff implements Worker {

    private int id;
    private String name;
    private String surname;
    private int salary;

    public Staff() {
    }

    public Staff(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String getWorkerData() {
        return "Staff: " + "id: " + id + ", name: '" + name + '\'' + ", surname: '" + surname + '\'' +
                ", salary: " + salary;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
