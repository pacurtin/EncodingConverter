import java.io.*;

public class Main {
    public static void main(String[] args) {
        final String FILE_NAME = ".\\InputUTF8.txt";

        try {
            File file = new File(FILE_NAME);
            FileInputStream fis = new FileInputStream(file);
            InputStreamReader isr = new InputStreamReader(fis,"UTF-8");

            Reader in = new BufferedReader(isr);
            StringBuffer buffer = new StringBuffer();

            int ch;
            while ((ch = in.read()) > -1) {
                buffer.append((char)ch);
            }
            in.close();


            FileOutputStream fos = new FileOutputStream("Output.txt");
            Writer out = new OutputStreamWriter(fos, "ISO-8859-1");
            out.write(buffer.toString());
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
