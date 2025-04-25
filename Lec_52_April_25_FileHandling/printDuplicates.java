package Lec_52_April_25_FileHandling;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class printDuplicates {
    static void printDuplicateWords(String filePath){
        File file = new File(filePath);
        try {
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();

                String[] words = line.split("\\s+");

                for(int i=0 ; i<words.length ; i++){
                    int cnt = 1;
                    while(i+1<words.length && words[i].equals(words[i+1])){
                        cnt++;
                        i++;
                    }
                    if(cnt > 1){
                        System.out.print(words[i]+"*"+cnt+" ");
                    }
                }
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();
        printDuplicateWords(filePath);
    }
}
