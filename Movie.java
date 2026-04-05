public class Movie {
    String title;
    String director;
    int releaseYear,rating;
   // default constructor 
   Movie()
   {
    title="anonymous ";
    director="unknown";
    releaseYear=0000;
    rating=0;
   }
   // method to call default constructor 
   void printDetails()
   { 
    System.out.println("title: "+title+"director: "+director+"  release year:"+releaseYear+"rating: "+rating);

   }
   // parametrized consturctor
   Movie(String t,String d)
   {
    title=t;
    director=d;
   }
   // method to call parameterized constructor
   void printDetail()
   {
     System.out.println("title: "+title+"director: "+director);
   }

   // one more parametrized constuctor
   Movie(String title,String director,int releaseYear,int rating)
   {
    System.out.println("TITLE "+title+" director:"+director+" release year"+releaseYear+" rating"+rating);
   }
   // copy constructor
   Movie(Movie ref)
   {
    title=ref.title;
    director=ref.director;
     System.out.println("TITLE OF THE MOVIE is"+title+" director of the movie is "+director);

   }

   public static void main(String[] args) {
    Movie obj=new Movie();
    obj.printDetails();
    Movie obj2 =new Movie("KHAKEE: THE BIHAR CHAPTER "," AMIT LODHA");
    obj2.printDetail();
    Movie obj3=new Movie("khakee: the bihar chapter","amit lodha",2004,10);
    Movie obj4=new Movie(obj2);
   }

    
}

