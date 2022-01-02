public class BonusMilesService {
    int miles;
    int price;
    public int calculate(int price) {
        miles = price / 20 ;
        return miles;
    }

}
