package br.com.comandosimples;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        

        File file = new File("src/br/com/comandosimples/arquivo.txt");
        InputStream is = new FileInputStream(file); // bytes
        InputStreamReader isr = new InputStreamReader(is); // char
        BufferedReader br = new BufferedReader(isr);  // String

        String line = br.readLine();

        while (line != null){
            System.out.println(line);
            line = br.readLine();
        }
    }
}
