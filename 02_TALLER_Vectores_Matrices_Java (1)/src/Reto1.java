import java.util.Scanner;

public class Reto1 {
public static void main(String[] args) {
    try (Scanner lectura = new Scanner(System.in)) {
        int n=4, i, vidas=4;
        String oculta="beso";
        String[] palabra = new String[] { "b","e","s","o" };
        String[] letras = new String[4];
        for (i = 0; i < n; i++) {
            System.out.println("vidas actuales "+vidas);
            System.out.println(" por favor digite la letra ");
            letras[i]=lectura.next();
            if(letras[i].equals(palabra[0])){
                System.out.println(" has adivinado la letra "+palabra[0]);
            }
            else if(letras[i].equals(palabra[1])){
                System.out.println(" has adivinado la letra "+palabra[1]);
            }
            else if(letras[i].equals(palabra[2])){
                System.out.println(" has adivinado la letra "+palabra[2]);
            }
            else if(letras[i].equals(palabra[3])){
                System.out.println(" has adivinado la letra "+palabra[3]);
            }
            else if(letras[i].equals(oculta)){
                System.out.println("excelente descubriste la palabra oculta que es "+oculta);
                break;
            }
            else if(vidas==0){
                break;
            }
            else if(letras[i]!=palabra[i]){
                System.out.println("no has acertado pierdes una vida "+ (vidas --));
            } 
}
            lectura.close();
    }
    System.out.println("Gracias por jugar");
}
}