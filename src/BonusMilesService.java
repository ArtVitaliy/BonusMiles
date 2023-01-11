public class BonusMilesService {
        public int calculate(int cost) {
            int bonusMiles = 20;
            int bonus = cost / bonusMiles;
            return bonus;
        }
    }
