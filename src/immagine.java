public class immagine extends elementoMultimediale {
    private int luminosita;
    public immagine(String titolo, int luminosita) {
        super(titolo, 0);
        this.luminosita = luminosita;
    }

    public void aumentaLuminosita(){
        luminosita++;
    }

    public void abbassaLuminosita(){
        if(luminosita > 0){
            luminosita--;
        }
    }

    public void show(){
        for (int i = 0; i < luminosita; i++){
            System.out.println("*");
        }
        //System.out.println(" " + titolo);
    }
}
