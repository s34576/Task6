public class MediaBiblioteczne {
    protected String tytul;
    protected int rokWydania;
    protected boolean dostepny;

    public MediaBiblioteczne(String tytul, int rokWydania) {
        this.tytul = tytul;
        this.rokWydania = rokWydania;
        this.dostepny = true;
    }
    public void wypozycz()
    {
        if(dostepny==true)
        {
            dostepny = false;
            System.out.println("Medium zostalo wypozyczone");
        }
        else{
            System.out.println("Nie mozna wypozyczyc medium, jest juz wypozyczone");
        }

    }
    public void zwroc()
    {
        if(dostepny==false)
        {
            dostepny = true;
            System.out.println("Medium zostalo zwrocone");
        }
        else{
            System.out.println("Medium nie było wypozyczone");
        }

    }
    public void wyswietlInformacje()
    {
        String status = dostepny ? "Dostępne" : "Wypożyczone";
        System.out.println("Tytuł: "+tytul);
        System.out.println("Rok wydania: "+rokWydania);
        System.out.println("Status: " +status);
    }

}
