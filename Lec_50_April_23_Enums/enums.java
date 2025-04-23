package Lec_50_April_23_Enums;

import java.lang.classfile.attribute.CodeAttribute;

enum Day{
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
}

enum Status{
    Success(200, "Executed successfully"),
    NotFound(404, "Enter Valid URL"),
    TimeOut(502, "Taking long to load, please try again");

    private int Code;
    private String msg;

    private Status(int code, String msg){
        this.Code = code;
        this.msg = msg;
    }
    public int getStatusCode(){
        return this.Code;
    }
    public String getStatusMsg(){
        return this.msg;
    }
}
// method overriding in ENUMS
enum Maths{
    Add{
        public int Operations(int a, int b){
            return a + b;
        }
    },
    Multiply{
        public int Operations(int a, int b){
            return a * b;
        }
    };
    public abstract  int Operations(int a, int b);
}

public class enums {
    public static void main(String[] args) {
        
        Day d = Day.Monday;

        switch (d) {
            case Monday:
                System.out.println("here we go again!!");
                break;
            case Friday:
                System.out.println("Wohooo !! Weekend is here");
                break;
            default:
                System.out.println("Another day of week");
                break;
        }

        Status s = Status.NotFound;
        System.out.println(s.name() + " || " + s.getStatusMsg() + " || " + s.getStatusCode());

        for(Status s1 : Status.values()){
            System.out.println(s);
        }

        int sum = Maths.Add.Operations(10, 20);
    }
}
