public class TesteHeranca {
    public static void main(String[] args){
        AnimalHeranca animal = new AnimalHeranca("salem");
        CachorroHeranca cachorro = new CachorroHeranca("don");



        animal.emitirSom();
        cachorro.emitirSom();


    }
}
