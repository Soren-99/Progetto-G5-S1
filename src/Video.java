public class Video extends elementoMultimediale implements playerMultimediale{
    private int volume;
    private int luminosita;
    public Video(String titolo, int durata, int volume, int luminosita) {
        super(titolo, durata);
        this.volume = volume;
        this.luminosita = luminosita;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++){
            for (int j = 0; j < volume; j++){
                System.out.println("!");
            }
            for (int k = 0; k < luminosita; k++){
                System.out.println("*");
            }
            //System.out.println(" " + titolo);
        }

    }

    public void aumentaLuminosita(){
        luminosita++;
    }
    public void abbassaLuminosita(){
        if (luminosita > 0){
            luminosita--;
        }
    }

    @Override
    public void show() {

    }
}
