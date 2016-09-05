package logic;

import java.util.HashMap;
import java.util.Map;

/**
 *  Class SeznamPrikazu - eviduje seznam přípustných příkazů adventury.
 *  Používá se pro rozpoznávání příkazů
 *  a vrácení odkazu na třídu implementující konkrétní příkaz.
 *  Každý nový příkaz (instance implementující rozhraní Prikaz) se
 *  musí do seznamu přidat metodou vlozPrikaz.
 *
 *  Tato třída je součástí jednoduché textové hry.
 *
 *@author     Michael Kolling, Lubos Pavlicek, Jarmila Pavlickova
 *@version    pro školní rok 2015/2016
 */
class Commands {
    // mapa pro uložení přípustných příkazů
    private  Map<String,ICommand> commandMap;
    
   
    
    /**
     * Konstruktor
     */
    public Commands() {
        commandMap = new HashMap<>();
    }
    
    
    /**
     * Vkládá nový příkaz.
     *
     *@param  command  Instance třídy implementující rozhraní IPrikaz
     */
    public void addCommand(ICommand command) {
        commandMap.put(command.getName(),command);
    }
    
    /**
     * Vrací odkaz na instanci třídy implementující rozhraní IPrikaz,
     * která provádí příkaz uvedený jako parametr.
     *
     *@param  retezec  klíčové slovo příkazu, který chce hráč zavolat
     *@return          instance třídy, která provede požadovaný příkaz
     */
    public ICommand getCommand(String retezec) {
        if (commandMap.containsKey(retezec)) {
            return commandMap.get(retezec);
        }
        else {
            return null;
        }
    }

    /**
     * Kontroluje, zda zadaný řetězec je přípustný příkaz.
     *
     *@param  retezec  Řetězec, který se má otestovat, zda je přípustný příkaz
     *@return          Vrací hodnotu true, pokud je zadaný
     *                     řetězec přípustný příkaz
     */
    public boolean jePlatnyPrikaz(String retezec) {
        return commandMap.containsKey(retezec);
    }

    /**
     *  Vrací seznam přípustných příkazů, jednotlivé příkazy jsou odděleny mezerou.
     *  
     *  @return     Řetězec, který obsahuje seznam přípustných příkazů
     */
    public String vratNazvyPrikazu() {
        String seznam = "";
        for (String slovoPrikazu : commandMap.keySet()){
            seznam += slovoPrikazu + " ";
        }
        return seznam;
    }
    
}

