
/*
 * Date: Aug 24, 2025
 * Author: Jelani Jenkins
 * Class: 420-j319
 * Teacher: Elijah Finch
 * Assignment: 
 */
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class JelaniDataFile {
    private static final String FILE = "Jelani_datafile.dat";

    public static void main(String[] args) {
        if (args.length == 0) { System.out.println("Usage: java JelaniDataFile ");
         return; 
        }

        if (args[0].equalsIgnoreCase("write")) {
            writeData();
        } else if (args[0].equalsIgnoreCase("read")) {
            readData();
        } else {
            System.out.println("Usage: java JelaniDataFile write|read");
        }
    }

    private static void writeData() {
        
        Random r = new Random();
        int[] ints = r.ints(5, 1, 101).toArray();
        double[] dbls = r.doubles(5, 0, 100).map(d -> Math.round(d * 100.0) / 100.0).toArray();

        try (FileWriter fw = new FileWriter(FILE, true)) {
            fw.write("Integers: " + Arrays.stream(ints).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + "\n");
            
            fw.write("Doubles: " + Arrays.stream(dbls).mapToObj(String::valueOf).collect(Collectors.joining(" ")) + "\n\n");
            
            System.out.println("Wrote 5 ints and 5 doubles to " + FILE);
        } catch (IOException e) { System.out.println(e.getMessage()); }
    }

    private static void readData() {
        
        try (Scanner sc = new Scanner(new File(FILE))) 
        {
            while (sc.hasNextLine()) System.out.println(sc.nextLine());
        } 
        catch (FileNotFoundException e) {
             System.out.println("No data file found."); 
            }

    }
}