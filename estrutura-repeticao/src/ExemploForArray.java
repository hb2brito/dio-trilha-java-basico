public class ExemploForArray {
    public static void main(String[] args) {
        /*Estrutura de uma variavel do tipo array */
        String alunos[]={"Jeff", "Hemmilly", "Hanna", "Vini"};

        for(int x=0; x < alunos.length; x++){
            System.out.println(" O aluno do indice x= " + x + " e " + alunos[x]);
            

            for(String aluno : alunos){
                System.out.println("O nome do aluno é: "+alunos);
            }
        }
    }
    
}
