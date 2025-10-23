package Library;
import static java.lang.Double.parseDouble;

public abstract class Title { // abstract class da der er elementer der skal hive data fra andet sted, ud fra kaldte funktioner
    protected String title; // protected instans værdier da sub-klasse skal kunne anvende samme værdi
    protected String literatureType;
    public static final double RATE = 0.067574;


    public Title(String title, String literatureType) { // konstruktor der beder om bogens titel og dens type
        this.title = title;
        this.literatureType = literatureType;
    }

    public abstract double calculatePoint(); // abstract funktion der gør det muligt at systemet selv
    // kan finde ud af hvilket format der er i brug.

    public double calculateRoyalty() { // funktion der beregner værdien for det enkelte værk.
        return RATE * calculatePoint();
    }


    public double convertLiteratureType() { // funktion der aflæser hvilken værdi der skal anvendes ud fra hvilken litteraturtype
        return switch (literatureType.toUpperCase()) { // switch case for litteraturtyperne
            // toUpperCase gør at det lige meget om man skriver med stort eller småt.
            case "BI", "TE", "BILLEDBØGER ", "TEGNESERIER" ->
                    3; // case aflæser hvilken type bog der er valgt og returnere værdien.
            case "LYRIK", "LYRIKSAMLING" -> 6;
            case "SKØN", "SKØNLITTERATUR " -> 1.7;
            case "FAG", "FAGLITTERATUR" -> 1;
            case null, default -> parseDouble("litteratur Typen er eksistere ikke ");
        };
    }

}
