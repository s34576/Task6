public class TestBiblioteki {
    public static void main(String[] args) {
        Ksiazka ksiazka1 = new Ksiazka("Syzyfowe prace", 1897, "Stefan Zeromski", 192);
        Ksiazka ksiazka2= new Ksiazka("Lalka", 1889, " Boleslaw Prus",688);
        Film film1 = new Film("Powrot do przyszlosci",1985, "Robert Zemeckis", 111 );
        Film film2 = new Film("Karate Kid", 1984,"John G. Avildsen", 126);
        MediaBiblioteczne[] media = new MediaBiblioteczne[4];
        media[0] = ksiazka1;
        media[1] = ksiazka2;
        media[2] = film1;
        media[3] = film2;
        for(MediaBiblioteczne m : media)
        {
            m.wyswietlInformacje();
        }
        ksiazka1.wypozycz();
        ksiazka1.wypozycz();
        ksiazka1.zwroc();
        ksiazka1.sprawdzLiczbeStron();
        ksiazka2.sprawdzLiczbeStron();
        film1.sprawdzCzasTrwania();
        film2.sprawdzCzasTrwania();


        MediaBiblioteczne media1=ksiazka1;
        MediaBiblioteczne media2=film1;
         /*
        BLAD KOMPILACJI
        media1.sprawdzLiczbeStron();
        media2.sprawdzCzasTrwania();
        */
        ((Ksiazka) media1).sprawdzLiczbeStron();
        ((Film) media2).sprawdzCzasTrwania();

        for(MediaBiblioteczne m : media)
        {
            if(m instanceof Ksiazka)
            {
                Ksiazka ks = (Ksiazka)m;
                ks.sprawdzLiczbeStron();
            }
            else if(m instanceof Film){
                Film f = (Film)m;
                f.sprawdzCzasTrwania();
            }
        }
    }
}
