import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;

public class simpleReader
{
  public static void main(String[] args)
  {
    int lineNum=1;
    try
    {
     File myFile= new File("simpleReader.java");
     FileReader fileReader = new FileReader(myFile);
    
     BufferedReader reader = new BufferedReader(fileReader);
    String line= null; 
    
    while ((line= reader.readLine()) != null)
    {
      System.out.print(lineNum+(". "));
      System.out.println(line);
      lineNum++;
    }
    reader.close();
  }
  catch (Exception ex)
  {
    ex.printStackTrace();
  }
    
 
  }
}
