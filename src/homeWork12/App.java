package homeWork12;


public class App {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев ", "Толстой ");
        Author fedorDostoevskiy = new Author("Федор ", "Достоевский ");

        Book warAndPeas = new Book(levTolstoy,"'Война и мир' ", 1867);
        Book krimeAndPunishment = new Book(fedorDostoevskiy, "'Преступление и наказание' ",
                1866);

        System.out.println(warAndPeas.getAuthorName().getFirstName() + warAndPeas.getAuthorName().getSecondName()
                + warAndPeas.getBookName() + warAndPeas.getPublishingYear());
        warAndPeas.setPublishingYear(2022);
        System.out.println("warAndPeas.getPublishingYear() = " + warAndPeas.getPublishingYear());
        System.out.println(krimeAndPunishment.getAuthorName().getFirstName() + krimeAndPunishment.getAuthorName().getSecondName()
                + krimeAndPunishment.getBookName() + krimeAndPunishment.getPublishingYear());
        krimeAndPunishment.setPublishingYear(2023);
        System.out.println("krimeAndPunishment.getPublishingYear() = " + krimeAndPunishment.getPublishingYear());


    }
}