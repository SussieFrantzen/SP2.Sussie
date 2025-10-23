import Library.Title;
import Library.AudioBook;
import Library.PrintedBook;
import Library.Author;
import Library.NetTitle;
import Library.EAudioBook;
import Library.EPrintedBook;

// SP2 Bibliotekspenge

//-------------------------------------------    info     --------------------------------------------------------//
 /*
            Er påbegyndt på udvigelsen men har ikke nået alt, har fået lavet en EAudioBook class og EPrintBook
            samt lavet en NetTitle med Superklasse til Tiltle.
            har ikke noget at lave en fysikTitle klasse eller IAudio klasse.

 */

//____________________________________________Opgave beskrivelse_________________________________________________//
//En forfatter modtager årligt bibliotekspenge for at have sine bøger (titler)
// stående på de danske biblioteker. Hvad en titel præcis indbringer,
// af hænger af dens type. Der skelnes f.eks. mellem printede bøger og lydbøger.
// Byg et system der beregner en forfatters bibliotekspenge, baseret på forfatterens titler.

//Til hjælp har du klassediagrammet nederst.
// Implementer klasserne med de angivne metoder, felter og relationer.
// Implementer dernæst metoderne udfra flg. beskrivelse af reglerne for beregning.


//Test
//For at teste systemet, skal du lave en klasse kaldet LibraryRoyalityCalculator
// (ikke med i klassediagrammet). LibraryRoyalityCalculator skal indeholde en main metode,
// *** hvori du opretter mindst 1 forfatter med mindst 1 lydbog og mindst 1 printet bog.
// *** Brug Author klassens addTitle metode til at tilføje titlerne til forfatteren.
// *** Kald forfatterens calculateTotalPay der gerne skulle beregne og returnere forfatterens bibliotekspenge.

// Fra main skrives resultatet pænt ud med forfatterens navn og det beløb der skal udbetales.
//______________________________________________________________________________________________________________//

public class LibraryRoyalityCalculator {
    public static void main(String[] args) {

        Author booklistOfHCAndersen = new Author("HC.Andersen"); // laver et nyt arraylist med forfatterens navn så han har sine samlet værker i en liste.

        booklistOfHCAndersen.addTitle(new PrintedBook(" Den Grimme ælding ", "BI", 4, 35)); // tilføjer bøger til arraylisten.
        booklistOfHCAndersen.addTitle((new PrintedBook(" Den lille Havfrue ","skøn",2,85)));
        booklistOfHCAndersen.addTitle((new AudioBook(" Pigen med svovlstiken ", "skøn",2,60)));
        booklistOfHCAndersen.addTitle((new AudioBook(" Den lille Havfrue ","skøn",2,60)));
        booklistOfHCAndersen.addTitle((new EPrintedBook(" Den Grimme ælding ", "bi", 40, 10,400,true, 63000)));
        booklistOfHCAndersen.addTitle((new EAudioBook(" Den lille havfrue ", "skøn", 55, 30,200,55)));
        booklistOfHCAndersen.addTitle((new EAudioBook(" 100 digte ", "lyrik", 55, 22,80,180)));
        booklistOfHCAndersen.addTitle(new PrintedBook(" 100 digte ", "lyrik", 4, 300));

        Author booklistOfMiaIkumi = new Author("Mia Ikumi"); // tilføjer en forfatter bogliste mere i et nyt arraylist
        // tilføjer bøger til forfatteren
        booklistOfMiaIkumi.addTitle(new PrintedBook(" Tokyo mew mew 1","te", 2, 250));
        booklistOfMiaIkumi.addTitle(new PrintedBook(" Tokyo mew mew 2 ","te", 2, 250));
        booklistOfMiaIkumi.addTitle(new PrintedBook(" Tokyo mew mew 3 ","te", 2, 260));
        booklistOfMiaIkumi.addTitle(new PrintedBook(" Tokyo mew mew 4 ","te", 1, 275));
        booklistOfMiaIkumi.addTitle(new PrintedBook(" Tokyo mew mew 5 ","te", 1, 255));
        booklistOfMiaIkumi.addTitle(new PrintedBook(" Tokyo mew mew 6 ","te", 1, 270));
        booklistOfMiaIkumi.addTitle(new PrintedBook(" Tokyo mew mew a la mon 1","te", 1, 280));
        booklistOfMiaIkumi.addTitle(new PrintedBook(" Tokyo mew mew a la mon 2","te", 1, 280));

    // Printer indkomsten for forfatterne
        double HCIndkomst = booklistOfHCAndersen.calculateRoyalties();
        System.out.println(" Forfatter " + booklistOfHCAndersen.getName() + " tjener " + HCIndkomst + " kr.");

        double MiaIkumiIndkomst = booklistOfMiaIkumi.calculateRoyalties();
        System.out.println(" Forfatter " + booklistOfMiaIkumi.getName() + " tjener " + MiaIkumiIndkomst + " kr.");
    }
}