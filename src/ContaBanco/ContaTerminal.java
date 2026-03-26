package ContaBanco;

import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o seu Nome: ");
        String nomeCliente = scan.nextLine();

        System.out.println("Por favor, digite a Agência: ");
        String agencia = scan.nextLine();   

        System.out.println("Por favor, digite o número da Agência: ");
        int numero = scan.nextInt();

        System.out.println("Por favor, digite o Saldo: ");
        double saldo = scan.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e o seu saldo de %.2f já está disponível para saque.%n", 
                          nomeCliente, agencia, numero, saldo);
        
        scan.close();
    }
}
