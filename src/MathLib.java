import java.util.Arrays;

public class MathLib {

    public static void main(String[] args) {
    int [] dizi = {5,7,8,9,15,-5,-9,0,21,-5};
    System.out.println(Arrays.toString(dizi));
    int max=0;
    int min=0;
    for (int i =0; i<dizi.length-1;i++)
    {
        max= Math.max(dizi[i],dizi[i+1]);
        min= Math.min(dizi[i],dizi[i+1]);
        dizi[i]= Math.abs(dizi[i]);
    }

        Arrays.sort(dizi);
        System.out.println(Arrays.toString(dizi));

        System.out.println("Max - Min");
        System.out.println(max);
        System.out.println(min);
        System.out.println("---------------------------------------");
        System.out.println(Math.sqrt(25));//karakök
        //System.out.println(Math.pow(5,2));//üst
        System.out.println("----------------------------------------");
        System.out.println("5 yarıçaplı dairenin alan hesabı:");
        System.out.println(Math.pow(5,2)*Math.PI);

    }
}
