import java.io.*;

public class DosyaIslemleri {
    public static void main(String[] args) {
        File file = new File("javadosyaislemleri.txt");//dosya oluştur

        if (!file.exists()) {//dosya yoksa yeni dosya oluştur
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println(e.toString());
            }
        }

        FileWriter fileWriter = null; //dosya ya yazmak için
        try {
            fileWriter= new FileWriter(file);
            //fileWriter.write("asda");
            BufferedWriter bWriter = new BufferedWriter(fileWriter);
            bWriter.write("Hello World!");
            bWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        FileReader fileReader = null;//dosyadan okuma
        try {
            fileReader = new FileReader(file);
            String line;

            BufferedReader br = new BufferedReader(fileReader);

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
