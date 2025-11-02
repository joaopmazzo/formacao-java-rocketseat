package fundamentosJava.javaNio;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class SistemaCadastro {
    public static void main(String[] args) {
        List<Cadastro> cadastros = new ArrayList<>();
        cadastros.add(new Cadastro("João",
                "M",
                14982300801L,
                LocalDate.of(2024, 7, 4),
                6000D,
                false));
        cadastros.add(new Cadastro("Paulo",
                "M",
                14981155454L,
                LocalDate.of(1965, 2, 5),
                6000D,
                false));

        escreverLayoutDelimitado(cadastros);
        lerLayoutDelimitado();

        escreverLayoutPosicional(cadastros);
        lerLayoutPosicional();
    }

    public static void escreverLayoutDelimitado(List<Cadastro> cadastros) {
        System.out.println("***** - LAYOUT DELIMITADO - *****");

        try {
            StringBuilder conteudo = new StringBuilder();

            for (Cadastro cadastro : cadastros) {
                conteudo.append(cadastro.getNome()).append(";");
                conteudo.append(cadastro.getSexo()).append(";");
                conteudo.append(cadastro.getTelefone()).append(";");
                conteudo.append(cadastro.getDataNascimento()).append(";");
                conteudo.append(cadastro.getValorSugerido()).append(";");
                conteudo.append(cadastro.isCliente());
                conteudo.append(System.lineSeparator());
            }

            System.out.println(conteudo);
            Path arquivoDestino = Paths.get("fundamentosJava/javaNio/files/layout-delimitado.txt");
            Files.writeString(arquivoDestino, conteudo.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static List<Cadastro> lerLayoutDelimitado() {
        List<Cadastro> cadastros = new ArrayList<>();
        try {
            Path arquivoOrigem = Paths.get("fundamentosJava/javaNio/files/layout-delimitado.txt");
            List<String> linhas = Files.readAllLines(arquivoOrigem);
            // imprimindo cada linha obtida no arquivo

            for (String linha : linhas) {
                String[] colunas = linha.split("\\;"); // -> quebra uma linha em colunas
                String nome = colunas[0];
                String sexo = colunas[1];
                Long telefone = Long.valueOf(colunas[2]);
                LocalDate dataAniversario = LocalDate.parse(colunas[3]);
                Double valorSugerido = Double.valueOf(colunas[4]);
                boolean cliente = Boolean.parseBoolean(colunas[5]);

                //criando um novo cadastro e adicionando na lista de acordo com os v
                cadastros.add(new Cadastro(nome,
                        sexo,
                        telefone,
                        dataAniversario,
                        valorSugerido,
                        cliente));
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        // ao retornar a lista de objetos
        // você poderá realizar qualquer ação com a lista retornada
        return cadastros;
    }

    public static void escreverLayoutPosicional(List<Cadastro> cadastros) {
        try {
            System.out.println("***** - LAYOUT POSICIONAL - *****");

            StringBuilder conteudo = new StringBuilder();
            for (Cadastro cadastro : cadastros) {
                String nome = cadastro.getNome();

                // calma, não será assim para sempre
                if (nome.length() > 30)
                    nome = nome.substring(0, 30);

                // pesquise sobre String.format
                if (nome.length() < 30)
                    nome = String.format("%-30s", nome);
                conteudo.append(nome);
                conteudo.append(cadastro.getSexo().toUpperCase());
                conteudo.append(cadastro.getTelefone());
                conteudo.append(cadastro.getDataNascimento());

                DecimalFormat decimalFormat = new DecimalFormat("#0000.00");
                String valorFormatado = decimalFormat.format(cadastro.getValorSugerido());
                conteudo.append(valorFormatado.replaceAll("\\,", "\\."));

                conteudo.append(cadastro.isCliente() ? "1" : "0");

                // nova linha
                conteudo.append(System.lineSeparator());
            }
            System.out.println(conteudo.toString());

            Path arquivoDestino = Paths.get("fundamentosJava/javaNio/files/layout-posicional.txt");

            Files.writeString(arquivoDestino, conteudo.toString());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static List<Cadastro> lerLayoutPosicional(){
        List<Cadastro> cadastros = new ArrayList<>();

        try {
            Path arquivoOrigem = Paths.get("fundamentosJava/javaNio/files/layout-posicional.txt");

            List<String> linhas = Files.readAllLines(arquivoOrigem);
            // imprimindo cada linha obtida no arquivo
            for(String linha:linhas){
                String nome = linha.substring(0,30).trim();
                String sexo = linha.substring(30,31);
                Long telefone = Long.valueOf(linha.substring(31,42));
                LocalDate dataAniversario = LocalDate.parse(linha.substring(42,52));
                Double valorSugerido = Double.valueOf(linha.substring(52,59));
                boolean cliente = linha.charAt(59) == '1';

                //criando um novo cadastro e adicionando na lista de acordo com os v
                cadastros.add(new Cadastro(nome,
                                           sexo,
                                           telefone,
                                           dataAniversario,
                                           valorSugerido,
                                           cliente));
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }

        // ao retornar a lista de objetos
        // você poderá realizar qualquer ação com a lista retornada

        return cadastros;
    }

}