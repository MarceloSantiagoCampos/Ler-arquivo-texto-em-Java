package com.lerarquivotexto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Etapa 1: Leitura simples com File e Scanner

        File file = new File("E:\\Programação\\MeusProjetos\\Ler-arquivo-texto-em-Java\\Arquivo Texto para ser Lido na Aplicação.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
        }catch (IOException error){         //FileNotFoundException pode ser utilizado aqui, pois é o erro que foi dito, IOException é mais genérico
            System.out.println(error.getMessage());
        }finally {
            if(sc != null) sc.close();      //.close() serve para fechar o scanner, para que não haja vazamento de memória na aplicação.
        }
        */

        /*Etapa 2: FileReader e BufferedReader com controle manual

        String path = "E:\\Programação\\MeusProjetos\\Ler-arquivo-texto-em-Java\\Arquivo Texto para ser Lido na Aplicação.txt";
        FileReader fr = null;
        BufferedReader br = null; //gerencia a memória usada para leitura, vai tratar a leitura de forma mais otimizada e mais rápida

        try{
            fr = new FileReader(path);
            br = new BufferedReader(fr);

            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }

        }
        catch (IOException error){
            System.out.println("Erro: " + error.getMessage());
        }
        finally {
            try {
                br.close();
                fr.close();
            }
            catch (IOException erro){
                erro.printStackTrace();     // imprime todo o stackTrace de erros (linha descrevendo o erro)
            }
        }
        */

        //Etapa 3: Usando bloco 'try with resources'
        String path = "E:\\Programação\\MeusProjetos\\Ler-arquivo-texto-em-Java\\Arquivo Texto para ser Lido na Aplicação.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            while (line != null){
                System.out.println(line);
                line = br.readLine();
            }
        }
        catch (IOException erro){
            System.out.println("Erro: " + erro.getMessage());
        }
        /* neste caso não há necessidade do finally, pois as variáveis estão no escopo do Try, portanto serão fechadas
         * automaticamente assim que sair do bloco Try.
        */




    }
}
