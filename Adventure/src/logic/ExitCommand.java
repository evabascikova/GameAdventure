package logic;

import interfaces.ICommand;

/**
 *  Třída PrikazKonec implementuje pro hru příkaz konec.
 *  Tato třída je součástí jednoduché textové hry.
 *  
 *@author     Jarmila Pavlickova
 *@version    pro školní rok 2015/2016
 *  
 */

class ExitCommand implements ICommand {

    private static final String NAME = "konec";

    private Game game;

    /**
     *  Konstruktor třídy
     *  
     *  @param game odkaz na hru, která má být příkazem konec ukončena
     */    
    public ExitCommand(Game game) {
        this.game = game;
    }

    /**
     * V případě, že příkaz má jen jedno slovo "konec" hra končí(volá se metoda setKonecHry(true))
     * jinak pokračuje např. při zadání "konec a".
     * 
     * @return zpráva, kterou vypíše hra hráči
     */

    @Override
    public String execute(String... parameters) {
        if (parameters.length > 0) {
            return "Ukončit co? Nechápu, proč jste zadal druhé slovo.";
        }
        else {
            game.setGameEnd(true);
            return "hra ukončena příkazem konec";
        }
    }

    /**
     *  Metoda vrací název příkazu (slovo které používá hráč pro jeho vyvolání)
     *  
     *  @ return nazev prikazu
     */
    @Override
    public String getName() {
        return NAME;
    }
}
