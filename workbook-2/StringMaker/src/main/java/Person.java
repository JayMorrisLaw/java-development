public class Person {
    // these are attributes , the attributes need to be made private
   private String name;
   private int age;
//   creating an object using a constructor


    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // this is called a getter// goes to a class and returns a specific action
    public String getName() {
        return this.name;

    }
    // this is called a setter// 
    public void setName(String name){
        this.name = name;
// Class = recipe blue print
//Object = Actual dish
//Encapsulation = kitchen secrets(like keeping a secret sauce private)
    }


}
