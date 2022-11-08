import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        float pjg,lbr,a,t;
        int ss;
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan sisi persegi : ");
        ss = in.nextInt();
        System.out.print("Masukkan panjang persegi panjang: ");
        pjg = in.nextFloat();
        System.out.print("Masukkan lebar persegi panjang : ");
        lbr = in.nextFloat();
        System.out.print("Masukkan alas segitiga : ");
        a = in.nextFloat();
        System.out.print("Masukkan tinggi segitiga : ");
        t = in.nextFloat();

        Segitiga sgt = new Segitiga(a,t);
        Persegi psg = new Persegi(ss);
        PersegiPanjang pp = new PersegiPanjang(pjg,lbr);

        System.out.println("Luas Persegi : "+psg.luas()+" cm2");
        System.out.println("Keliling Persegi : "+psg.keliling()+" cm.");
        System.out.println("Luas Persegi Panjang : "+pp.luas()+" cm2");
        System.out.println("Keliling Persegi Panjang : "+pp.keliling()+" cm.");
        System.out.println("Luas Segitiga : "+sgt.luas()+" cm2");
    }
}