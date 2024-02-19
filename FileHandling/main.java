import java.io.*;

class main
{
    public static void main(String[] args) {
        File f= new File("C:\\Users\\KAMAL\\Desktop\\OOPS in Java\\FileHandling\\webD.txt");
      
        
              if(f.exists())
        {
            System.out.println("File Name:"+f);
            System.out.println("File Path:"+f.getAbsolutePath());
            System.out.println("File Writable:"+f.canWrite());
            System.out.println("File readable:"+f.canRead());
             System.out.println("File readable:"+f.length());
             

           
        }
        else{
            System.out.println("file does Not exist");
        }
        }
}