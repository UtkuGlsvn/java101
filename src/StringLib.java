public class StringLib
{
    public static void main(String[] args) {
        String mystring = "utku";
        char [] mychar= {'u','t','k','u'};
        if ((mystring.charAt(0) == mychar[0])) {
            System.out.println("harfler aynı ");
        } else {
            System.out.println("harfler aynı değil ");
        }
        System.out.println(mystring.length());//uzunluk
        System.out.println(mystring.concat("glsvn"));//ekleme -> mystring+"glsvn"
        boolean result = mystring.equals("utku");//esit mi control
        System.out.println(result);
        //--------------------------------------------------------
        char[] Str1 = {'h', 'e', 'l', 'l', 'o', ',', 'w', 'o', 'r', 'l', 'd'};
        String Str2 = "";
        Str2 = Str2.copyValueOf( Str1, 0, 6 );
        System.out.println("Returned String: " + Str2);
        System.out.println(Str2.substring(3, Str2.length()));
        System.out.println(Str2.indexOf(","));// “a@hotmail.com”.indexOf(“@”) == -1 eposta kontrol vb
        //------------------------------------------------------------------------
        String myString = "Merhaba dunya";
        System.out.println("Bosluklar yok " + myString.trim());
        String[] words = myString.split(" ");
        System.out.println("İlk kısım " + words[0]);
        System.out.println("İkinci kısım " + words[1]);

        byte[] strByte = myString.getBytes();
        for(int i=0;i<strByte.length;i++)
            System.out.println("Char a cevrilmiş hali:"+strByte[i]);//ascii code
    }

}