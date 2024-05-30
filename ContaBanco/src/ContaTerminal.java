import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

System.out.println(" Digite o número da Conta:");
int numero = scanner.nextInt(); 

System.out.println(" Digite o número da agencia: ");
String agencia = scanner.next();

System.out.println( " Digite seu nome: ");
String nomeCliente = scanner.next();

System.out.println( " Digite seu sobrenome: ");
String sobrenomeCliente = scanner.next();


System.out.println(" Digite o seu Saldo:");
Double saldo = scanner.nextDouble();

System.out.println("Olá " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua agencia é " + agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");
    }

        
    }


