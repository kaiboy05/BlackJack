public class Card {
    private int number = 0;
    private int suit = 0;

    public Card(int s, int n){
        number = n;
        suit = s;
    }

    public int getNum() {
        return number;
    }

    public int getSuit() {
        return suit;
    }

    public void setcard(int s, int n){
        number = n;
        suit = s;
    }

    public String toRep(){
        StringBuilder result = new StringBuilder();
        switch (suit){
            case 1:
                result.append('♠');
                break;

            case 2:
                result.append('♥');
                break;

            case 3:
                result.append('♣');
                break;

            case 4:
                result.append('♦');
                break;

            default:
                result.append('_');
        }
        if(number > 10) {
            if(number == 11) {
                result.append('J');
            }
            else if(number == 12) {
                result.append('Q');
            }
            else if(number == 13) {
                result.append('K');
            }
        }
        else if(number == 1) {
            result.append('A');
        }
        else {
            result.append(Integer.toString(number));
        }
        return result.toString();
    }
}
