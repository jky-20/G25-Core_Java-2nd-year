package Jan_30_OOPs;

class Array{
    int size;
    int[] arr;

    // constructor
    Array(int size){
        this.size = size;
        this.arr = new int[size];
    }

    // copy constructor
    Array(Array obj){

        // shallow copy
        this.size = obj.size;
        this.arr = obj.arr;

        // deep copy
        this.arr = new int[obj.size];
        for(int i=0 ; i<obj.arr.length ; i++){
            this.arr[i] = obj.arr[i];
        }
    }
}

public class shallowVSdeep_copy {
    public static void main(String[] args) {
        
        Array obj1 = new Array(3);
        Array obj2 = new Array(obj1);

        obj1.arr[2] = -1;
        System.out.println(obj2.arr[2]);    // changes will be reflected
    }
}
