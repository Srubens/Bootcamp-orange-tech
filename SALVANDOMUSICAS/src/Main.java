import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String arqvoDoPc = leitor.next();
        String buscar = ".mp3";
        if( arqvoDoPc.toLowerCase().contains(buscar.toLowerCase()) ){
            System.out.println("Salvar");
        }else{
            System.out.println("Deletar");
        }
    }
}
