import java.util.Scanner;

public class Pitagoras {
    @SuppressWarnings("resource")
    public static void main(String arg[]){

        Scanner sc = new Scanner(System.in);

        //declarando váriaveis:
        double cateto1, cateto2, hipotenusa;
        

        //Entrada de dados:
        System.out.println("Valor do primeiro cateto: ");
        cateto1 = sc.nextDouble();

        System.out.println("Valor do seegundo cateto: ");
        cateto2 = sc.nextDouble();
        
        //Processamento:

        hipotenusa = Math.sqrt(cateto1*cateto1+cateto2*cateto2);

        //Saida
        System.out.print("Hipotenusa = " + hipotenusa);
    }
}
