package PatikaDev.Hafta2;


public class Employee {

    private String name;
    private double salary;
    private double workHours;
    private int hireYear;

    public Employee(String name, double salary, double workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    private double tax(){
        if (salary < 1000){
            return 0;
        }
        return salary*0.03;
    }

    private double bonus(){
        if (workHours > 40){
            return (workHours-40)*30;
        }
        return 0;
    }

    private double raiseSalary(){

        if ((2021-hireYear) < 10){
            return salary * 0.05;
        }

        else if ((9 < (2021-hireYear)) && ((2021-hireYear) < 20)){
            return salary * 0.1;
        }

        else {
            return salary * 0.15;
        }
    }

    @Override
    public String toString(){

        return "Adı : " + name +
        "\nMaaşı : " + salary +
        "\nÇalışma Saati : " + workHours +
        "\nBaşlangıç Yılı : " + hireYear +
        "\nVergi : " + tax() +
        "\nBonus : " + bonus() +
        "\nMaaş Artışı : " + raiseSalary() +
        "\nVergi ve Bonuslar ile birlikte maaş : " + (salary-tax()+bonus()) +
        "\nToplam Maaş : " + (salary - tax() + bonus() + raiseSalary());

    }

    public static void main(String[] args) {
        Employee test = new Employee("kemal", 2000, 45, 1985);
        System.out.println(test);
    }


}
