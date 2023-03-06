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
    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return primeiroNome.concat(" ").concat(segundoNome);
    }

}
