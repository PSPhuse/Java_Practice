/* we can cerate Annonymous Inner Class in interface implemented class always */

interface Person
{
    void speak();
    void eat();
}

public class Nested_Annonyms {
    
    public static void main(String[] args) {
        
        Person p1=new Person() {
            public void speak()
            {
                System.out.println("This is Speal Method of Annonymus class");
            }
            public void eat()
            {
                System.out.println("I Love Mango Fruit");
            }
        };
        p1.speak();
        p1.eat();
    }

}