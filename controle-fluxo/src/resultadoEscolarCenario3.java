public class resultadoEscolarCenario3 {
    public static void main(String[] args) {
        int nota=5;

       /**OBS SOBRE A FORMA DA EXPRESSÃO TENÁRIA
        * 
        *  String Resultado = nota>=7 ? "APROVADO" : "REPROVADO";
        *  System.out.println(Resultado);
        */
        String Resultado = nota>=7 ? "APROVADO" : nota>=5 && nota<7 ? "RECUPERAÇÃO" : "REPROVADO";
        System.out.println(Resultado);
    }
    
}
