public abstract class FamousPerson {
    private String name;
    private String worksAt;
    public abstract void getPhotographed();
    public abstract void influencePeople();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWorksAt() {
        return worksAt;
    }

    public void setWorksAt(String worksAt) {
        this.worksAt = worksAt;
    }
}
