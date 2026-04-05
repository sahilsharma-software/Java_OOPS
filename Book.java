public class Book {
    String title;
    String author;
    public
    Book(String t,String a)
    {
        title=t;
        author=a;
        
    }
    void display()
    {
        System.out.println("BOOK NAME IS: "+title);
        System.out.println("AUTHOR NAME IS: "+author);
    }
    
}
class Page extends Book
{
       String language;
       int page;
       public
       Page( String title,  String author , String languages,int  pages)
       {
        super(title,author);
        language=languages;
        page=pages;

       }
       void display()
       {
        super.display();
        System.out.println("language is: "+language);
        System.out.println("TOTAL PAGES: "+page);

       }
       public static void main(String[] args) {

        Page obj=new Page("MY EXPERIMENT WITH TRUTH ","MAHATMA GANDHI","ENGLISH",1024);
        obj.display();

       }


}
