import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.*;
import java.util.*;

public class SpeechReader
{
  
  public static void main(String[] args)
  {
    int lineNum= 1;
    int TotLetters=0;
    int wordCount= 0;
    int AvgWordLength=0;
    try
    {
     File myFile= new File("gwbush.txt");
     FileReader fileReader = new FileReader(myFile);
    
     BufferedReader reader = new BufferedReader(fileReader);
    String line= null; 
    
    while ((line= reader.readLine()) != null)
    {
      for(int i= 0; i<line.length(); i++)
      {
        if(line.charAt(i)==' ')
          {
            wordCount++;
            break;
          }
        else if( ((int)line.charAt(i)>65 && (int)line.charAt(i)<90) || ((int)line.charAt(i)>97 && (int)line.charAt(i)<122))
        {
         TotLetters++;
        }
      }

    }
    reader.close();
  }
  catch (Exception ex)
  {
    ex.printStackTrace();
  }
    AvgWordLength= (TotLetters/wordCount);
    System.out.println(TotLetters);
    System.out.println("Average Word Length: "+ AvgWordLength);
    System.out.println("Total number of words: "+ wordCount);
 
  }
}
