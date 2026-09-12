/* We can direct Write inner class within a outher class
---Inner class access member of outer class */

public class Nested_Member {
    private String s="Outer Class";

    void show()
    {
        System.out.println("This is Outer Class");
    }
    
    class Member
    {
        void show()
        {
            System.out.println("This is Nested Member Class");
            System.out.println("Variable of : "+s);
        }
        
    }

    public static void main(String[] args) {
        
        Nested_Member n = new Nested_Member();
        n.show();

        Nested_Member.Member m = n.new Member();
        m.show();
    }
}
