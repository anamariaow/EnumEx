public class Rettangolo extends Forma {
    private double larghezza;
    private double lunghezza;
    public Rettangolo(double larghezza, double lunghezza) {
        this.larghezza = larghezza;
        this.lunghezza = lunghezza;
    }


    @Override
    public double calcolaArea() {
        return larghezza * lunghezza;
    }

    @Override
    public TipoForma getTipo() {
        return TipoForma.RETTANGOLO;
    }
}
