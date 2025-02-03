package Lec_21_Feb_3_OOPs;

class employee{
    int salary;
    String name;

    employee(String name, int salary){
        System.out.println("Employee");
        this.name = name;
        this.salary = salary;
    }

    void print(){
        System.out.println("Inside print function : Employee");
    }
}

class engineer extends employee{
    int bonus;

    engineer(){
        super("Jai", 1000);
        System.out.println("Engineer");
        super.salary = 20000;
    }

    void print(){
        super.print();
        System.out.println("Inside print function : Engineer");
    }
}

public class inheritance {
    public static void main(String[] args) {
        
        engineer e1 = new engineer();
        e1.print();
    }
}

