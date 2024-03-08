abstract class elementoMultimediale {
    protected String titolo;
    protected int durata;
    public elementoMultimediale(String titolo, int durata){
        this.titolo = titolo;
        this.durata = durata;
    }

    public int getDurata(){
        return durata;
    }

    public abstract void show();


}
