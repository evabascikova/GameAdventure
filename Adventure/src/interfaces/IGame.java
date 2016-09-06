/* Soubor je ulozen v kodovani UTF-8.
 * Kontrola kódování: Příliš žluťoučký kůň úpěl ďábelské ódy. */
package interfaces;

import logic.GamePlan;





/**
 *  Rozhraní které musí implementovat hra, je na ně navázáno uživatelské rozhraní
 *
 *@author     Michael Kolling, Lubos Pavlicek, Jarmila Pavlickova
 *@version    pro školní rok 2015/2016
 */
public interface IGame
{
    //== VEŘEJNÉ KONSTANTY =====================================================
    //== DEKLAROVANÉ METODY ====================================================
    /**
     *  Vrátí úvodní zprávu pro hráče.
     *  
     *  @return  vrací se řetězec, který se má vypsat na obrazovku
     */
    public String greetings();
    
    /**
     *  Vrátí závěrečnou zprávu pro hráče.
     *  
     *  @return  vrací se řetězec, který se má vypsat na obrazovku
     */
    public String ending();
    
    /** 
     * Vrací informaci o tom, zda hra již skončila, je jedno zda výhrou, prohrou nebo příkazem konec.
     * 
     * @return   vrací true, pokud hra skončila
     */
     public boolean gameEnd();
     
      /**
     *  Metoda zpracuje řetězec uvedený jako parametr, rozdělí ho na slovo příkazu a další parametry.
     *  Pak otestuje zda příkaz je klíčovým slovem  např. jdi.
     *  Pokud ano spustí samotné provádění příkazu.
     *
     *@param  radek  text, který zadal uživatel jako příkaz do hry.
     *@return          vrací se řetězec, který se má vypsat na obrazovku
     */
     public String executeCommand(String radek);
   
    
     /**
     *  Metoda vrátí odkaz na herní plán, je využita hlavně v testech,
     *  kde se jejím prostřednictvím získává aktualní místnost hry.
     *  
     *  @return     odkaz na herní plán
     */
     public GamePlan getGamePlan();
    
    //== ZDĚDĚNÉ METODY ========================================================
    //== INTERNÍ DATOVÉ TYPY ===================================================
}
