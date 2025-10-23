package Library;

import static java.lang.String.valueOf;

public class EPrintedBook extends NetTitle { // subklasse for bog format hvis superklasse er Title
    private int availability; // antal kommuner, der har bogen til udlån
    private int reach; //antal kommuner, der har udlånt bogen
    private int use; // antal udlån
    boolean illustrated;
    int characters;


    public EPrintedBook(String title, String literatureType, int avaliavity, int reach, int use, boolean illustrated, int characters) {  // konstroktor
        super(title, literatureType, avaliavity, reach, use); // kalder på superklassens variabler.
        this.characters = characters;
        this.illustrated = illustrated;
    }

    public double calculatedPage() { // funktion til at beregne mængden af sider til ebogen
        double page = (double) characters / 1800 + 20;
        if (illustrated) { // hvis der er billeder/ illustrationer i bogen
            return page * 1.1;
        } else {
            return page;
        }

    }
    @Override
    public double calculatePoint() {
        // regnestykket for pointværdi for en E-bog
        return Double.parseDouble(String.valueOf(calculatedPage() * convertLiteratureType() * getPseudoCopies()));

    }
}

