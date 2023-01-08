import java.util.Arrays;
import java.util.List;

public class Java8Streams {

    public static void main(String[] args) {
        List<Integer> lista = Arrays.asList(1, 2, 5, 8, 9, 1, 4, 7, 6, 7, 9, 9);
        
        //JAVA 5
/*        for (Integer integer : lista) {
            System.out.println(integer);
        }*/

        //JAVA 8
        //Stream = flux de dados
        lista.stream()
                // operações intermediarias
               /* .skip(2)  // Retorna um fluxo que consiste nos elementos restantes desse fluxo após descartar os primeiros n elementos do fluxo.
                .limit(2) // Retorna um fluxo que consiste nos elementos deste fluxo, truncado para não ter mais do que maxSize de comprimento.*/
               // .distinct() // Para fluxos ordenados, a seleção de elementos distintos é estável (para elementos duplicados, o elemento que aparece primeiro na ordem de encontro é preservado) usando equals e hashcode
                //.filter(e -> e % 2 == 0) // Retorna um fluxo que consiste nos elementos desse fluxo que correspondem ao predicado fornecido.
                .map(e -> e * 2) // Retorna um fluxo que consiste nos resultados da aplicação da função fornecida aos elementos desse fluxo. A lista original não é alterada
                .forEach(e -> System.out.println(e));
    }
}
