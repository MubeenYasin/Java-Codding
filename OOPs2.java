// ******************************************************* 
// OPPs     PARAMETERIC CONSTRUCTER
// ******************************************************* 

//  CREATE A CLASS OUTSIDE THE MAIN PUBLIC CLASS

class Workers {
    // create attributes
    String name;
    String level;
    int age;

    // define methood
    public void WorkersInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("Level : " + this.level);
        System.out.println("Age : " + this.age + " Years");
    }
    // create parameteric construcer
    Workers(String name, String level, int age) {
        this.name = name;
        this.level = level;
        this.age = age;
    }
}

public class OOPs2 {
    public static void main(String args[]) {
        // create object using parameteric Constructor
        Workers worker01 = new Workers("Mubeen Ysin", "15th", 45);
        Workers worker02 = new Workers("Mateen", "10th", 15);

        // call WorkersInfo methood
        worker01.WorkersInfo();
        worker02.WorkersInfo();

    }
}
