package mar8.LinkedList.com;

import java.util.Scanner;

class Contact {
    String name;
    String phoneNumber;
    Contact next;

    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.next = null;
    }
}

class ContactList {
    Contact head;

    public void addContact(String name, String phoneNumber) {
        Contact newContact = new Contact(name, phoneNumber);
        if (head == null) {
            head = newContact;
        } else {
            Contact temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newContact;
        }
        System.out.println("Contact added successfully!");
    }

    public void displayContacts() {
        if (head == null) {
            System.out.println("No contacts found.");
            return;
        }
        Contact temp = head;
        System.out.println("Contacts:");
        while (temp != null) {
            System.out.println("Name: " + temp.name + ", Phone: " + temp.phoneNumber);
            temp = temp.next;
        }
    }

    public void searchContact(String name) {
        if (head == null) {
            System.out.println("No contacts found.");
            return;
        }
        Contact temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                System.out.println("Contact found:");
                System.out.println("Name: " + temp.name + ", Phone: " + temp.phoneNumber);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Contact not found.");
    }
}

public class ContactManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactList contacts = new ContactList();
        
        int choice;
        do {
            System.out.println("\nContact Management System Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. Display Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter contact name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter contact phone number: ");
                    String phoneNumber = scanner.nextLine();
                    contacts.addContact(name, phoneNumber);
                    break;
                case 2:
                    contacts.displayContacts();
                    break;
                case 3:
                    System.out.print("Enter contact name to search: ");
                    String searchName = scanner.nextLine();
                    contacts.searchContact(searchName);
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
