package Library;
import java.util.ArrayList;

public class Author {
    private String name;    // instans variabel for forfatteren navn
    private ArrayList<Title> titles; // instans variabel for arraylist

    public Author(String name) { // konstruktor
        this.name = name;
        this.titles = new ArrayList<>();
    }

    public void addTitle(Title title) { // funktion til at tilføje titler/ bøger til arraylisten
        titles.add(title);
    }

    public double calculateRoyalties() { // samlet værkers indkomst funktion
        double total = 0;
        for (Title title : titles) { // køre arraylisten igennem
            total += title.calculateRoyalty(); // ligger værdierne sammen
        } return Math.round(total*100)/100.0; // returnere den afrunde værdien af max 2 decimaler
    }


    public String getName() { // kalder på det given forfatternavn og returnere det
    return name;
    }
}
