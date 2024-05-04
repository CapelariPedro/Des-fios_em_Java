import java.util.Scanner;

public class Problema_lanchonete {
    @SuppressWarnings("resource")
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        //Variáveis
        int qHamburguers, qBatatafrita, qCheeseburgers, qSodas;
        double hamburgers, cheeseburgers, batatas_fritas, soda, tHamburgers, tCheeseburgers, tBatata_frita, tSodas, total_pagar;

        hamburgers = 2;
        cheeseburgers = 2.5;
        batatas_fritas = 0.75;
        soda = 1;

        System.out.println("----------------------------------------");
        System.out.println("| Bem vindo a Lanchonete: sehr hungrig |");
        System.out.println("| Cardapio:                            |");
        System.out.println("| Hamburguer: 2 euros                  |");
        System.out.println("| Cheeseburger: 2.5 euros              |");
        System.out.println("| Batatas Fritas: 0.75 euros           |");
        System.out.println("| Soda: 1 euro                         |");
        System.out.println("----------------------------------------");
        //Entradas
        System.out.println("| Informe a quantidade de Hamburgers:  |");
        qHamburguers = sc.nextInt();
        System.out.println("| Informe a quantidade de Cheeseburger:|");
        qCheeseburgers = sc.nextInt();
        System.out.println("| Informe a quantidade de Batata-Frita:|");
        qBatatafrita = sc.nextInt();
        System.out.println("| Informe a quantidade de Sodas:       |");
        qSodas = sc.nextInt();
        System.out.println("|--------------------------------------|");

        tHamburgers = (qHamburguers*hamburgers);
        tCheeseburgers = (qCheeseburgers*cheeseburgers);
        tBatata_frita = (qBatatafrita*batatas_fritas);
        tSodas = (qSodas*soda);
        total_pagar = tHamburgers + tCheeseburgers + tBatata_frita + tSodas;
        
        //Saida
        System.out.println("|----------------------------------------|");
        System.out.println("  |Hamburgers: "+ tHamburgers+" euros      |");
        System.out.println("  |Cheeseburgers: "+ tCheeseburgers+" euros|");
        System.out.println("  |Batata Frita: "+ tBatata_frita +" euros |");
        System.out.println("  |Sodas: "+ tSodas+" euros                |");
        System.out.println("  |Total a pagar: "+ total_pagar+" euros   |");
        System.out.println("|----------------------------------------|");
    }
}
