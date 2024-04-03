// import static org.junit.jupiter.api.Assertions.assertEquals;

// import org.junit.jupiter.api.Test;

public class Main {
  public static void main(String[] args) {

    // winter, spring, summer, autumn
    // warm jacket, T-shirt, swimming suite, rain coat

    double temp = -10.0;

    if (temp <= 5) {
      System.out.println("Wear super warm!");
    } else if (temp <= 15) {
      System.out.println("Wear warm!");
    } else if (temp <= 30) {
      System.out.println("It a nice weather!");
    } else if (temp > 30) {
      System.out.println("It's too hot!");
    }

  }

}
