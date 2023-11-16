public class TelaLogin {
    private String login = "LuizObara";
    private String senha = "Abcd1234!";

    public boolean login(String usuarioDigitado, String senhaDigitada) {
        return login.equals(usuarioDigitado) && senha.equals(senhaDigitada);
    }
}
