import java.util.Random;

public class Decks {
    Card[] decks;
    int deck_no;
    int card_no;


    public Decks(int n){
        decks = new Card[n * 52];
        deck_no = n;
        card_no = n * 52;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 4; j++){
                for(int k = 0; k < 13; k++){
                    decks[i * 52 + j * 13 + k] = new Card(j+1, k+1);
                }
            }
        }
    }

    public void shuffle(){
        Random rand = new Random();
        int randomNum = rand.nextInt(card_no);
        for(int i = 0; i < card_no - 1; i++){
            Card temp = decks[randomNum];
            decks[randomNum] = decks[i];
            decks[i] = temp;
            randomNum = rand.nextInt(card_no - (i + 1)) + (i + 1);
        }
    }
}
