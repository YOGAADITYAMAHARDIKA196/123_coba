public class Persegi extends BangunDatar{
    protected int s;

    public Persegi(int s) {
        this.s = s;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public float luas(){
        super.luas=s*s;
        return luas;
    }

    public float keliling(){
        super.keliling=4*s;
        return keliling;
    }
}
