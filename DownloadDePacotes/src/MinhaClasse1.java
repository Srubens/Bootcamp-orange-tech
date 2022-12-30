public class MinhaClasse1 {

    public static void main(String[] args) {
        String primeiroNome = "Aline";
        String segundoNome = "Machado";

        String nomeCompleto;
        nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome + " " + segundoNome;
    }

}
