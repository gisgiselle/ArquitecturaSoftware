public class Main {
    public static void main(String[] args) {
        Article article = new Article(1, "Example Article");
        article.setContent("Hola sin cambios");
        System.out.println(article);

        ArticleMemento memento = article.createMemento();
        article.setContent("Hola con cambios ");
        System.out.println(article);

        article.restore(memento);
        System.out.println("---- RESTORING ----");
        System.out.println(article);
    }
}
