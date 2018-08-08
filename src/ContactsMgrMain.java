import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

import static java.nio.file.Files.readAllLines;

public class ContactsMgrMain {

    public static void main(String[] args) throws IOException{
//        ------directory and file name stored in variables.-----
        String directory = "src";
        String filename = "contacts.txt";

        Path contactsDirectory = Paths.get(directory);
        //System.out.println(directory);

        Path contactsFile = Paths.get(directory, filename);
        //System.out.println(filename);


//       -----These try/catch exceptions check to see if the named directory and file exist,
//                          and creates them if they have not been.----
        try {
            if (Files.notExists(contactsDirectory)) {
                Files.createDirectories(contactsDirectory);
                System.out.println("Directory created.");
            }
        } catch(Exception e) {
                System.out.println("Well, I couldn't do that.");
                 e.printStackTrace();

        }


        try {
            if (!Files.exists(contactsFile)) {
                Files.createFile(contactsFile);
                System.out.println("File created.");
            }
        }  catch (Exception e) { //if path doesn't exist
            System.out.println("Oops! I can't create that file.");
            e.printStackTrace();
            }

            //display database

//showContacts();


        HashMap<String, String> entries = new HashMap<>();
        entries.put("Jack Black", "2103457834");
        entries.put("Sam Elliot", "2102546749");
        //System.out.println(entries);

        //System.out.println(entries.values());

        for(String entry : entries.values()) {
            System.out.println(entries+"\n");
       }






    }




    public static void showContacts(){
    String directory = "src";
    String filename = "contacts.txt";
    Path dataFile = Paths.get(directory, filename);
             try {
                Files.readAllLines(dataFile);
            }catch(IOException e) {
                e.printStackTrace();
            }

        }








}
