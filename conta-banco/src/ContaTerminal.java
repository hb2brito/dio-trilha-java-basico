//Conhecer e importar a class Scanner
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Exibir mensagem para nosso usuario
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Obter pelo Scanner os valores digitados no terminal
        System.out.println("Digite o numero da sua conta: ");
        int numero= scanner.nextInt();

        System.out.println("Digite o numero da sua Agência: ");
        String agencia= scanner.next();

        System.out.println("Digite seu nome: ");
        String nomeCliente= scanner.next();

        System.out.println("Diga o seu saque: ");
        double saldo= scanner.nextDouble();



        //Exibir a mensagem conta criada        
        System.out.println("Olá " +nomeCliente+ " ,obrigado por criar uma conta nesse banco. ");
        System.out.println("Sua Agência é " +agencia+ ", e sua conta é " +numero+ " e seu saque de " +saldo+ " .Já está disponivel para saque. Obrigado pela preferência.");
      
    }
}
