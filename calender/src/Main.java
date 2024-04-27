import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        int dayAmount;
        String firstDay;
        Scanner input = new Scanner(new File("calender_in.txt"));
        dayAmount = input.nextInt();
        firstDay = input.next().substring(0,2);
        display(dayAmount, firstDay);

    }
    public static void display(int dayAmount, String firstDay) throws FileNotFoundException {
        PrintWriter output = new PrintWriter(new File("calender_out.txt"));
        int colomn = 0;
        switch (firstDay){
            case "Su":
                colomn = 0;
                break;

            case "Mo":
                colomn = 1;
                break;

            case "Tu":
                colomn = 2;
                break;

            case "We":
                colomn = 3;
                break;

            case "Th":
                colomn = 4;
                break;
            case "Fr":
                colomn = 5;
                break;
            case "Sa":
                colomn = 6;
                break;
        }
        output.println("S\tM\tT\tW\tT\tF\tS");
        for(int i=0 ; i < colomn; i++ ){
            output.print("\t");
        }
        for(int d=1 ; d < dayAmount; d++ ){
            output.print(d+"\t");
            if(++colomn==7){
                output.println();
                colomn =0;
            }
        }
        output.close();
    }

}