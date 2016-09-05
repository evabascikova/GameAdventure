package logic;


/**
 *  Class HerniPlan - třída představující mapu a stav adventury.
 * 
 *  Tato třída inicializuje prvky ze kterých se hra skládá:
 *  vytváří všechny prostory,
 *  propojuje je vzájemně pomocí východů 
 *  a pamatuje si aktuální prostor, ve kterém se hráč právě nachází.
 *
 *@author     Michael Kolling, Lubos Pavlicek, Jarmila Pavlickova
 *@version    pro školní rok 2015/2016
 */
public class GamePlan {
    
    private Place actualPlace;
    
     /**
     *  Konstruktor který vytváří jednotlivé prostory a propojuje je pomocí východů.
     *  Jako výchozí aktuální prostor nastaví halu.
     */
    public GamePlan() {
        makeGamePlan();

    }
    /**
     *  Vytváří jednotlivé prostory a propojuje je pomocí východů.
     *  Jako výchozí aktuální prostor nastaví domeček.
     */
    private void makeGamePlan() {
        // vytvářejí se jednotlivé prostory
        Place domecek = new Place("domeček","domeček, ve kterém bydlí Karkulka");
        Place chaloupka = new Place("chaloupka", "chaloupka, ve které bydlí babička Karkulky");
        Place jeskyne = new Place("jeskyně","stará plesnivá jeskyně");
        Place les = new Place("les","les s jahodami, malinami a pramenem vody");
        Place hlubokyLes = new Place("hluboký_les","temný les, ve kterém lze potkat vlka");
        
        // přiřazují se průchody mezi prostory (sousedící prostory)
        domecek.setExit(les);
        les.setExit(domecek);
        les.setExit(hlubokyLes);
        hlubokyLes.setExit(les);
        hlubokyLes.setExit(jeskyne);
        hlubokyLes.setExit(chaloupka);
        jeskyne.setExit(hlubokyLes);
        chaloupka.setExit(hlubokyLes);
                
        actualPlace = domecek;  // hra začíná v domečku       
    }
    
    /**
     *  Metoda vrací odkaz na aktuální prostor, ve ktetém se hráč právě nachází.
     *
     *@return     aktuální prostor
     */
    
    public Place getActualPlace() {
        return actualPlace;
    }
    
    /**
     *  Metoda nastaví aktuální prostor, používá se nejčastěji při přechodu mezi prostory
     *
     *@param  prostor nový aktuální prostor
     */
    public void setActualPlace(Place prostor) {
       actualPlace = prostor;
    }

}
