public class Granthalaya {
    
    private String lib = "Creazy";
    public static void main(String[] args) {

        Granthalaya l = new Granthalaya();
        Granthalaya.Book b1 = l.new Book();
        b1.add("Java", "Jems Gosiling", 599);
        b1.getbook();

        Granthalaya.Book b2 = l.new Book();
        b2.add("Python", "Vasuki", 999);
        b2.getbook();
    }
    class Book
    {
        private String name;
        private String author;
        private int price;

        public void add(String name,String author,int price)
        {
            this.name = name;
            this.author  = author;
            this.price = price;
        }

        public void getbook()
        {
            System.out.println("Name of Granthalaya:"+lib);
            System.out.println("Name of Book:"+name);
            System.out.println("Name of Author:"+author);
            System.out.println("Price of Book:"+price);
        }
    }
}
