package Lec_53_April_28_FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class read_write_file {
    public static void main(String[] args) {
        
        File file = new File("Lec_53_April_28_FileHandling\\example.txt");

        try {
            file.createNewFile();

            FileReader fr = new FileReader(file);
            FileWriter fw = new FileWriter(file);

            // buffer reader / writer
            BufferedReader bfr = new BufferedReader(fr);
            BufferedWriter bfw = new BufferedWriter(fw);
            Scanner sc = new Scanner(file);

            bfr.close();
            bfw.close();
            sc.close();

        } catch (Exception e) {
        }
    }
}
