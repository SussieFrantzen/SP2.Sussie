package Library;
import Library.Title;
import static java.lang.Double.parseDouble;

    public abstract class NetTitle extends Title{ // abstract class da der er elementer der skal hive data fra andet sted, ud fra kaldte funktioner
        protected String title; // protected instans værdier da sub-klasse skal kunne anvende samme værdi
        protected String literatureType;
        private int availability; // antal kommuner, der har bogen til udlån
        private int reach; //antal kommuner, der har udlånt bogen
        private int use;


        public NetTitle(String title, String literatureType,int availability, int reach, int use ) {
            super(title, literatureType); // konstruktor der beder om bogens titel og dens type

        }

        public double getPseudoCopies() { //(udbredelse x 5) x getUseFactor
            return (reach * 5) + getUseFactor();
    }

        public int getUseFactor(){ // funktion for tilgængelighed x 0,5)+ anvevendelsesfaktor
           return (int) (availability * 0.5) + use;
        }
    }

