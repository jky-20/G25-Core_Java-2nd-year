package Lec_33_Mar_3_OOPs;
import java.util.Objects;

// generic interface
interface example<T>{
    void setKey(T key);
    T getKey();
}
class A<T> implements example<T>{
    private T key;
    public void setKey(T key){
        this.key = key;
    }
    public T getKey(){
        return this.key;
    }
}

// generic class
class pair<K,V>{
    K key;
    V val;
    Objects[] arr;
    pair(K key, V val, int size){
        this.key = key;
        this.val = val;
        arr = new Objects[size];    // creating generic type array
    }
    K get(int index){
        return (K)arr[index];
    }
}

class normalClass{
    static <T> void print(T[] arr){
        for(T element : arr){
            System.out.print(element + "  ");
        }
        System.out.println();
    }
}

public class generics {
    public static void main(String[] args) {
        Integer[] arr1 = {1,2,3,4};
        String[] arr2 = {"Jai", "Satyam"};
        
        normalClass.print(arr1);
        normalClass.print(arr2);
        
        pair<String, Integer> p1 = new pair<>("Jai", 1, 10);
        pair<String, String> p2 = new pair<>("abc", "abcdfg", 20);
    }
}
