public class MinhaClasse {
    public static void main(String[] args) {
        System.out.print("ola pessoal");

        // Final bloqueia a var -------
        final String BR = "Brasil";
        //BR = "Brazil"; ~nao da~

        // Var pode ter letra, num de 0 a 9 e _ $
        // Nome da var n pode começar com número
        //ex:
        // int 1numero

        String primeiroNome = "Felipe";
        String segundoNome = "Fantato";

        String nomecompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomecompleto);
        int numero = 3;
        qualNumero(numero);


    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

    private static void qualNumero(int numero){
        switch (numero) {
            case 1:
            case 2:
            case 3:
                System.out.println("Numero entre 1 a 3");
                break;
            case 4:
                System.out.println("numero 4");
                break;
                
            default:
                System.out.println("Valor indefinido!");
                break;
        }
    }
}
