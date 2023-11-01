// ******************************************************* 
// OPPs      NON-PARAMETERIC CONSTRUCTER
// ******************************************************* 

// 1-   CREATE A CLASS OUTSIDE THE MAIN PUBLIC CLASS

class Students {
    // 2- create attributes for object Students(variables in oop are called
    // attributes or properties)
    String name;
    String level;
    int age;

    // 3- define a methood for object Student(functions in oops are called methoods)
    void studentInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("Class : " + this.level);
        System.out.println("Age : " + this.age + " Years");
    }
    
}

public class OOPs {
    public static void main(String args[]) {
        // 4- using non-parameteric constructer create objects
        Students s1 = new Students();
        Students s2 = new Students();

        // 5- define object's attributes
        s1.name = "MUbeen Yasin";
        s1.level = "10th";
        s1.age = 20;

        s2.name = "Muhammad Mateen";
        s2.level = "8th";
        s2.age = 14;

        // 6-   print student info via calling class methood
        s1.studentInfo();
        s2.studentInfo();

    }
}
