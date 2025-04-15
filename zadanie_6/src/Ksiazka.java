class Ksiazka extends MediaBiblioteczne{
    private String autor;
    private int liczbaStron;
    public Ksiazka(String tytul, int rokWydania, String autor, int liczbaStron) {
        super(tytul, rokWydania);
        this.autor = autor;
        this.liczbaStron = liczbaStron;
    }
    @Override
    public void wyswietlInformacje()
    {
        super.wyswietlInformacje();
        System.out.println("Autor: " + autor);
        System.out.println("Liczba Stron: " + liczbaStron);
    }
    public void sprawdzLiczbeStron()
    {
        if(liczbaStron >500)
        {
            System.out.println("Ta ksiazka jest dluga, bo ma "+liczbaStron+" stron");
        }
        else {
            System.out.println("Ta ksiazka jest standardowej dlugosci, bo ma "+liczbaStron+" stron");
        }
    }
}
