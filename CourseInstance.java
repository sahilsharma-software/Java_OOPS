public class CourseInstance {
    // fields
    String course;
    String instructor;
    int duration;
    
    // instance block 1
     {
        course="FULL JAVA COURSE ";
        instructor="ANKIT BIYANPURIA ";
        duration=12;
        System.out.println(" course name :"+course);
        System.out.println("instructor name :"+instructor);
        System.out.println("duration "+" "+duration+" "+" months");
     }
     // instance block 2
     {
        course="FULL C++ COURSE ";
        instructor="ANKIT BIYANPURIA ";
        duration=13;
        System.out.println(" course name :"+course);
        System.out.println("instructor name :"+instructor);
        System.out.println("duration "+" "+duration+" "+" months");
     }
     public static void main(String[] args) {
      CourseInstance obj=new CourseInstance();
     }


    
}
