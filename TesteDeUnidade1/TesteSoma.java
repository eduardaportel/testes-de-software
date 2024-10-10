public class TesteSoma {
    public static void main(String[] args) {
        CalculaSoma calculadora = new CalculaSoma();
        int resultado = calculadora.soma(3, 4);
        if (resultado == 7){
            System.out.println("Teste Passou!");
        } else {
            System.out.println("Errou, o resultado esperado era 7.");
        }
    }
}   
