public class Usuario {
    public boolean validarsenha(String senha){
        return senha.length() >= 8 && senha.matches(".*\\d.") && senha.matches(".*[A-Z].*");
    }
}
