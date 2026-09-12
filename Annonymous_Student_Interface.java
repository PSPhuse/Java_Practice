/*we can create Anonymous Class in Interface */

interface Annonymous_Student_Interface
{
    void collage();
    void roll_no();
    void gread();

    public static void main(String[] args) 
    {

        Annonymous_Student_Interface s=new Annonymous_Student_Interface() {
            public void collage()
            {
                System.out.println("SSGMC");
            }
            public void roll_no()
            {
                System.out.println(260603682);
            }
            public void gread()
            {
                System.out.println("1st Class");
            }
        };
        s.collage();
        s.roll_no();
        s.gread();
    }
}