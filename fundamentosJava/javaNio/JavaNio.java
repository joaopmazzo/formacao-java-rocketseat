package fundamentosJava.javaNio;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class JavaNio {
    public static void main(String[] args){
        try {
            Path path = Paths.get("fundamentosJava/javaNio/files/leitura-escrita.txt");

            // Lendo o path e convertendo em bytes
            byte[] bytesArquivo = Files.readAllBytes(path);

            // criando uma string a partir dos bytes
            String conteudo = new String(bytesArquivo);
            System.out.println(conteudo);

            // Escrevendo um alinha no arquivo
            String conteudoAEscrever = "\r\nLinha 2: teste para colocar cada linha em um index de uma lista";
            Files.write(path, conteudoAEscrever.getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);

            // criando uma lista a partir do arquivo
            List<String> conteudoPorLinha = Files.readAllLines(path);
            System.out.println(conteudoPorLinha);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}