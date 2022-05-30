public class BonusMilesService {
    public int calculate (int cost) {
        int result = cost / 20;
        if (cost < 20) {
            result = 0;
        }
        return result;

    }
}
