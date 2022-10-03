public class TikToker implements FamousPerson {

    private String name;
    private String famousTiktok;


    @Override
    public void showDetails() {
        System.out.println(name + " uploaded " + famousTiktok);
    }

    @Override
    public void influencePeople() {
        System.out.println(name + " says water is toxic in her tiktok " + famousTiktok);
    }

    @Override
    public void createControversy() {
        System.out.println("TikToker  " + name + " created controversy in their video " + famousTiktok);
    }

    public TikToker(String name, String famousTiktok) {
        this.name = name;
        this.famousTiktok = famousTiktok;
    }

}
