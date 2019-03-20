import java.util.Scanner;

public class Calc {

    static Scanner input=new Scanner(System.in);//kullanıcıdan değer almak için scanner tanımladık
    static int dizi[] ;
    static void islem(int secim)
    {
        switch (secim)
        {
            case 1: topla(); break;
            case 2: cıkar();break;
            case 3: bol();break;
            case 4: carp();break;
            default: System.out.println("İslem tanimlanamadi");break;
        }

    }
    static void topla()
    {
        int sonuc =0;
        for (int i=0; i<dizi.length;i++)
            sonuc+=dizi[i];
        System.out.println("Toplam degerlerin toplamı:"+sonuc);
    }

    static void cıkar()
    {
        int sonuc=dizi[0];
        for (int i=1; i<dizi.length;i++)
            sonuc-=dizi[i];
        System.out.println("Toplam degerlerin cıkarımı :"+sonuc);
    }

    static void carp()
    {
        int sonuc=dizi[0];
        for (int i=1; i<dizi.length;i++)
            sonuc*=dizi[i];
        System.out.println("Toplam degerlerin carpımı:"+sonuc);
    }

    static void bol()
    {
        double sonuc=dizi[0];
        for (int i=1; i<dizi.length;i++)
            sonuc/=dizi[i];
        System.out.println("Toplam degerlerin bolumu :"+sonuc);
    }

    public static void main(String[] args) {
        System.out.println("Kaç adet sayi ile islem yapilmasini istiyorsunuz:");
        try {
            int n = input.nextInt();
            dizi = new int[n];
            for (int i = 1; i <= n; i++) {
                System.out.println(i + ".Sayiyi giriniz:");

                dizi[i - 1] = input.nextInt();
            }


        System.out.println("Toplama işlemi yapmak için 1 \n Çıkarma işlemi yapmak için 2 \n Bölme işlemi yapmak için 3 \n" +
                " Çarpma işlemi için 4 ' u seciniz");
        int secim = input.nextInt();
        islem(secim);
    }
    catch(Exception e)
    {
        System.out.println(e);
    }

    }

}
