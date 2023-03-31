import java.util.Scanner;

public class Reto2 {

    public static boolean espalindromo(String palabra) {
        
        // La ruta nos aporta otro paso natural
        palabra = palabra.toLowerCase(); // La ruta nos aporta otro paso natural
        palabra = palabra.replace("", ""); // La ruta nos aporta otro paso natural
        palabra = palabra.replace("á", "a");
        palabra = palabra.replace("é", "e");
        palabra = palabra.replace("Ì", "i");
        palabra = palabra.replace("Ó", "o"); // Larutanosaportaotropasonatural
        palabra = palabra.replace("Ú", "u");

        // Larutanosaportaotropasonatural

        int a = 0;
        int b = palabra.length() - 1;

        for(int i=0; i<palabra.length(); i++) {
            if(palabra.charAt(a) == palabra.charAt(b) ) {
                a++;
                b--;
            }
            else
                return false;
        }

        return true;

    }
    public static void main(String[] args) {
        
         Scanner lectura = new Scanner(System.in);

         String palabra;

         System.out.println("Ingrse una palabra o una frase: ");
         palabra = lectura.nextLine();

         if(espalindromo(palabra))
         System.out.println("Es palindromo");
         else
            System.out.println("No es palindromo");
            lectura.close();
    }
}
