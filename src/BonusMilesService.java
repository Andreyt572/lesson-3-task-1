public class BonusMilesService {
    public int calculate(int price, int bonusPerMile) {
        int result;
        if (price > bonusPerMile) {
            result = (price / bonusPerMile);
        } else {
            result = 0;
        }
        return result;
    }

}
