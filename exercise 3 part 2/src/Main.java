public class Main{
    public static void main  (String[] args) {
        Coche miCoche = new Coche ();
        miCoche.addpuertas();
        System.out.println(miCoche.puertas);
    }

}

class Coche {
    public int puertas = 4;

    public void addpuertas() {
        this.puertas++;
    }
}