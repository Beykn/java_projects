import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("data.txt"));
        PrintWriter output = new PrintWriter(new File("output.txt"));
        String row;
        char newOne, oldOne;
        int count = 1;
        while(input.hasNext()){
            row = input.nextLine();
            oldOne = row.charAt(0);
            for(int i = 1; i< row.length();i++){
                newOne = row.charAt(i);
                if(newOne == oldOne){
                    count++;
                    if(i == row.length()-1)
                        output.print(newOne + "" + count );
                }
                else{
                    output.print(oldOne + "" + count);
                    count = 1;
                    if(i == row.length()-1)
                        output.print(newOne + "" + count );
                }
                oldOne= newOne;
            }
            count = 1;
            output.println();
        }
        input.close();
        output.close();
    }
}