package filereader;
import java.io.*; 
public class reader {
 
 public static void main(String args[])throws Exception{ 
 Filereader fr = new Filereader();
 int i; 
 while((i=fr.read())!=-1) 
 System.out.print((char)i); 
 fr.close(); 
 } 
}
