
public class classCode0621Day7GiftCard {
	public static void main(String[] args) {

        double giftCard = 500;
        int uses = 3;
        System.out.println("Using giftcard. $150 removed");
        giftCard -= 150; // giftCard = giftCard - 150;
        uses--;
        System.out.println("Using giftcard. $99 removed");
        giftCard -= 99; // giftCard = giftCard - 150;
        uses--;
        System.out.println("Gift card balance left $ " + giftCard);
        System.out.println("Number of times card can be used: " + uses);


    }
}
