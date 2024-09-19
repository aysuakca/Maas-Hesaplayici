public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;
    int year = 2024;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String toString(){
        System.out.println("Adi: " +this.name);
        System.out.println("Maasi: " +this.salary);
        System.out.println("Calisma Saati: " +this.workHours);
        System.out.println("Baslangic Yili: " +this.hireYear);
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maas Artisi : " + raiseSalary());
        System.out.println("Vergi ve Bonuslar Ile Birlikte Maas: " + (this.salary +(bonus() - tax())));
        System.out.println("Toplam Maas : " + (this.salary +(bonus() - tax() + raiseSalary())));
        return null;
    }

    int tax() {
        double tax = 0;
        if (this.salary < 1000) {
            tax = 0;
        } else {
            tax = this.salary * 0.03;
        }
        return (int) tax;
    }

    int bonus() {
        int bonus = 0;
        if (this.workHours > 40) {
            bonus = ((this.workHours - 40) * 30);
        } else {
            bonus = 0;
        }
        return bonus;
    }

    int raiseSalary() {
        double raiseSalary = 0;
        if (((year - this.hireYear) > 9) && ((year - this.hireYear) < 20)) {
            raiseSalary = (this.salary * 0.10);
        }
        if ((year - this.hireYear) < 10) {
            raiseSalary = (this.salary * 0.05);
        }
        if ((year - this.hireYear) > 19) {
            raiseSalary = (this.salary * 0.15);
        }
        return (int) raiseSalary;
    }
}