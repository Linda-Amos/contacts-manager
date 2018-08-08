import java.awt.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.Files.readAllLines;

public class ContactsMgrMain {

    public static void main(String[] args) {
//        ------directory and file name stored in variables.-----
        String directory = "src";
        String filename = "contacts.txt";

        Path contactsDirectory = Paths.get(directory);
        System.out.println(directory);

        Path contactsFile = Paths.get(directory, filename);
        System.out.println(filename);


//       -----These try/catch exceptions check to see if the named directory and file exist,
//                          and creates them if they have not been.----
//        try {
//            if (Files.notExists(contactsDirectory)) {
//                Files.createDirectories(contactsDirectory);
//                System.out.println("Directory created.");
//            }
//        } catch(Exception e) {
//                System.out.println("Well, I couldn't do that.");
//            }
//
//
//        try {
//            if (!Files.exists(contactsFile)) {
//                Files.createFile(contactsFile);
//                System.out.println("File created.");
//            }
//        }  catch (Exception e) {
//            System.out.println("Oops! I can't create that file.");
//            }
        List<String> Files.readAllLines(Path contactsFile)

    }





    public static List contactsRolladex() {

    }







}
