public class Segitiga extends BangunDatar{
    protected float alas;
    protected float tinggi;

    public Segitiga(float alas, float tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;

    }

    public float getAlas() {
        return alas;
    }

    public void setAlas(float alas) {
        this.alas = alas;
    }

    public float getTinggi() {
        return tinggi;
    }

    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    public float luas(){
        super.luas = alas*tinggi/2;
        return luas;
    }


}
