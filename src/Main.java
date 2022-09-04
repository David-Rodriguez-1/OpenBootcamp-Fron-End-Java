public class Main {
    public static void main(String[] args) {
        suma(10, 20, 30);
        Coche miCoche = new Coche();
        miCoche.incrementarPuerta();
        System.out.println(miCoche.puertas);
    }

    public static void suma(int a, int b, int c) {
        System.out.println(a + b + c);
    }
}

class Coche {
    public int puertas = 4;
    public void incrementarPuerta() {
        this.puertas++;
    }
}