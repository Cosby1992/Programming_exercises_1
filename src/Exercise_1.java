import java.util.Scanner;

public class Exercise_1 {

    public static void main(String[] args) {

        Scanner scan;

        boolean quitKey;
        String key;

        quitKey = false;

        while (quitKey == false) {
            scan = new Scanner(System.in);
            System.out.println("Press 'Q' to quit the program\n" +
                    "Press 'S' for square calculation\n" +
                    "Press 'T' for triangle calculation\n" +
                    "Press 'V' for volume of a box");

            key = scan.nextLine();


            if (key.equalsIgnoreCase("q")) {
                quitKey = true;
            } else if (key.equalsIgnoreCase("s")) {
                double aSquare;
                double bSquare;

                System.out.println("Please enter the length of a square: ");
                aSquare = scan.nextDouble();

                System.out.println("\nPlease enter the width of a square: ");
                bSquare = scan.nextDouble();

                double area = aSquare * bSquare;
                double circumference = aSquare * 2 + bSquare * 2;

                System.out.println("\nThe area and circumference of a square with the length " + aSquare + " " +
                        "and the width " + bSquare + " is as follows:");
                System.out.println("\nThe area is: " + area);
                System.out.println("The circumference is: " + circumference + "\n");

            } else if (key.equalsIgnoreCase("t")) {
                double aTriangle;
                double bTriangle;

                System.out.println("Please enter the Height of a triangle: ");
                aTriangle = scan.nextDouble();

                System.out.println("\nPlease enter the width of a triangle: ");
                bTriangle = scan.nextDouble();

                double area = (aTriangle * bTriangle) / 2;

                System.out.println("\nThe area of a triangle with the height " + aTriangle + " " +
                        "and the width " + bTriangle + " is as follows:");
                System.out.println("\nThe area is: " + area);

            } else if (key.equalsIgnoreCase("v")) {
                System.out.println("Please  enter width of the box: ");
                double aBox = scan.nextDouble();
                System.out.println("Please enter height of the box: ");
                double bBox = scan.nextDouble();
                System.out.println("Please enter depth of the box: ");
                double cBox = scan.nextDouble();

                RumfangBeregner kasse = new RumfangBeregner();
                double rumfang = kasse.rumfang(aBox, bBox, cBox);
                System.out.println("The volume of the box is: " + rumfang);
            } else {
                System.out.println("Invalid input, please select an input from the list below: \n");
            }
        }

    }
}

