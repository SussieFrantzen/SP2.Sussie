package Library;
import static java.lang.String.valueOf;

public class EAudioBook extends NetTitle { // subklasse for lydbøger med superklasse Title
        private int durationInMinutes; // instans variabel for hvor mange minutter lydbogen er på.
        private int availability; // antal kommuner, der har bogen til udlån
        private int reach; //antal kommuner, der har udlånt bogen
        private int use; // antal udlån

        public EAudioBook(String title, String literatureType, int availability, int reach, int use, int durationInMinutes) { // konstruktor
            super(title, literatureType, availability, reach,use); // henter variabler fra superklassen
            this.durationInMinutes = durationInMinutes;
        }
    public double calculatedPage() { // funktion til at beregne mængden af sider
        int page = durationInMinutes / 2; // længden i minutter for lydbog divideret med 2 ( variablen 2 er oplyst fra opgaven)
        return page;
    }
        @Override
        public double calculatePoint() {
            // regnestykke for beregning af point for lydbøger
            double point = Double.parseDouble(String.valueOf((calculatedPage() * convertLiteratureType() * getPseudoCopies())));
            return point;
        }

    }
