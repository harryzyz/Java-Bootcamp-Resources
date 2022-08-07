import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.Scanner;

import models.Contact;
import models.ContactManager;

public class Main {
    static ContactManager manager = new ContactManager();

    public static void main(String[] args) {
        try {
            loadContacts("contacts.txt");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("CONTACTS LOADED\n\n");
            System.out.println(manager);
            manageContacts();
        }

    }

    /**
     * Name: manageContacts
     *
     * Inside the function:
     * - 1. Starts a new instance of Scanner;
     * - 2. In an infinite loop, the user can choose to a) add b) remove a contact
     * c) exit.
     * - case a: ask for the name, phone number and birthDate.
     * - case b: ask who they'd like to remove.
     * - case c: break the loop.
     * - 3. close Scanner.
     */
    public static void manageContacts() {
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Please choose: \na) - add a contact \nb) - remove a contact \nc) - exit ");
            String choice = scan.nextLine();
            if (choice.equals("a")) {

                System.out.print("please add name:");
                String name = scan.nextLine();
                System.out.print("please add phone number:");
                String phoneNumber = scan.nextLine();
                System.out.print("please add birth date:");
                String birthDate = scan.nextLine();
                if (name.isBlank() || phoneNumber.isBlank() || phoneNumber.length() < 5) {
                    System.out.println("\nThe input your provided is not valide. Registration failed.");
                } else {
                    try {
                        manager.addContact(new Contact(name, phoneNumber, birthDate));
                    } catch (ParseException e) {
                        System.out.println(e.getMessage());
                    } finally {
                        System.out.println("\n\nUPDATED CONTACTS\n\n" + manager);
                    }
                }

            } else if (choice.equals("b")) {

                System.out.println("please provide the contact name to remove");
                String name = scan.nextLine();
                manager.removeContact(name);
                System.out.println("\n\nUPDATED CONTACTS\n\n" + manager);
            } else {
                break;
            }
        }

        scan.close();

    }

    /**
     * Name: loadContacts
     * 
     * @param fileName (String)
     * @throws FileNotFoundException
     *
     *                               Inside the function:
     *                               - 1. loads contacts from <fileName>;
     *                               - 2. From the manager object, it adds all
     *                               contacts to the contacts list.
     *                               Hint: use scan.next to grab the next String
     *                               separated by white space.
     */
    public static void loadContacts(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Scanner scanfile = new Scanner(fis);
        while (scanfile.hasNextLine()) {
            try {
                Contact contact = new Contact(scanfile.next(), scanfile.next(), scanfile.next());
                manager.addContact(contact);
            } catch (ParseException e) {
                System.out.println(e.getMessage());
            }
        }
        scanfile.close();
    }
}

// try {
// ContactManager manager = new ContactManager();
// manager.addContact(new Contact("Ryan", "6135012424", "11/11/1992"));
// manager.addContact(new Contact("Gio", "6477092344 ", "11/11/1993"));
// manager.addContact(new Contact("Thomas", "8192256979 ", "11/11/1994"));
// manager.removeContact("Gio");
// System.out.println(manager);
// } catch (ParseException e) {
// System.out.println(e.getMessage());
// } finally {
// System.out.println("Process Complete.");
// }
// }