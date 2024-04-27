import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("input.txt");
        Scanner input = new Scanner(inputFile);
        String birSatir;
        //When reading a txt file, "useDelimiter()" method separate the data from commas, dots, etc.
        input.useDelimiter(",");
        while (input.hasNext()){
            birSatir = input.next();
            System.out.println(birSatir);
        }
        input.close();

    }
}