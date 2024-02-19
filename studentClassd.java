public class studentClassd {
    
    // creata class named student 
    public static class student{
        String name ;
        int RollNo ;
         double percent ;
       }

    //    main class 
    public static void main(String[] args) {
       
         // first object that is "y"
        student x = new student();
        x.name = "kamalnath dhekwar";
        x.RollNo= 41 ;
        x.percent = 97.869;   

// printing details of x students 
        System.out.println("Details of x student");
        System.out.println(x.name );
        System.out.println(x.RollNo);
        System.out.println(x.percent);

        // second object that is "y"
        student  y = new student();

        y.name = "rahul";
        y.RollNo = 42;
        x.percent = 98.333;
        System.out.println("\n");
        // printing details of y students 
        System.out.println("Details of y student");
        System.out.println(y.name );
        System.out.println(y.RollNo);
        System.out.println(y.percent);

    }
}
