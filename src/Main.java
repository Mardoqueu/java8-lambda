public class Main {
    public static void main(String[] args) {

        //Java 8: Funções LAMBDA

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello world");
            }
        }).run();

        new Thread(() -> System.out.println("Hello world")).run();
    }
}