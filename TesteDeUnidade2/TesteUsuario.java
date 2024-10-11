public class TesteUsuario {
    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        if (usuario.validarsenha("Senha123")) {
            System.out.println("Teste 1 passou!");
        } else {
            System.out.println("Teste falhou");
        }

    }
}
