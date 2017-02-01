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
        System.out.println("Enter Room Calculator");


        //3. ask for input
        int answer = 1;
        while (answer == 1) {


            System.out.print("Please enter length of room: ");
            double length = peri.nextDouble();

            System.out.print("Please enter width of room: ");
            double width = peri.nextDouble();

            //4. perform calculations
            double room = length * width;
            double perimeter = 2 * (length + width);

            //5. output results
            System.out.println("The room is " + room);
            System.out.println("The perimeter is " + perimeter);

            System.out.println("Continue? Enter (1) for yes; + Enter (2) for no;");
            answer = peri.nextInt();
        }

        //6. close out resources

        peri.close();


    }

}







