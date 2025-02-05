package Lec_22_Feb_5_OOPs;

class employee{
    String name;
    int salary;
}

class engineer extends employee{    // single level ineritance
    int bonus;
}

class software_developer extends engineer{  // multilevel inheritance
    String tech_skills;
}

class quality_engineer extends engineer{    // hierarchical inheritance
    String tech_tools;
}

class product_engineer extends engineer{    // hierarchical inheritance

}

public class inheritance_types {
    public static void main(String[] args) {
        
    }
}
