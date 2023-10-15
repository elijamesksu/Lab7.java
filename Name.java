/*Eli james cis 200 lab b 
 * 
 * purpose of this class: fullName: String
-age: int
- firstInitial, -middleInitial, -lastInitial: char
+Name ()
+Name (age:int)
+Name (name:String)
+Name (name:String, age:int)
+ setAge (int):void
+setFirstInitial ():void...same for setMiddleInitial / setLastInitial
+getFullname(): String
+getAge(): int
+getFirstInitial():char...same for getMiddleInitial / getLastInitial
+rearrange(): String
1) From scratch, create a class called Name using the UML class diagram given above. The class contains four
constructors - one that set the data properties to a default (where default age is -1 and default name is "Tater
O Tot"), the two 1-arg constructors set the single data property to the value passed in and sets the other data
property to the default, and a 2-arg constructor which sets both data properties to the values passed in. In
addition, add the set/get methods and the rearrange method using the signatures given in the UML diagram.
The rearrange method will return the name as Lastname, Firstname MiddleInitial. For example, the name
John Quincy Adams would return as Adams, John Q.
 * 
 * 
 */
public class Name {
    private String fullName;
    private int age;
    private char firstInitial;
    private char middleInitial;
    private char lastInitial;

    // Default Constructor
    public Name() {
        fullName = "Tater O Tot";
        age = -1;
    }

    public Name(int age) {
        this();
        setAge(age);
    }

    public Name(String name) {
        this();
        setFullName(name);
    }


    public Name(String name, int age) {
        setFullName(name);
        setAge(age);
    }

    public void setAge(int age) {
        if (age >= 1 && age <= 100) {
            this.age = age;
        }
    }

    public void setFullName(String name) {
        fullName = name;
    }

    public void setFirstInitial(char initial) {
        firstInitial = initial;
    }

    public void setMiddleInitial(char initial) {
        middleInitial = initial;
    }

    public void setLastInitial(char initial) {
        lastInitial = initial;
    }

    public int getAge() {
        return age;
    }

    public String getFullName() {
        return fullName;
    }

    public char getFirstInitial() {
        return firstInitial;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public char getLastInitial() {
        return lastInitial;
    }

    // Construct the rearranged name
    public String rearrange() {
        String[] nameParts = fullName.split(" ");
        return nameParts[2] + "," + nameParts[0] + " " + getMiddleInitial() + ".";
    }
}