import java.util.Locale;
import java.util.Scanner;

public class sistemaMedida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o Codigo de Medida: P M G");
        String sigla= scanner.next()
        
        ;

        if (sigla == "p") {
            System.out.println("PEQUENO");
            
        }
        else if(sigla == "M"){
            System.out.println("MEDIO");
        }
        else if(sigla=="G"){
            System.out.println("GRANDE");
        }
        else
            System.out.println("INDEFINIDO");
            
        
    }
    
}
