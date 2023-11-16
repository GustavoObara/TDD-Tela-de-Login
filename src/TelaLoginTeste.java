import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

public class TelaLoginTeste {
    @Test
    public void loginTeste() {
        TelaLogin telaLogin = new TelaLogin();
        Assertions.assertTrue(telaLogin.login("LuizObara","Abcd1234!"));
    }
}