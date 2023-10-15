# Lab7.java
FOR NAMEAPP.JAVA
purpose of this class
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

FOR NAME APP
purpose of this class: fullName: String
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
