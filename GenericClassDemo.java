public class GenericClassDemo
{
    public static void main(String[] args) {
        
    
        MyGen<Integer> m1 = new MyGen();
        m1.add(99);
        System.out.println(m1.get());

    }
}
class MYGen<T>
{
    T.obj;
    void add(T obj)
    {
        this.obj = obj;
    }
    T get()
    {
        return obj;
    }
}