package Øvinger.Øving11;

import java.util.ArrayList;

public class EiendomManager {
    /** List to store all properties */
    private final ArrayList<Eiendommer> eiendommer;

    /** Constructor to initialize the property manager */
    public EiendomManager() {
        eiendommer = new ArrayList<>();
    }

    /** Adds a new property to the list */
    public void addEiendom(Eiendommer eiendom) {
        eiendommer.add(eiendom);
    }
    
    /** Returns the list of all properties */
    public ArrayList<Eiendommer> getEiendommer() {
        return eiendommer;
    }

    /** Returns the property with a specific nummer */
    public Eiendommer getEiendomByNr(String nr) {
        for (Eiendommer eiendom : eiendommer) {
            if (eiendom.getNr().equals(nr)) {
                return eiendom;
            }
        }
        return null;
    }

    /** Returns the list of properties with a specific kommunenummer */
    public ArrayList<Eiendommer> getEiendommerByKomuneNr(int komuneNr) {
        ArrayList<Eiendommer> result = new ArrayList<>();
        for (Eiendommer eiendom : eiendommer) {
            if (eiendom.getKomuneNr() == komuneNr) {
                result.add(eiendom);
            }
        }
        return result;
    }

    /** Returns the list of properties with a specific gårdsNr */
    public ArrayList<Eiendommer> getEiendommerByGårdsNr(int gårdsNr) {
        ArrayList<Eiendommer> result = new ArrayList<>();
        for (Eiendommer eiendom : eiendommer) {
            if (eiendom.getGårdsNr() == gårdsNr) {
                result.add(eiendom);
            }
        }
        return result;
    }

    /** Returns the list of properties with a specific bruksNr */
    public ArrayList<Eiendommer> getEiendommerByBruksNr(int bruksNr) {
        ArrayList<Eiendommer> result = new ArrayList<>();
        for (Eiendommer eiendom : eiendommer) {
            if (eiendom.getBruksNr() == bruksNr) {
                result.add(eiendom);
            }
        }
        return result;
    }
    
    /** Returns the list of properties with a specific bruksNavn */
    public ArrayList<Eiendommer> getEiendommerByBruksNavn(String bruksNavn) {
        ArrayList<Eiendommer> result = new ArrayList<>();
        for (Eiendommer eiendom : eiendommer) {
            if (eiendom.getBruksNavn().equalsIgnoreCase(bruksNavn)) {
                result.add(eiendom);
            }
        }
        return result;
    }

    /** Returns the list of properties located in a specific municipality */
    public ArrayList<Eiendommer> getEiendommerByKomune(String komune) {
        ArrayList<Eiendommer> result = new ArrayList<>();
        for (Eiendommer eiendom : eiendommer) {
            if (eiendom.getKomune().equalsIgnoreCase(komune)) {
                result.add(eiendom);
            }
        }
        return result;
    }

    /** Returns the list of properties owned by a specific owner */
    public ArrayList<Eiendommer> getEiendommerByEier(String eierNavn) {
        ArrayList<Eiendommer> result = new ArrayList<>();
        for (Eiendommer eiendom : eiendommer) {
            if (eiendom.getEierNavn().equalsIgnoreCase(eierNavn)) {
                result.add(eiendom);
            }
        }
        return result;
    }
    
    /** Returns the list of properties sorted by owner name */
    public ArrayList<Eiendommer> getEiendommerSortedByEier() {
        ArrayList<Eiendommer> sortedList = new ArrayList<>(eiendommer);
        sortedList.sort((e1, e2) -> e1.getEierNavn().compareToIgnoreCase(e2.getEierNavn()));
        return sortedList;
    }

    /** Returns the list of properties within a specified area range */
    public ArrayList<Eiendommer> getEiendommersByArealRange(double minAreal, double maxAreal) {
        ArrayList<Eiendommer> result = new ArrayList<>();
        for (Eiendommer eiendom : eiendommer) {
            if (eiendom.getAreal() >= minAreal && eiendom.getAreal() <= maxAreal) {
                result.add(eiendom);
            }
        }
        return result;
    }

    /**Returns the list of properties sorted by area */
    public ArrayList<Eiendommer> getEiendommerSortedByAreal() {
        ArrayList<Eiendommer> sortedList = new ArrayList<>(eiendommer);
        sortedList.sort((e1, e2) -> Double.compare(e1.getAreal(), e2.getAreal()));
        return sortedList;
    }

    /** Returns the list of properties sorted by kommunenummer */
    public ArrayList<Eiendommer> getEiendommerSortedByKomuneNr() {
        ArrayList<Eiendommer> sortedList = new ArrayList<>(eiendommer);
        sortedList.sort((e1, e2) -> Integer.compare(e1.getKomuneNr(), e2.getKomuneNr()));
        return sortedList;
    }

    /** Returns the list of properties sorted by gårdsnummer */
    public ArrayList<Eiendommer> getEiendommerSortedByGårdsNr() {
        ArrayList<Eiendommer> sortedList = new ArrayList<>(eiendommer);
        sortedList.sort((e1, e2) -> Integer.compare(e1.getGårdsNr(), e2.getGårdsNr()));
        return sortedList;
    }

    /** Returns the list of properties sorted by bruksnummer */
    public ArrayList<Eiendommer> getEiendommerSortedByBruksNr() {
        ArrayList<Eiendommer> sortedList = new ArrayList<>(eiendommer);
        sortedList.sort((e1, e2) -> Integer.compare(e1.getBruksNr(), e2.getBruksNr()));
        return sortedList;
    }

    /** Creates some sample properties */
    public void createEiendommer() {
        addEiendom(new Eiendommer(1445, "Gloppen", 77, 631, "", 1017.6, "Jens Olsen"));
        addEiendom(new Eiendommer(1445, "Gloppen", 77, 131, "Syningom", 661.3, "Nicolay Madsen"));
        addEiendom(new Eiendommer(1445, "Gloppen", 75, 19, "Fugletun", 650.6, "Evilyn Jensen"));
        addEiendom(new Eiendommer(1445, "Gloppen", 74, 188, "", 1457.2, "Karl Ove Bråten"));
        addEiendom(new Eiendommer(1445, "Gloppen", 69, 47, "Høiberg", 1339.4, "Elsa Indregård"));
    }
}
