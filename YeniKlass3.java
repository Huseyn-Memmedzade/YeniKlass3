package io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class YeniKlass3 {

    public static void main(String[] args) {

        try {

            File file = new File("mesaj.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {

                System.out.println(sc.nextLine());

            }

            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");

        }


    }


}
