/* Nested Local class can be created into a method of outer class 
---it can also access outer class member */

public class Nested_Local {
    
    static String name="Demo";

    void disp()
    {
        class Local
        {
            void msg()
            {
                System.out.println("This is Nested Local Class");
                System.out.println("Outer class Variable:"+name);
            }
        }
        Local l1=new Local();
        l1.msg();
    }

    public static void main(String[] args) {
        
        Nested_Local l1=new Nested_Local();
        l1.disp();
    }
}
