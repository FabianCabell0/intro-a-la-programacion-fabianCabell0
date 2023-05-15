public class Main {

    public static void main(String[] args) {

        public static void main(String[] args) {
            int  numeroIF = -3;
            if (numeroIF >= 1) {
                System.out.println("Es Positivo");
            }
            else if (numeroIF == 0){
                System.out.println("Es Cero");
            }
            else {
                System.out.println("Es Negativo");
            }

            int  numeroWhile= -2;
            while (numeroWhile < 3) {
                numeroWhile++;
                System.out.println(numeroWhile);
            }

            int  numeroWhileDO= 2;
            do {
                System.out.println(numeroWhileDO);
                numeroWhileDO++;
            }while (numeroWhileDO < 3);

            for (int numeroFor = 0; numeroFor <= 3; numeroFor++) {
                System.out.println(numeroFor);
            }

            String estacion = "verano";

            switch (estacion) {
                case "primavera":
                    System.out.println("Estamos en primavera.");
                    break;
                case "verano":
                    System.out.println("Estamos en verano.");
                    break;
                case "otoño":
                    System.out.println("Estamos en otoño.");
                    break;
                case "invierno":
                    System.out.println("Estamos en invierno.");
                    break;
                default:
                    System.out.println("La variable estacion no es una estación válida.");
                    break;
            }
        }
    }
    //separar cada pedazo de codigo no corre todo junto