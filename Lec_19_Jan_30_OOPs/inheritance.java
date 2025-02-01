package Lec_19_Jan_30_OOPs;

class employee{
    int salary;
    String name;

    employee(){
        System.out.println("Employee");
    }
}

class engineer extends employee{
    int bonus;

    engineer(){
        System.out.println("Engineer");
    }
}

public class inheritance {
    public static void main(String[] args) {
        
        engineer e1 = new engineer();
        e1.name = "Jai";
        // employee emp1 = new employee();

        // IS-A relationship
        System.out.println(e1 instanceof engineer);
        System.out.println(e1 instanceof employee);
        // System.out.println(emp1 instanceof engineer);
        // System.out.println(emp1 instanceof employee);

        employee emp2 = new engineer();     // valid syntax
        // emp2.bonus = 1000;  // invlaid
        // engineer e2 = new employee();   // invalid syntax
    }
}
