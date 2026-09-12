/*We can create Anonymous class using Abstract Class also.......... */

abstract class Employee
{
    abstract void org();
    abstract void dept();

    static void show()
    {
        System.out.println("Dream Tech of Advanced Java");
    }
}

public class Nested_Anonymous_Abstract {

    public static void main(String[] args) {
        //Anonymous Class 
        Employee e=new Employee() {
            public void org()
            {
                System.out.println("Organization Name is Lux_Cozi");
            }
            public void dept()
            {
                System.out.println("Role is Developer..!");
            }
        };  //end
        e.org();
        e.dept();
        e.show();
    }
}