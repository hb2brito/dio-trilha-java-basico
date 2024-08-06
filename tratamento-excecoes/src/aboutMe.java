//Conhecer e importar a class Scanner
import java.util.Locale;
import java.util.Scanner;

public class aboutMe {
    public static void main(String[] args) throws Exception {
        //Exibir mensagem para nosso usuario
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        //Obter pelo Scanner os valores digitados no terminal
        System.out.println("Digite seu nome: ");
        String nome= scanner.next();

        System.out.println("Digite seu sobre nome: ");
        String sobreNome= scanner.next();

        System.out.println("Digite sua idade: ");
        int idade= scanner.nextInt();

        System.out.println("Digite sua altura: ");
        Double altura= scanner.nextDouble();

       



        //Exibir a mensagem conta criada        
        System.out.println("Olá, me chamo " + nome.toUpperCase() +  sobreNome);
        System.out.println("Minha idade é "+idade);
        System.out.println("Minha altura é "+altura);
    }
    
}



