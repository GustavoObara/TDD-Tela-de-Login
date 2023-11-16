/**
 * Representa a tela de login da aplicação.
 */
public class TelaLogin {

    /**
     * Nome de usuário permitido para login.
     */
    private String login = "LuizObara";

    /**
     * Senha permitida para login.
     */
    private String senha = "Abcd1234!";

    /**
     * Método para autenticar um usuário com base no nome de usuário e senha fornecidos.
     *
     * @param usuarioDigitado Nome de usuário digitado pelo usuário.
     * @param senhaDigitada   Senha digitada pelo usuário.
     * @return true se o nome de usuário e a senha correspondem aos permitidos, false caso contrário.
     */
    public boolean login(String usuarioDigitado, String senhaDigitada) {
        return login.equals(usuarioDigitado) && senha.equals(senhaDigitada);
    }
}
