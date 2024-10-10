public class TesteMultiplicacao {
    public static void main(String[] args) {

        CalculaMultiplicacao calculadora = new CalculaMultiplicacao();
        int resultado = calculadora.multiplicacao(5, 6);
        
        if (resultado == 11){
            System.out.println("Passou");
        } else {
            System.out.println("Bolete");
        }
    }
}
