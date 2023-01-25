import java.util.Optional;

public class LambdaOptional {

    public static void main(String[] args) {

//    String s = "Inscreva-se!";
        String s = "1";

        Optional<Integer> numero = converteEmNumero(s);

        System.out.println(numero);
        System.out.println(numero.isPresent());
        System.out.println(numero.get());

        numero.ifPresent(n -> System.out.println(n));

        Integer orElse = numero.orElse(2);
        System.out.println(orElse);

        Integer orElseGet = numero.orElseGet(() -> 5);
        System.out.println(orElseGet);

        Integer orElseThrow = numero.orElseThrow(() -> new NullPointerException());
        System.out.println(orElseThrow);

    }

    public static Optional<Integer> converteEmNumero(String numeroStr) {

        try {
            Integer integer = Integer.valueOf(numeroStr);
            return Optional.of(integer);
        } catch (Exception e) {
            return Optional.empty();
        }

    }

//  public static OptionalInt converteEmNumero(String numeroStr) {
//
//    try {
//      int integer = Integer.parseInt(numeroStr);
//      return OptionalInt.of(integer);
//    } catch (Exception e) {
//      return OptionalInt.empty();
//    }
//
//  }
}
