
public class Main {
    public static void main(String[] args){
        DeckOfCards deck = new DeckOfCards();
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                SinglePlayingCard card = deck.getCard(suit, rank);
                String  cardRank = card.rankToString(card.getRank());
                String  cardSuit = card.suitToString(card.getSuit());
                System.out.println("====================");
                System.out.println("=  "+cardRank+" of "+cardSuit+"  =");
                System.out.println("====================");

            }
        }
//        for (int suit = SinglePlayingCard.DIAMONDS; suit <= SinglePlayingCard.SPADES; suit++) {
//            for (int rank = SinglePlayingCard.ACE; rank <= SinglePlayingCard.KING; rank++) {
//                SinglePlayingCard card = deck.getCard(suit, rank);
//                System.out.format("%s of %s%n",
//                        card.rankToString(card.getRank()),
//                        card.suitToString(card.getSuit()));
//            }
//        }
    }
}