package Lec_52_April_25_FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) {
        
        File file = new File("Lec_52_April_25_FileHandling\\example.txt");
        try{
            // create new file
            if(file.createNewFile()){
                System.out.println("File created successfully");
            }
            else{
                System.out.println("File can't be created or may exists");
            }

            // writing in a file
            FileWriter writer = new FileWriter(file, true);
            writer.write("\nEe saal cup namde");
            writer.write("\nHello all.. good afternoon");
            writer.close();

            // read a file
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()){
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();

            // delete a file
            if(file.delete()){
                System.out.println("Deleted successfully");
            }
            else{
                System.out.println("can't be deleted");
            }
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
