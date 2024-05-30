// Importar as classes Locale e Scanner
import java.util.Locale;
import java.util.Scanner;
/**
 * <h1>Conta Terminal</h1>
* O Conta terminal lê os dados enviados pelo usuário e exibe a mensagem de conclusão do processo de criação de conta
* <p>
* @author  Alexandre Melo
* @version 1.0
* @since   30/05/2024
 */
public class ContaTerminal {
    public static void main(String[] args) throws Exception {

// Declarar o Scanner e o Locale
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
// Pedir e ler número da conta
    System.out.println(" Digite o número da Conta:");
        int numero = scanner.nextInt(); 
//Acabar com a linha restante após a leitura do inteiro
    scanner.nextLine();
// Pedir e ler a agencia
    System.out.println(" Digite o número da agencia: ");
        String agencia = scanner.nextLine();
// Pedir e ler o nome
    System.out.println( " Digite seu nome: ");
        String nomeCliente = scanner.nextLine();
// Pedir e ler o saldo
    System.out.println(" Digite o seu Saldo:");
        Double saldo = scanner.nextDouble();
// Exibir mensagem final
    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");
// Fechar scanner
scanner.close();
    }     
}


