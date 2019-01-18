public class Main {
    public static void main(String[] args){
        Card a = new Card(2, 12);
        System.out.println(a.toRep());
        Decks b = new Decks(2);
        for(int i = 0; i < 52*2; i++){
            System.out.println(b.decks[i].toRep());
        }
        b.shuffle();
        System.out.println();
        for(int i = 0; i < 52*2; i++){
            System.out.println(b.decks[i].toRep());
        }

    }
}
