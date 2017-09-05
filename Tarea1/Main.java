public class Main {
  
  public static void main(String[] args) {
    int rnd = java.util.concurrent.ThreadLocalRandom.current().nextInt(1, 21);
    System.out.println("Imprimiendo matriz de tamaño:"+ rnd);
            for (int i = 0; i < rnd; ++i) {
            System.out.println();
            for (int j = 0; j < rnd-i-1; ++j) {                      
                System.out.print(" ");           
            }
            for (int j = 0; j < i+1; ++j){
                System.out.print("#");
            }
        }
        System.out.println();
    }
    }