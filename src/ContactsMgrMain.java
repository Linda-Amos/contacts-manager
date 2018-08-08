import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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


        List<String> entries = new ArrayList<>();
        entries.add("Jack Black|2103457834");
        entries.add("Sam Elliot|2102546749");
        //System.out.println(entries);

        //System.out.println(entries.values());

//        ----Need to work on "loop" to iterate through entries----
//        for(String entry : entries.values()) {
//            System.out.println(entries+"\n");
//       }


        System.out.println("" +
                "1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n\n" +
                "Please make a selection: (1, 2, 3, 4 or 5):  ");

        Scanner sc = new Scanner(System.in);
        int userSelection = sc.nextInt();

        switch (userSelection) {
            case 1:
                showContacts();
            case 2:
                addContacts(sc);
            case 3:

            case 4:

            case 5:


        }



    }




    public static void showContacts(){
    String directory = "src";
    String filename = "contacts.txt";
    Path dataFile = Paths.get(directory, filename);
             try {
                 System.out.println(Files.readAllLines(dataFile));
            }catch(IOException e) {
                e.printStackTrace();
            }

        }


        public static void addContacts(Scanner sc) {
            List<String> entries = new ArrayList<>();
            System.out.println("Provide a contact name: ");
            String addedEntry = sc.next();
            System.out.println("what is the phone number for this contact?\n");
            String addedNumber = sc.next();

            String directory = "src";
            String filename = "contacts.txt";
            Path dataFile = Paths.get(directory, filename);

            try {
                Files.write(dataFile, entries, StandardOpenOption.APPEND);
            } catch(IOException e) {
                e.printStackTrace();
            }

            System.out.println("Contact " + addedEntry + "| " + addedNumber + "has been added to your Rollodex");

        }





}
