package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintWriter;

public class TesteEscrita3 {

    public static void main(String[] args) throws IOException {

//    	OutputStream fos = new FileOutputStream("AulaJava2.txt");
//        Writer osw = new OutputStreamWriter(fos);
//        BufferedWriter bw = new BufferedWriter(osw);
    	
//    	FileWriter fw = new FileWriter("AulaJava2.txt");
//    	BufferedWriter bw = new BufferedWriter(fw);
    	
    	PrintWriter ps = new PrintWriter("AulaJava2.txt");
    	
        ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
        ps.println();
        ps.println();
        ps.println("tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam");

        ps.close();
    }

}