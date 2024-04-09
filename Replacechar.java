
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
 
public class Replacechar
{   
    static void modifyFile(String filePath, String oldString, String newString)
    {
        File fileToBeModified = new File("mytext.txt");
         
        String oldContent = "";
         
       
         
         
         
        try
        {
            BufferedReader reader = new BufferedReader(new FileReader("mytext.txt"));
           
             
            String line=reader.readLine();
             
            while (line != null) 
            {
                oldContent = oldContent + line + System.lineSeparator(); 
                line = reader.readLine();
            }
             
            String newContent = oldContent.replaceAll(oldString, newString); 
            FileWriter writer = new FileWriter("mytext.txt");
             
            writer.write(newContent);
            reader.close();
            writer.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        
    }
     
    public static void main(String[] args)
    {
    
        modifyFile("C:/StudentFile.txt", "nam", "konichiva");
         
        System.out.println("done");
    }
}