import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 * Classe de teste para a funcionalidade de login da TelaLogin.
 */
public class TelaLoginTeste {

    /**
     * Testa o método de login da TelaLogin com um usuário e senha válidos.
     */
    @Test
    public void loginTeste() {
        // Criar uma instância da classe TelaLogin
        TelaLogin telaLogin = new TelaLogin();

        // Testar o método login com um usuário e senha válidos
        boolean resultado = telaLogin.login("LuizObara", "Abcd1234!");

        // Verificar se o login foi bem-sucedido
        Assertions.assertTrue(resultado, "O login deve ser bem-sucedido com usuário e senha válidos.");

        // Você também pode adicionar mais testes aqui para diferentes cenários
    }
}
