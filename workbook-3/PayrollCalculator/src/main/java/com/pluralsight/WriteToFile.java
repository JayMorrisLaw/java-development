package com.pluralsight;
// creating a file and writing into it using buffered writer and buffered reader
import java.io.BufferedWriter;
import java.io.FileWriter;

public class WriteToFile {
    public static void main(String[] args) {

        try{
            // create a file potato.txt
            FileWriter fileWriter = new FileWriter("potato.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String numText;
            // using for loop to count to 10 inside of the created txt file potato
            for (int i = 1; i < 10 ; i++) {
                numText = String.format("counting %d\n", i);
               // numText = "counting", i + '\n';;
                // write to file
                bufferedWriter.write(numText);


            }
            // close the writer
            bufferedWriter.close();


        }catch(Exception ex){
            System.out.println("an error has occured");
        }
    }
}
