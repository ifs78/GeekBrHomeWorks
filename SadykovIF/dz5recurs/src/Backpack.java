import java.util.List;
public class Backpack {
    private List<Subject> prime;
    private List<Subject> newList;
    private int maxVol;
    private int maxCost;
    public Backpack(int maxVol)
    {
        this.maxVol = maxVol;
    }
    private int volumeRate(List<Subject> subjects) {
        int allVol = 0;
        for (Subject i : subjects) {
            allVol += i.volume;
        }
        return allVol;
    }
    private int costRate (List<Subject> subjects) {
        int allPrice = 0;
        for (Subject i : subjects) {
            allPrice += i.cost;
        }
        return allPrice;
    }
    private void choiceSub(List<Subject> subjects){
        if (prime == null){
            if (volumeRate(subjects) <= maxVol){
                prime = subjects;
                maxCost = costRate(subjects);
            }
        }
        else {
            if (volumeRate(subjects) <= maxVol && costRate(subjects) > maxCost){
                prime = subjects;
                maxCost = costRate(subjects);
            }
        }
    }
    public void valueReset(List<Subject> subjects){
        if (subjects.size() > 0) choiceSub(subjects);
        for (int i = 0; i < subjects.size() ; i++) {
            newList.remove(i);
            valueReset(newList);
        }
    }
    public List<Subject> inPack(){

        return prime;
    }

}
