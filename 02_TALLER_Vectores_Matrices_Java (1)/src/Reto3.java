import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        Scanner Lectura=new Scanner(System.in);
        String[][] M;


     M = new String[3][3];
    
    System.out.println("Reglas de uso:");
    System.out.println("ingrese El Nombre Del Producto Y El Precio  Con "+" : ");
    System.out.println();
     for (int F = 0; F < 3; F++) {
                
            for (int C = 0; C < 3; C++) {

                System.out.println("Escriba El Nombre Y El Precio Del Producto");
                M[F][C] = Lectura.next();

            }

        }
       
        for (int j = 0; j < 3; j++) {
            System.out.println(" _____________");
            System.out.print("|");
            for (int i = 0; i < 3; i++) {

                System.out.print(j+""+i+" "+M[j][i]);
                
                if (i != M[j].length - 1)
                
                    System.out.print("\t");
            }
            
            System.out.println(" | ");

        }
        System.out.println( " ______________");
        Lectura.close();
    }

}
