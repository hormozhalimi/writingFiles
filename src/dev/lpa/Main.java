package dev.lpa;

import java.io.*;

public class Main {
    public static void main(String[] args) {

        String [] names = {"John", "ali" , "wali"};

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("writing to a file"); // Call write on the BufferedWriter instance
            writer.write("\nmy name is khan but not very well.");

            for (String name : names){
                writer.write("\n" + name );

            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
            String line;
            while((line = reader.readLine()) != null)
                System.out.println(line);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}