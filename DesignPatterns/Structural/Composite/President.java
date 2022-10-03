public class President implements FamousPerson{
    private String name;
    private String country;

    public President(String name, String country) {
        this.name = name;
        this.country = country;
    }

    @Override
    public void showDetails() {
        System.out.println(name + " is the president of  "+ country);
    }

    @Override
    public void influencePeople() {
        System.out.println(name + " gave a speech in "+country);
    }

    @Override
    public void createControversy() {
        System.out.println(name+ ", the president of "+ country + " stole money");
    }
}
