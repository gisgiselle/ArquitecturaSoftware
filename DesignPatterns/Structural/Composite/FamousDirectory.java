import java.util.ArrayList;
import java.util.List;

public class FamousDirectory implements FamousPerson {

    private List<FamousPerson> famousPList = new ArrayList<FamousPerson>();

    @Override
    public void showDetails() {
        for(FamousPerson p : famousPList){
            p.showDetails();
        }
    }

    @Override
    public void influencePeople() {
        for(FamousPerson p : famousPList){
            p.influencePeople();
        }
    }

    @Override
    public void createControversy() {
        for(FamousPerson p : famousPList){
            p.createControversy();
        }
    }

    public void addFamous(FamousPerson f){
        famousPList.add(f);
    }

    public void removeFamous(FamousPerson f){
        famousPList.remove(f);
    }


}
