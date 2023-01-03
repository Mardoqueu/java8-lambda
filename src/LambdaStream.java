import java.util.Arrays;
import java.util.List;

public class LambdaStream {

    public static void main(String[] args) {
        // JAVA 8 : Funções LAMBDA

        // API DE STREAM

        //stream - flux de dados

        //Java 7
        List<Integer> asList = Arrays.asList(1, 2, 3, 4);

        for (Integer integer : asList){
            System.out.println(integer);
        }

        // JAVA 8
        List<Integer> asList8 = Arrays.asList(1, 2, 3, 4);
        asList8.stream()
                .filter(e -> e % 2 == 0)
                .forEach(e -> System.out.println(e));
    }
}
