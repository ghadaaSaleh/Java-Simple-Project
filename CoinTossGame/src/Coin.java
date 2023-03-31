import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Coin {
    List<String> CoinSides = Arrays.asList(Constants.TAIL, Constants.HEAD);
    public String side;
    public void flip()
    {
            Random rand = new Random();
            side = CoinSides.get(rand.nextInt(CoinSides.size()));
            System.out.println(side);
    }
}
