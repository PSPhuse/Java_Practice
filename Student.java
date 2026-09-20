package Collection;

public class Student {
    String name;
    int id;
    double gread;

    public Student(int id,String name,double gread)
    {
        this.id = id;
        this.name = name;
        this.gread = gread;
    }
    public void getStudent()
    {
        System.out.println("Id:"+id+" Name:"+name+" Gread:"+gread);
        System.out.println("==================");
    }
}
