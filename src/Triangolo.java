public class Triangolo extends Forma {
    private double larghezza;
    private double lunghezza;
    public Triangolo(double larghezza, double lunghezza) {
        this.larghezza = larghezza;
        this.lunghezza = lunghezza;
    }
    @Override
    public double calcolaArea() {
        return larghezza * lunghezza / 2;
    }
    @Override
    public TipoForma getTipo() {
        return TipoForma.TRIANGOLO;
    }
}
