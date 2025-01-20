import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=2 ; i<=n ; i+=2){
            if( i == 6){
                break;
            }
            if(i == 6){
                continue;
            }
            System.out.println(i);

        }
    }
}
