package lotto;

import java.util.*;

public class LottoNumber {
    private static final int MAXIMUM_LOTTO_NUMBER = 46;
    private static List<LottoNumber> lottoNumbers = new ArrayList<>();
    private int number;

    static {
        for (int i = 1; i < MAXIMUM_LOTTO_NUMBER; i++) {
            lottoNumbers.add(new LottoNumber(i));
        }
    }

    public static Set<LottoNumber> generateLottoNumbers(List<String> tokens) {
        Set<LottoNumber> returnSet = new HashSet<>();
        for (int i = 0, n = tokens.size(); i < n ; i++) {
            returnSet.add(lottoNumbers.get(Integer.parseInt(tokens.get(i))));
        }
        return returnSet;
    }

    public LottoNumber(int number) throws IllegalLottoNumberException {
        if (number < 1 || number > 45) {
            throw new IllegalLottoNumberException();
        }
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoNumber that = (LottoNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}
