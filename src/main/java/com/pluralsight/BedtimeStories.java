package com.pluralsight;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class BedtimeStories {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the story file name (example: Goldilocks.txt): ");
        String fileName = scanner.nextLine();

        int lineNumber = 1;

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));

            String line;

            while ((line = reader.readLine()) != null) {
                System.out.println(lineNumber + ": " + line);
                lineNumber++;
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: File not found or cannot be read.");
        }

        scanner.close();

    }

}
