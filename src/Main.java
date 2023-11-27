// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Forma rettangolo = new Rettangolo(2,3);
        System.out.println("Area rettangolo: " + rettangolo.calcolaArea());
        System.out.println("Tipo: " + rettangolo.getTipo());

        Forma triangolo = new Triangolo(4,5);
        System.out.println("Area triangolo: " + triangolo.calcolaArea());
        System.out.println("Tipo: " + triangolo.getTipo());
    }
}