import java.util.Scanner;

public class Converte {
    @SuppressWarnings("resource")
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);

        //declarando as variáveis
        int totalSegs, horas, minutos, segundos, segs;

        //Entradas
        System.out.println("Informe o número total de segundos: ");
        totalSegs = sc.nextInt();

        //Processamento
        //Calculando horas como uma divisão inteira por 3600
        horas = totalSegs / 3600;

        //calculando o numero de segundos que restaram
        segs = totalSegs % 3600;

        //Calculando o numero de minutos
        minutos = segs / 60;

        //calculando com o resto da divisão anterior os segundos
        segundos = segs % 60;

        //Saida
        System.out.println(totalSegs+" segundos, Corespondem á: "+ horas +" horas "+minutos+" minutos "+segundos+" segundo(s).");

    }
}
