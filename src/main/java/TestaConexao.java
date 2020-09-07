public class TestaConexao {
    public static void main(String[] args) throws Exception {
        Conexao conexao = new Conexao();
        try{
            conexao.leDados();
        } catch(IllegalStateException ex){
            System.out.println("Deu erro na conexão");
            ex.printStackTrace();
        } finally {
            conexao.close();
        }
    }
}
