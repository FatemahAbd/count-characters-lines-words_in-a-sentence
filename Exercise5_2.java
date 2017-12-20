package exercise5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise5_2 {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("E:/lab3_2.txt");

        int characters = 0;
        int words = 0;
        int lines = 0;

        try {
            Scanner scan = new Scanner(file);
            while (scan.hasNext()) {
                String s = scan.nextLine();
                lines++;
                characters += s.length();
                String[] split = s.split(" ");
                for (String word : split) {
                    words++;
                }

            }

        } catch (FileNotFoundException fnfe) {
            System.out.println("cannot create the file.");
        }
        System.out.println("Characters: " + characters);
        System.out.println("Words: " + words);
        System.out.println("Lines: " + lines);

    }
}
