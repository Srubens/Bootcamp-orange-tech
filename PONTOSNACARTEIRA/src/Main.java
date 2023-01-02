import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int velocidade = leitor.nextInt();
        int multas = leitor.nextInt();
        if( velocidade > 80 ){
            multas += 1;
        }

        if( multas >= 3 ){
            System.out.printf("%d multas. Levou pontos na carteira ", multas);
        }else{
            System.out.printf("%d multas. Nao levou pontos na carteira ", multas);
        }
        /*if( velocidade > 80 ){
            result = multas + 1;
            if( result >= 3 ){
                System.out.printf("%d multas. Levou pontos na carteira ", result);
            }else{
                System.out.printf("%d multas. Nao levou pontos na carteira ", result);
            }
        }*/

    }
}
