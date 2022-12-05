import java.util.Locale;
import java.util.Scanner;


class PesoNaLua {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.println("Escreva o seu peso na Terra para convertê-lo para o seu peso na Lua: ");
        
        Scanner pesoNaTerra = new Scanner(System.in);

        double seuPeso = pesoNaTerra.nextDouble();

        double coversorDePeso = 0.1770d;

        double pesoNaLua = seuPeso * coversorDePeso;


        System.out.println("Seu peso na Lua é: " + pesoNaLua + " Kg70");

        pesoNaTerra.close();


    }
}