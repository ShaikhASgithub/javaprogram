package assigment;

import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of names: ");
        int numNames = scanner.nextInt();
        scanner.nextLine(); 

        
        String[] names = new String[numNames];

        for (int i = 0; i < numNames; i++) {
            System.out.println("Enter name " + (i + 1) + ": ");
            names[i] = scanner.nextLine();
        }

        System.out.println("Names in the array:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name at index " + i + ": " + names[i]);
        }

        System.out.print("Enter a name to search for: ");
        String searchName = scanner.nextLine();
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(searchName)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(searchName + " was found in the array.");
        } else {
            System.out.println(searchName + " was not found in the array.");
        }

      
        scanner.close();
    }
}
