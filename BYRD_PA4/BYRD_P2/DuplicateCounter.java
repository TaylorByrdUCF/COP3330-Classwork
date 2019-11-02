import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class DuplicateCounter {
    /*
        I choose to use a HashMap this time around to keep track of the unique words. The main reason why is because
        unlike part1, where I needed to only keep track of each new occurring word, I now need to keep track of how
        many times each unique word shows up.

        While I could of probably found some bastardized way of utilizing several different arrays to serve the same
        purpose, a HashMap was the easiest / most convent method to achieving the same goal that I had at my current
        disposal. That is simply because it functions almost identically to an ArrayList, but it also allows another
        data type to be link to the host (Key). The host (Key) this time around is each String of unique words while
        the linked data type (value) is an integer signifying the amount of times it has occurred.
    */
    Map<String, Integer> wordCounter = new HashMap<String, Integer>();

    public void count(String dataFile) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(dataFile)); //Buffered Reader to read from the designated file one line at a time.
        String words = bufferedReader.readLine();

        while(words != null){
            String temp[] = words.split("[ ,.!?\"]"); //Temporary string array that splits the line of words by the designated characters in the brackets.

            /*
            For loop to check an see if a word is already registered in the HashMap "wordCounter".
            If it is, it pulls the amount of times it has already occurred and increments it by 1.
            Else, it just adds a new word to the HashMap "wordCounter" and initializes it to 1 occurrence.
            */

            for(String s:temp){
                if(!wordCounter.containsKey(s)){
                    wordCounter.put(s, 1);
                }
                else{
                    int count = wordCounter.get(s);
                    wordCounter.put(s, count + 1);
                }
            }
            words = bufferedReader.readLine(); //Reading new line of words in dataFile.
        }
        bufferedReader.close();
    }

    public void write(String outputFile) throws FileNotFoundException{

        //For loop that writes out each Word and Occurrence rate from the HashMap wordCounter to the file outputFile.
        PrintWriter pw = new PrintWriter(outputFile);
        for(Map.Entry<String, Integer> entry: wordCounter.entrySet()){
            pw.println(entry.getKey() + " : " + entry.getValue());
        }
        pw.close();
    }
}
