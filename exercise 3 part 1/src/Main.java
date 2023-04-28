public class Main {

    public static void main(String[] args) {
        int param1 = 5;
        int param2 = 6;
        int param3 = 7;
        suma(param1, param2, param3);

        var valor = suma(param1,param2,param3);

        System.out.println(valor);
    }

    public static int suma(int a, int b,int c) {
        return a + b + c;

    }
}