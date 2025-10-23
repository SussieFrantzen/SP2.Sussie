package Library;

public class PrintedBook extends Title { // subklasse for bog format hvis superklasse er Title
    int pages; // instants variabel for antal sider i bogen
    int copies; // instants variabel for mængden af eksemplar

    public PrintedBook(String title, String literatureType, int copies, int pages) {  // konstroktor
        super(title, literatureType); // kalder på superklassens variabler.
        this.copies = copies;
        this.pages = pages;
    }
    @Override
    public double calculatePoint() { // regnestykket for pointværdi for en trykket bog (Sider x litteraturtype x eksemplarer)

        double point = Double.parseDouble(String.valueOf(pages * convertLiteratureType() * copies));
        return point;
    }
}
