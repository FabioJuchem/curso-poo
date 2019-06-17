package br.com.db1.alura.recursosLinguagem;


import java.sql.SQLOutput;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OrdenaStrings {

    public static void main(String[] args) {


        OrdenaStrings ordem = new OrdenaStrings();
        List<String> lista = new ArrayList<>();
        List<Integer> listaNum = new ArrayList<>();

        lista.add("Alura");
        lista.add("Alura cursos");
        lista.add("Alura cursos de java");
        lista.add("Pa java8");

        listaNum.add(1);
        listaNum.add(2);
        listaNum.add(3);
        listaNum.add(4);

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalDate olimpiadasRio = LocalDate.of(2020, Month.JUNE, 5);

        int anos = olimpiadasRio.getYear() - hoje.getYear();
        System.out.println(anos);

        Period periodo = Period.between(hoje , olimpiadasRio);
        System.out.println(periodo.getDays());

        LocalDate prox = olimpiadasRio.plusYears(4);

        System.out.println(prox);

        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatadorComHoras = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm");

        String valorFormatado = prox.format(formatador);
        System.out.println(valorFormatado);

        LocalDateTime agora = LocalDateTime.now();
        System.out.println(agora.format(formatadorComHoras));

        LocalTime interval = LocalTime.of(15,30);
        System.out.println(interval);

        LocalDate agora1 = LocalDate.now();
        LocalDate dataFutura = LocalDate.of(2099, Month.JANUARY, 25);

        Period periodo1 = Period.between(agora1, dataFutura);

        System.out.println(periodo1.getDays()+ "  dias  //  "+ periodo1.getMonths()+ "  meses  //  " + periodo1.getYears()+"  anos   ");

        System.out.println(ordem.dividirPalavrasMap(lista));

        List<Integer> result =  new ArrayList<>();
        System.out.println(listaNum);

        System.out.println(ordem.retornarPares(listaNum));
        System.out.println(ordem.retornarImpares(listaNum));




    }
    public Map<String, List<String>> dividirPalavrasMap(List<String> nomes) {
        Map<String, List<String>> retorno = new HashMap<>();
        Collections.sort(nomes);

        for (String value : nomes) {
            String letra = value.substring(0, 1);if (!retorno.containsKey(letra)) {
                retorno.put(letra, new ArrayList<String>());
            }retorno.get(letra).add(value);
        }
        return retorno;
    }
    public List<Integer> retornarPares(List<Integer> numeros){
        List<Integer> list = new ArrayList<>();
        numeros.stream().filter(n -> n % 2 == 0).forEach(s -> list.add(s));
        return list;
    }
    public List<Integer> retornarImpares(List<Integer> numeros){
        List<Integer> list = new ArrayList<>();
        numeros.stream().filter(n -> n % 2 != 0).forEach(s -> list.add(s));
        return list;
    }

}
