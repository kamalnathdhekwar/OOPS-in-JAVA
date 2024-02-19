
import java.io.*;
public class write {
 
 public static void main(String args[]) throws Exception{ 

 FileReader fw=new FileReader("C:\\Users\\KAMAL\\Desktop\\OOPS in Java\\FileHandling\\webD.txt");

 int i ;
 int pink = 0 ;
 int count = 0 ;
 while((i=fw.read())!=-1){
    char k = (char)i;
   if(k=='a' || k=='e' || k=='i' || k=='o' || k=='u' || k=='A' || k=='B')
   {
    count++;
   }
   else{
    pink++;
   }
    
    
System.out.print(k);
 }
 System.out.println(count);
 System.out.println(pink);

 fw.close(); 
 }
}