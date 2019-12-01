package matt.barbier.mockito.com;

class Deck {
    Game theGame;

    public Deck(Game game)
    {
        theGame = game;
    }

    public String OutputGameName()
    {
        return theGame.GetName();        
    }
}