public class PersegiPanjang extends BangunDatar{
    protected float p,l;

    public PersegiPanjang(float p, float l) {
        this.p = p;
        this.l = l;
    }

    public float getP() {
        return p;
    }

    public void setP(float p) {
        this.p = p;
    }

    public float getL() {
        return l;
    }

    public void setL(float l) {
        this.l = l;
    }

    public float luas (){
        super.luas=p*l;
        return luas;
    }

    public float keliling (){
        super.keliling=2*(p+l);
        return keliling;
    }
}
