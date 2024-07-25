import java.util.Locale;
import java.util.Scanner;


public class resultadoEscolarCenario2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o nome do aluno: ");
        String nome= scanner.next();
        

        System.out.println("Digite a nota do aluno: ");
        int nota = scanner.nextInt();

        if (nota >= 7) {
            System.out.println("Parabens" +nome+ " você foi APROVADO");
            
        }
        else if (nota >=5 && nota <7) {
            System.out.println( "Olá, " +nome+ " você não se saio muito mal. Você estar  de RECUPERAÇÃO");
            
        }
        else
            System.out.println( "Olá, " +nome+ " você estar REPROVADO");
    
    }
    
}
