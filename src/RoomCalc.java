import java.util.Scanner;


/**
 * Created by Nicole
 * 1/30/2017
 */
public class RoomCalc {
    public static void main (String [] args) {

        //1. set up resources
        Scanner peri = new Scanner(System.in);


        //2. output so the user knows what's up
        System.out.println("Welcome to the Room Calculator");

        //3. ask for input
        System.out.print("Please enter length of room: ");
        double length = peri.nextDouble();

        System.out.print("Please enter width of room: ");
        double width = peri.nextDouble();

        //4. perform calculations
        double room = .5 * length * width;

        //5. output results
        System.out.println("The room is " + room);

        //6. close out resources

        peri.close();

        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Room: " + room);

    }

}







