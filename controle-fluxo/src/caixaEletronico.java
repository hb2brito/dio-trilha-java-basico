//Condiciona Simples
public class caixaEletronico{
    /**
     * atributos saldos e valor solicitado
     * @param args
     */
    public static void main (String[]args){
        double saldo = 475.0;
        double valorSolicitar = 17.0;

        if (valorSolicitar < saldo) {
            saldo = saldo - valorSolicitar;
            System.out.println( saldo );
        }

    }
}