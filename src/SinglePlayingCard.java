public class SinglePlayingCard {
    private int rank;
    private int suit;

    public SinglePlayingCard(int rank , int suit)
    {
        if(rank >=1 && rank <=13)
            this.rank = rank;
        else
            System.out.println("inVailed rank");

        if(suit >=1 && suit <=4 )
            this.suit = suit;
        else
            System.out.println("inVailed suit");
    }

    public int getRank()
    {
        return rank;
    }
    public int getSuit()
    {
        return suit;
    }
    public static String rankToString(int rank) {
        switch (rank) {
            case 1:
                return "Ace";
            case 2:
                return "Deuce";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
            case 10:
                return "Ten";
            case 11:
                return "Jack";
            case 12:
                return "Queen";
            case 13:
                return "King";
            default:
                return null;
        }
    }
    public static String suitToString(int suit){
        switch (suit){
            case 1:
                return "Diamonds";
            case 2:
                return "Clubs";
            case 3:
                return "Hearts";
            case 4:
                return "Spades";
            default:
                return null;
        }
    }


    //to rewrite it in Enum Types.
    //ranks
//    public final static int ACE   = 1;
//    public final static int DEUCE = 2;
//    public final static int THREE = 3;
//    public final static int FOUR  = 4;
//    public final static int FIVE  = 5;
//    public final static int SIX   = 6;
//    public final static int SEVEN = 7;
//    public final static int EIGHT = 8;
//    public final static int NINE  = 9;
//    public final static int TEN   = 10;
//    public final static int JACK  = 11;
//    public final static int QUEEN = 12;
//    public final static int KING  = 13;
    //suits
//    public final static int DIAMONDS = 1;
//    public final static int CLUBS    = 2;
//    public final static int HEARTS   = 3;
//    public final static int SPADES   = 4;
    //functions
//    public static String rankToString(int rank) {
//        switch (rank) {
//            case ACE:
//                return "Ace";
//            case DEUCE:
//                return "Deuce";
//            case THREE:
//                return "Three";
//            case FOUR:
//                return "Four";
//            case FIVE:
//                return "Five";
//            case SIX:
//                return "Six";
//            case SEVEN:
//                return "Seven";
//            case EIGHT:
//                return "Eight";
//            case NINE:
//                return "Nine";
//            case TEN:
//                return "Ten";
//            case JACK:
//                return "Jack";
//            case QUEEN:
//                return "Queen";
//            case KING:
//                return "King";
//            default:
//                //Handle an illegal argument.  There are generally two
//                //ways to handle invalid arguments, throwing an exception
//                //(see the section on Handling Exceptions) or return null
//                return null;
//        }
//    }
//
//    public static String suitToString(int suit) {
//        switch (suit) {
//            case DIAMONDS:
//                return "Diamonds";
//            case CLUBS:
//                return "Clubs";
//            case HEARTS:
//                return "Hearts";
//            case SPADES:
//                return "Spades";
//            default:
//                return null;
//        }
    }

