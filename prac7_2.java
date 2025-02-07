import java.util.ArrayList;
import java.util.Collections;

class Card 
{
    private final String suit;
    private final String rank;

    public Card(String suit, String rank) 
    {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() 
    {
        return rank + " of " + suit;
    }
}

class Deck 
{
    private final ArrayList<Card> cards;

    public Deck() 
    {
        this.cards = new ArrayList<>();
        createDeck();
    }

    private void createDeck() 
    {
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };
        String[] ranks = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
        for (String suit : suits) 
        {
            for (String rank : ranks) 
            {
                cards.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle() 
    {
        Collections.shuffle(cards);
    }

    public void displayCards() 
    {
        for (int i = 0; i < cards.size(); i++) 
        {
            System.out.println((i + 1) + ". " + cards.get(i));
        }
    }

    public int getDeckSize() 
    {
        return cards.size();
    }
}

public class prac7_2 
{
    public static void main(String[] args) 
    {
        Deck deck = new Deck();
        System.out.println("Initial deck size: " + deck.getDeckSize());
        System.out.println("Before shuffling:");
        deck.displayCards();
        deck.shuffle();
        System.out.println("\nAfter shuffling:");
        deck.displayCards();
    }
}