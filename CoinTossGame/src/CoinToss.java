public class CoinToss {

    public boolean IsValidGuess(String guess)
    {
      if( guess.toLowerCase().equals(Constants.TAIL)||guess.toLowerCase().equals(Constants.HEAD))
      {
          return true;
      }
      else
      {
          return false;
      }
    }
    public String ChooseWinner(Player player1,Player player2)
    {
        Coin coin =new Coin();
        coin.flip();
        String side=coin.side;
        if(side.equals(player1.guess))
        {
           return player1.name;
        }
        else {
            return  player2.name;
        }
    }

}
