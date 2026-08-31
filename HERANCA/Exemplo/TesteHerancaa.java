public class TesteHerancaa {

    public static void main(String[] args) {

        // Teste 1: Pessoa e Estudante
        Estudante estudante = new Estudante("Gustavo", 18, "4943");
        System.out.println("Nome: " + estudante.getNome());
        System.out.println("Idade: " + estudante.getIdade());
        System.out.println("Matrícula: " + estudante.getMatricula());

        System.out.println("------------------------");

        // Teste 2: Animal, Cachorro e Passaro (polimorfismo)
        Animal animal = new Animal("bicho");
        Animal cachorro = new Cachorro("don");
        Animal passaro = new Passaro("lester");

        animal.emitirSom();
        cachorro.emitirSom();
        passaro.emitirSom();
    }
}