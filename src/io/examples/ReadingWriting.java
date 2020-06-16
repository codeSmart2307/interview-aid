package io.examples;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class ReadingWriting {

    public static void main(String[] args) throws IOException {
        writeToFile();
        readFromFile();
    }

    static void writeToFile() throws IOException {
        // Accept a string
        String str = "File Handling in Java using FileWriter and FileReader";

        // Attach a file to FileWriter
        FileWriter fw = new FileWriter("output.txt");

        // Read character wise from string and write into FileWriter
        for (int i = 0; i < str.length(); i++) {
            fw.write(str.charAt(i));
        }

        System.out.println("Writing successful");
        // Close the file
        fw.close();
    }

    static void readFromFile() throws IOException {
        int ch;

        // Check if File exists or not
        FileReader fr = null;
        try {
            fr = new FileReader("output.txt");
        } catch (FileNotFoundException fe) {
            System.out.println("File not found");
        }

        // Read from FileReader till the end of file
        while ((ch = fr.read()) != -1)
            System.out.print((char) ch);

        // Close the file
        fr.close();
    }
}
