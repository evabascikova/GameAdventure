package logic;

import interfaces.ICommand;

/**
 *  Třída PrikazNapoveda implementuje pro hru příkaz napoveda.
 *  Tato třída je součástí jednoduché textové hry.
 *  
 *@author     Jarmila Pavlickova, Luboš Pavlíček
 *@version    pro školní rok 2015/2016
 *  
 */
class HelpCommand implements ICommand {
    
    private static final String NAME = "napoveda";
    private Commands validCommands;
    
    
     /**
    *  Konstruktor třídy
    *  
    *  @param validCommands seznam příkazů,
    *                       které je možné ve hře použít,
    *                       aby je nápověda mohla zobrazit uživateli. 
    */    
    public HelpCommand(Commands validCommands) {
        this.validCommands = validCommands;
    }
    
    /**
     *  Vrací základní nápovědu po zadání příkazu "napoveda". Nyní se vypisuje
     *  vcelku primitivní zpráva a seznam dostupných příkazů.
     *  
     *  @return napoveda ke hre
     */
    @Override
    public String execute(String... parametry) {
        return "Tvým úkolem je dovést Červenou Karkulku z domečku\n"
        + "až k babičce, která bydlí v chaloupce za lesem.\n"
        + "\n"
        + "Můžeš zadat tyto příkazy:\n"
        + validCommands.getCommandName();
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
