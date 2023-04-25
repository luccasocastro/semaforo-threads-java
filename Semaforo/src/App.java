public class App {
    
    public static void main(String[] args) {

        ThreadSemaforo semaforo = new ThreadSemaforo();

        for(int i=0; i<50; i++){
            System.out.println(semaforo.getCor());
            semaforo.esperaCorMudar();
        }

        semaforo.desligarSemaforo();
        
    }
}
