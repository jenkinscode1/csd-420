import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class WordSorter {
    public static void main(String[] args) {
        File file = new File("collection_of_words.txt");

        Set<String> words = new TreeSet<>();

        try {
            File file = new File("collection_of_words.txt");
            Scanner input = new Scanner(file);

            while (input.hasNext()) {
                String word = input.next().toLowerCase().replaceAll("[^a-z]", "");
                if (!word.isEmpty()) {
                    words.add(word);
                }
            }
            input.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            return;
        }



        // read and print the file contents
        System.out.println("Words in ascending order:");
        for (String word : words) {
            System.out.println(word);
        }

        System.out.println("\nWords in descending order:");
        for (String word : ((TreeSet<String>) words).descendingSet()) {
            System.out.println(word);
        }
    }
}