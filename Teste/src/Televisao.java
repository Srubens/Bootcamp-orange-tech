public class Televisao {
    public boolean ligada = false;
    public int canal = 1;
    public int volume = 10;

    public boolean ligar(){
        return this.ligada = true;
    }

    public boolean desligar(){
        return this.ligada = false;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Televisao{" +
                "ligada=" + ligada +
                ", canal=" + canal +
                ", volume=" + volume +
                '}';
    }
}
