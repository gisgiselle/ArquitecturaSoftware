public class Article {
    private int id;
    private String title;
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public Article(int id, String title) {
        this.id = id;
        this.title = title;
    }

    public ArticleMemento createMemento(){
        ArticleMemento memento = new ArticleMemento(id, title, content);
        return memento;
    }

    public void restore(ArticleMemento memento){
        this.id = memento.getId();
        this.title = memento.getTitle();
        this.content = memento.getContent();
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
