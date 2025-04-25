package Lec_51_April_24_Random;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        
        Random random = new Random();

        // Generates any random int
        int num = random.nextInt();

        // In range 0 to 100
        num = random.nextInt(101);

        // In range 50 to 100
        num = random.nextInt(51) + 50;  // Java <17
        num = random.nextInt(50,101);   // Java >=17

        // Print 20 random numbers in range [-100,100]
        for(int i=0 ; i<20 ; i++){
            num = random.nextInt(201) - 100;
            System.out.println(num);
        }

        // Generate a 6 digit OTP
        int OTP = random.nextInt(100000, 1000000);
        OTP = random.nextInt(900000) + 100000;
        // 900000 is diff 6 digit numbers and 100000 is the smallest

        // Generate a 6 digit OTP without any 0
        OTP = 0;
        for(int i=0 ; i<6 ; i++){
            OTP = OTP * 10;
            OTP += random.nextInt(9) + 1;
        }
        System.out.println(OTP);
    }
}
