public class registrazioneAudio extends elementoMultimediale implements playerMultimediale{
    private int volume;
    public registrazioneAudio(String titolo,int durata, int volume) {
        super(titolo, durata);
        this.volume = volume;
    }

    @Override
    public void play() {
        for (int i = 0; i < durata; i++) {
            for (int j = 0; j < volume; j++){
                System.out.println("!");
            }
            System.out.println(" " + titolo);
        }
    }

    public void abbassaVolume(){
        if (volume > 0){
            volume--;
        }

    }

    public void alzaVolume(){
        volume++;
    }

}
