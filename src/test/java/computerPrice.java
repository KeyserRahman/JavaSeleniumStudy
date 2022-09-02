import java.util.Scanner;

public class computerPrice {

        public static void main(String[] args) {
            double finalPrice = 0.0;
            double screenSize;
            String cpuType;
            int ramSize = 0;
            String storageType;
            int storageSize = 0;
            String screenResolution = "";

            System.out.println("Select screen size:");
            Scanner input = new Scanner(System.in);
            screenSize = input.nextDouble();
            if (screenSize == 13.3) {
                finalPrice += 200;
            } else if (screenSize == 15.0) {
                finalPrice += 300;
            } else if (screenSize == 17.3) {
                finalPrice += 400;
            } else {
                System.out.println("Invalid Screen Size");
            }


            System.out.println("Select CPU type:");
            cpuType = input.next();
            switch (cpuType) {
                case "i3":
                    finalPrice += 150;
                    break;
                case "i5":
                    finalPrice += 250;
                    break;
                case "i7":
                    finalPrice += 350;
                    break;
                default:
                    System.out.println("Invalid CPU Type:");
            }


            System.out.println("Select RAM size:");
            ramSize = input.nextInt();
            if (ramSize % 4 == 0) {
                finalPrice += ramSize / 4 * 50;
            } else {
                System.out.println("Invalid Ram Size");
            }
            System.out.println(finalPrice);

            System.out.println("Select storage type:");
            storageType = input.next();
            System.out.println("Select storage size:");
            screenSize = input.nextInt();
            if (storageType.equals("HDD")) {
                finalPrice += screenSize / 500 * 50;
            } else {
                finalPrice += screenSize / 500 * 100;
            }


            System.out.println("Select screen resolution:");
            screenResolution = input.next();
            if (screenResolution.equals("FULLHD")) {
                finalPrice += 100;
            } else if (screenResolution.equals("4K")) {
                finalPrice += 200;
            } else {
                System.out.println("Invalid Screen Resolution");
            }

            System.out.println("Laptop price is: $" + finalPrice);
            input.close();
        }
    }

