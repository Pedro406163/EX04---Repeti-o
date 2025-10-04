import java.util.Scanner;

public class ContarVogais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine();

        int contador = 0;
        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if ("aeiouAEIOU".indexOf(letra) != -1) {
                contador++;
            }
        }

        System.out.println("Número de vogais na palavra: " + contador);
        sc.close();
    }
}