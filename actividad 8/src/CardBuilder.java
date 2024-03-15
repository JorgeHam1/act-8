public class CardBuilder {
    private Palo palo;
    private Color color;
    private Valor valor;

    public CardBuilder setPalo(Palo palo) {
        this.palo = palo;
        return this;
    }

    public CardBuilder setColor(Color color) {
        this.color = color;
        return this;
    }

    public CardBuilder setValor(Valor valor) {
        this.valor = valor;
        return this;
    }

    public Card createCard() {
        return new Card(palo, color, valor);
    }
}