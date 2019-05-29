package lotto;

import java.util.Arrays;
import java.util.NoSuchElementException;

public enum Prize {
    FIRST(6, 2000000000),
    SECOND(5, 1500000),
    THIRD(4, 50000),
    FOURTH(3, 5000),
    MISS(0, 0);

    private int matchCount;
    private int prizeMoney;

    Prize(int matchCount, int prizeMoney) {
        this.matchCount = matchCount;
        this.prizeMoney = prizeMoney;
    }

    public static Prize getPrizeRank(int matchCount) {
        try {
            return Arrays.stream(values()).filter(prize -> prize.matchCount == matchCount).findAny().get();
        } catch (NoSuchElementException e) {
            return MISS;
        }
    }

    public int getPrizeMoney() {
        return prizeMoney;
    }
}
