package worker.model;

public class Programmers implements Worker {

    private int id;
    private String nickname;
    private int salary;
    private int bonusSalary;
    private double KPIValue;

    public Programmers() {
    }

    public Programmers(int id, String nickname, int salary, int bonusSalary, double KPIValue) {
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.bonusSalary = bonusSalary;
        this.KPIValue = KPIValue;
    }

    @Override
    public String getWorkerData() {
        return "Programmers: " + "id: " + id + ", nickname: '" + nickname + '\'' + ", salary: " + salary +
                ", bonusSalary: " + bonusSalary + ", KPIValue: " + KPIValue;
    }

    @Override
    public int getSalary() {
        return (int) (salary + (KPIValue * bonusSalary));
    }

    public int getId() {
        return id;
    }

    public String getNickname() {
        return nickname;
    }

    public int getBonusSalary() {
        return bonusSalary;
    }

    public double getKPIValue() {
        return KPIValue;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setBonusSalary(int bonusSalary) {
        this.bonusSalary = bonusSalary;
    }

    public void setKPIValue(double KPIValue) {
        this.KPIValue = KPIValue;
    }
}
