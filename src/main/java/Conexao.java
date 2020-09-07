public class Conexao implements AutoCloseable {
    public Conexao(){
        System.out.println("Abrindo conexao");
    }

    public void leDados(){
        System.out.println("Lendo dados");
        throw new IllegalStateException();
    }

    @Override
    public void close() throws Exception {
        System.out.println("Fechando conexao");
    }
}
