package Lec_41_Mar_21_Exp_Handling;

import java.util.Scanner;

public class count_set_bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;
        while (n > 0) {
            cnt += n & 1;
            n = n >> 1;
        }
        System.out.println(cnt);
    }
}
