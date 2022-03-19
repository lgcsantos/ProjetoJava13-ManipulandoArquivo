package br.com.comandosimples;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
      //  System.out.println("Working Directory: " + System.getProperty("user.dir"));

        File file = new File("src/br/com/comandosimples/arquivo.txt");
        InputStream is = new FileInputStream(file);
        InputStreamReader isr = new InputStreamReader(is);
        BufferedReader br = new BufferedReader(isr);

        String line = br.readLine();

        while (line != null){
            System.out.println(line);
            line = br.readLine();
        }
    }
}
