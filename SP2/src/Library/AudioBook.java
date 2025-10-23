package Library;
import static java.lang.String.valueOf;

public class AudioBook extends Title { // subklasse for lydbøger med superklasse Title
    private int durationInMinutes; // instans variabel for hvor mange minutter lydbogen er på.
    private int copies; // instans variabel for hvor mange eksemplar der er.

    public AudioBook(String title, String literatureType, int copies, int durationInMinutes) { // konstruktor
        super(title, literatureType); // henter variabler fra superklassen
        this.copies = copies;
        this.durationInMinutes = durationInMinutes;
    }
    @Override
    public double calculatePoint() {
        // regnestykke for beregning af point for lydbøger (lydbogens længde i minutter x 0,5 x litteratur type x mængden af eksemplar)
        double point = Double.parseDouble(String.valueOf(durationInMinutes * 0.5 * convertLiteratureType() * copies));
        return point;
    }

}
