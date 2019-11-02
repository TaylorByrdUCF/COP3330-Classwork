import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

public class DuplicateRemover {

    ArrayList<String> uniqueWords = new ArrayList<String>();

    public void remove(String dataFile) throws IOException{

        /*A BufferedReader is used to comb through the words presented in the file.
          It will take each line of words in the dataFile and parse through it saving
          the string of words in that line to the String "words".

          A while loop is utilized to make sure that the method "remove" is only ran
          while there are words left to read in the dataFile, hence if the bufferedReader returns no string
          of words (null) it will exit.

          If no file is found, it will give an IOException.
         */

        BufferedReader bufferedReader = new BufferedReader(new FileReader(dataFile));
        String words = bufferedReader.readLine();
        while(words != null)
        {
            /*
            String temp[] = words.split("[ .,!?\"]") is used to make sure that multiple words in a line are separated by the
            characters designated between the brackets. Even the space is considered as a splicing character.
            After which, a for loop is set up that procedurally checks to see if each word has all ready been added to
            the ArrayList "uniqueWords". If it is not already on the ArrayList it is added.
            */
            String temp[] = words.split("[ .,!?\"]");
            for(String i:temp)
                {
                    if(!uniqueWords.contains(i)) uniqueWords.add(i);
                }
            words = bufferedReader.readLine(); //Reading the next String line in the dataFile.
        }

        bufferedReader.close();;
    }


    public void write(String dataFile) throws FileNotFoundException{

        PrintWriter pw = new PrintWriter(dataFile);

        //Nothing crazy going on here, just a for loop that loops through the ArrayList unique words and writes them to the file "DataFile".
        for(String i:uniqueWords)
            {
            pw.println(i);
            }
        pw.close();
    }
}
