import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int tamanho = scan.nextInt();
        for( int i = 0; i < tamanho; i++ ){
            String myReplace = Integer.toString(i);
            System.out.printf(myReplace.replace(Integer.toString(i),"/"));
        }
    }
}
