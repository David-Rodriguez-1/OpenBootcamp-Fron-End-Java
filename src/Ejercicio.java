
public class Ejercicio {
    public static void main(String[] args) {
        var numeroIf = -5;
        if (numeroIf >= 0) {
            System.out.println("Es positivo");
        }else if (numeroIf < 0){
            System.out.println("Es negativo");
        }
        int numero_While = 0;
        while (numero_While < 3) {
            System.out.println(numero_While);
            numero_While++;
    }
        int numero = 5;
        do {
            System.out.println(numero);
            numero = numero + 1;
        }while (numero < 5);


        for (var numeroFor = 0; numeroFor <= 3; numeroFor++) {
            System.out.println(numeroFor);
        }

        String estacion = "INVIERNO";
        switch (estacion) {
            case "VERANO":
                System.out.println("Verano");
                break;
            case "OTOÑO":
                System.out.println("Otoño");
                break;
            case "INVIERNO":
                System.out.println("Invierno");
                break;
            case "PRIMAVERA":
                System.out.println("Primavera");
                break;
            default:
                System.out.println("No es una estación válida");


        }

    }
}