public class Client {
    public static void main(String[] args) {
        MovieStar leo = new MovieStar("Leonardo Dicaprio", "Revenant");
        MovieStar henry = new MovieStar("Henry Cavill", "Superman");

        FamousDirectory movieDir = new FamousDirectory();
        movieDir.addFamous(leo);
        movieDir.addFamous(henry);

        TikToker kimberly = new TikToker("Kimberly Loaiza", "bailando");
        TikToker gabbie = new TikToker("Gabbie Hanna ", "psychology is fake");

        FamousDirectory tiktokDir = new FamousDirectory();
        tiktokDir.addFamous(kimberly);
        tiktokDir.addFamous(gabbie);

        President trump = new President("Donald Trump", "USA");
        President amlo = new President("AMLO", "Mexico");

        FamousDirectory presiDir = new FamousDirectory();
        presiDir.addFamous(trump);
        presiDir.addFamous(amlo);

        FamousDirectory directory = new FamousDirectory();
        directory.addFamous(movieDir);
        directory.addFamous(tiktokDir);
        directory.addFamous(presiDir);
        directory.showDetails();
        directory.createControversy();
        directory.influencePeople();

    }
}
