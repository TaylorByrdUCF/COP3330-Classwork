public class Application {

    public static void main(String[] args) throws java.io.IOException{

        DuplicateRemover duplicateRemover = new DuplicateRemover(); //Creating a object.
        duplicateRemover.remove("problem1.txt"); //removing duplicate words from the file named "problem1.txt"
        duplicateRemover.write("unique_words.txt"); //writing the ArrayList of uniqueWords to a file named "unique_words.txt".
        System.out.printf("Removal of duplicate words complete");

    }

}
