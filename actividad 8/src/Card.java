import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Card {

    private final Palo palo;
    private final Color color;
    private final Valor valor;

    public Card(Palo palo, Color color, Valor valor) {
        this.palo = palo;
        this.color = color;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s", palo, color, valor);
    }
}


import List;

public class Deck {

    private final List<Card> cartas;

    public Deck() {
        cartas = new ArrayList<>();
        for (Palo palo : Palo.values()) {
            for (Color color : Color.values()) {
                for (Valor valor : Valor.values()) {
                    cartas.add(new Card(palo, color, valor));
                }
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cartas);
        System.out.println("Se mezcló el Deck.");
    }

    public void head() {
        Card carta = cartas.remove(0);
        System.out.printf("%s,%s,%s\nQuedan %d cartas en deck\n", carta.getPalo(), carta.getColor(), carta.getValor(), cartas.size());
    }

    public void pick() {
        int indiceAleatorio = (int) (Math.random() * cartas.size());
        Card carta = cartas.remove(indiceAleatorio);
        System.out.printf("%s,%s,%s\nQuedan %d cartas en deck\n", carta.getPalo(), carta.getColor(), carta.getValor(), cartas.size());
    }

    public void hand() {
        Card[] mano = new Card[5];
        for (int i = 0; i < 5; i++) {
            mano[i] = cartas.remove(0);
        }
        System.out.println("Mano:");
        for (Card carta : mano) {
            System.out.println(carta);
        }
        System.out.printf("Quedan %d cartas en deck\n", cartas.size());
    }

    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();
        deck.head();
        deck.pick();
        deck.hand();
    }
}
