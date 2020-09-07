public class FluxoComTratamento {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();

        }catch (ArithmeticException  | NullPointerException | MinhaExcessao error){
            System.out.println(error.getMessage());
            error.printStackTrace();
        }
    }

    private static void metodo1() throws MinhaExcessao{
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcessao{
        System.out.println("Ini do metodo2");
        throw new MinhaExcessao("Deu ruim");
    }
}

