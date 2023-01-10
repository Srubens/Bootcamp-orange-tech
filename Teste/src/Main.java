public class Main {
    public static void main(String[] args) {
        Televisao tv1 = new Televisao();
        tv1.ligar();
        tv1.setCanal(3);
        tv1.setVolume(15);
        System.out.println( tv1.toString() );
    }
}
