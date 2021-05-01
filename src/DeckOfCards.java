public class DeckOfCards {
    public static int numOfSuits=4;
    public static int numOfRanks=13;
    public static int numOfCards=numOfRanks*numOfSuits;
    private SinglePlayingCard[][] cards;

    public DeckOfCards() {
        cards = new SinglePlayingCard[numOfSuits][numOfRanks];
        for (int suit = 1; suit <= 4; suit++) {
            for (int rank = 1; rank <= 13; rank++) {
                cards[suit-1][rank-1] = new SinglePlayingCard(rank, suit);
            }
        }
        //for ENUM
//        for (int suit = SinglePlayingCard.DIAMONDS; suit <= SinglePlayingCard.SPADES; suit++) {
//            for (int rank = SinglePlayingCard.ACE; rank <= SinglePlayingCard.KING; rank++) {
//                cards[suit-1][rank-1] = new SinglePlayingCard(rank, suit);
//            }
//        }
    }

    public SinglePlayingCard getCard(int suit, int rank) {
        return cards[suit-1][rank-1];
    }
}

