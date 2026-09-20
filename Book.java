package Collection;

public class Book {

    int id;
    String bName;
    String author;
    double price;

    Book(int id,String bName,String author,double price)
    {
        this.id = id;
        this.bName = bName;
        this.author = author;
        this.price = price;
    }
    public void getBook()
    {
        System.out.println("ID:"+id+" Title:"+bName+" Author:"+author+" price:"+price);
        System.out.println("=======================");
    }
}