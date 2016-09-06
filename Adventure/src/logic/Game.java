package logic;

import interfaces.ICommand;
import interfaces.IGame;

/**
 *  Třída Hra - třída představující logiku adventury.
 * 
 *  Toto je hlavní třída  logiky aplikace.  Tato třída vytváří instanci třídy HerniPlan, která inicializuje mistnosti hry
 *  a vytváří seznam platných příkazů a instance tříd provádějící jednotlivé příkazy.
 *  Vypisuje uvítací a ukončovací text hry.
 *  Také vyhodnocuje jednotlivé příkazy zadané uživatelem.
 *
 *@author     Michael Kolling, Lubos Pavlicek, Jarmila Pavlickova
 *@version    pro školní rok 2015/2016
 */

public class Game implements IGame {
    private final Commands validCommands;    // obsahuje seznam přípustných příkazů
    private final GamePlan gamePlan;
    private boolean gameEnd = false;

    /**
     *  Vytváří hru a inicializuje místnosti (prostřednictvím třídy HerniPlan) a seznam platných příkazů.
     */
    public Game() {
        gamePlan = new GamePlan();
        validCommands = new Commands();
        validCommands.addCommand(new HelpCommand(validCommands));
        validCommands.addCommand(new GoCommand(gamePlan));
        validCommands.addCommand(new ExitCommand(this));
    }

    /**
     *  Vrátí úvodní zprávu pro hráče.
     */
    @Override
    public String greetings() {
        return "Vítejte!\n" +
               "Toto je příběh o Červené Karkulce, babičce a vlkovi.\n" +
               "Napište 'napoveda', pokud si nevíte rady, jak hrát dál.\n" +
               "\n" +
               gamePlan.getActualPlace().introduction();
    }
    
    /**
     *  Vrátí závěrečnou zprávu pro hráče.
     */
    @Override
    public String ending() {
        return "Dík, že jste si zahráli.  Ahoj.";
    }
    
    /** 
     * Vrací true, pokud hra skončila.
     */
    @Override
     public boolean gameEnd() {
        return gameEnd;
    }

    /**
     *  Metoda zpracuje řetězec uvedený jako parametr, rozdělí ho na slovo příkazu a další parametry.
     *  Pak otestuje zda příkaz je klíčovým slovem  např. jdi.
     *  Pokud ano spustí samotné provádění příkazu.
     *
     *@param  row  text, který zadal uživatel jako příkaz do hry.
     *@return          vrací se řetězec, který se má vypsat na obrazovku
     */
     public String executeCommand(String row) {
        String [] words = row.split("[ \t]+");
        String command = words[0];
        String []parameters = new String[words.length-1];
        for(int i=0 ;i<parameters.length;i++){
           	parameters[i]= words[i+1];  	
        }
        String result=" .... ";
        if (validCommands.isValidCommand(command)) {
            ICommand commandToExecute = validCommands.getCommand(command);
            result = commandToExecute.execute(parameters);
        }
        else {
            result="Nevím co tím myslíš? Tento příkaz neznám. ";
        }
        return result;
    }
    
    
     /**
     *  Nastaví, že je konec hry, metodu využívá třída PrikazKonec,
     *  mohou ji použít i další implementace rozhraní Prikaz.
     *  
     *  @param  gameEnd  hodnota false= konec hry, true = hra pokračuje
     */
    void setGameEnd(boolean gameEnd) {
        this.gameEnd = gameEnd;
    }
    
     /**
     *  Metoda vrátí odkaz na herní plán, je využita hlavně v testech,
     *  kde se jejím prostřednictvím získává aktualní místnost hry.
     *  
     *  @return     odkaz na herní plán
     */
     public GamePlan getGamePlan(){
        return gamePlan;
     }
    
}

