/*Eli james cis 200 lab b 
 * 
 * purpose of this class
 * Create the application class NameApp. In this class, you will create 4 separate Name objects. (If you are
already familiar with object arrays, feel free to use an Array of Objects. Otherwise, simply use 4 different
variable names to hold your 4 objects.)
-For name 1, use the default constructor when creating.
-For name 2, use the 1-arg constructor, setting the age to 99.
-For name 3, use the 1-arg constructor, setting the name to the name entered by the user.
-For name 4, use the 2-arg constructor, setting the name and age entered by the user.
**After creating the 4 objects, use your get methods to display each as shown on the next page.
3) Next, ask the user for the age of name 3 and use the set method to change. Verify the age is between 1-100
(inclusive) before changing the age. Then use your display method to display name 3 only.
4) Lastly, use your setInitial methods to set the initials for both name 4 and name 2, then use the getInitial
methods to display the initials as shown below, followed by the result of calling the rearrange method on
each (as shown below)
Your output will look like the following:
Enter your full name (first middle and last name): John Quincy Adams
Enter your age: 66
Name 1: Tater O Tot
Age: -1
Name 2: Tater O Tot
Age: 99
Name 3: John Quincy Adams
Age: -1
Name 4: John Quincy Adams
Age: 66
Please enter the new age of Name 3: 77
Changing the age of name 3...
Name 3: John Quincy Adams
Age: 77
Initials of name 4: J.Q.A.  Call the
getInitial methods to display
Adams, John Q.  Call the
rearrange method to display
Initials of name 2: T.O.T.  Call the
getInitial methods to display
Tot, Tater O.  Call the
rearrange method to display
 * 
 * /* */

import java.util.Scanner;

public class NameApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter their full name and age
        System.out.print("Enter your full name (first middle and last name): ");
        String fullName = sc.nextLine();
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        // Create four Name objects with the specified constructors
        Name name1 = new Name();
        Name name2 = new Name(99); // Use the 1-arg constructor, setting the age to 99
        Name name3 = new Name(fullName); // Use the 1-arg constructor, setting the name to the name entered by the user
        Name name4 = new Name(fullName, age); // Use the 2-arg constructor, setting th


        // Display Name 1
        System.out.println("Name 1: " + name1.getFullName());
        System.out.println("Age: " + name1.getAge());

        // Display Name 2
        System.out.println("Name 2: " + name2.getFullName());
        System.out.println("Age: " + name2.getAge());

        // Display Name 3
        System.out.println("Name 3: " + name3.getFullName());
        System.out.println("Age: " + name3.getAge());

        // Display Name 4
        System.out.println("Name 4: " + name4.getFullName());
        System.out.println("Age: " + name4.getAge());

        // Ask for age of Name 3
        System.out.print("Please enter the new age of Name 3: ");
        int newAge = sc.nextInt();
        name3.setAge(newAge);
        System.out.println("Changing the age of Name 3...");
        System.out.println("Name 3: " + name3.getFullName());
        System.out.println("Age: " + name3.getAge());
// Set initials and rearrange names
        name2.setFirstInitial('T');
        name2.setMiddleInitial('O');
        name2.setLastInitial('T');
        name4.setFirstInitial('J');
        name4.setMiddleInitial('Q');
        name4.setLastInitial('A');

        // Display initials and rearranged names
        System.out.println("Initials of name 4: " + name4.getFirstInitial() + "." + name4.getMiddleInitial() + "." + name4.getLastInitial());
        System.out.println(name4.rearrange());
        System.out.println("Initials of name 2: " + name2.getFirstInitial() + "." + name2.getMiddleInitial() + "." + name2.getLastInitial());
        System.out.println(name2.rearrange());

    }
    }