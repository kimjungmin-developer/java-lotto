package lotto;


import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class WinningLottoTest {


    @Test
    public void 숫자_0개_일치() {
        Lotto lotto = new Lotto(Arrays.asList(1,2,3,4,5,6));
        WinningLotto winningLotto = new WinningLotto(Arrays.asList(10,11,12,7,8,9));

        assertThat(winningLotto.prizeOf(lotto)).isEqualTo(Prize.MISS);
    }

    @Test
    public void 숫자_한개_일치() {
        Lotto lotto = new Lotto(Arrays.asList(1,2,3,4,5,6));
        WinningLotto winningLotto = new WinningLotto(Arrays.asList(6,11,12,7,8,9));

        assertThat(winningLotto.prizeOf(lotto)).isEqualTo(Prize.MISS);
    }

    @Test
    public void 숫자_두개_일치() {
        Lotto lotto = new Lotto(Arrays.asList(1,2,3,4,5,6));
        WinningLotto winningLotto = new WinningLotto(Arrays.asList(3,11,5,7,8,9));

        assertThat(winningLotto.prizeOf(lotto)).isEqualTo(Prize.MISS);
    }

    @Test
    public void 숫자_세개_일치() {
        Lotto lotto = new Lotto(Arrays.asList(1,2,3,4,5,6));
        WinningLotto winningLotto = new WinningLotto(Arrays.asList(3,4,5,7,8,9));
        assertThat(winningLotto.prizeOf(lotto)).isEqualTo(Prize.FOURTH );
    }

    @Test
    public void 숫자_네개_일치() {
        Lotto lotto = new Lotto(Arrays.asList(1,2,3,4,5,6));
        WinningLotto winningLotto = new WinningLotto(Arrays.asList(3,4,5,6,8,9));

        assertThat(winningLotto.prizeOf(lotto)).isEqualTo(Prize.THIRD);
    }

    @Test
    public void 숫자_다섯개_일치() {
        Lotto lotto = new Lotto(Arrays.asList(1,2,3,4,5,6));
        WinningLotto winningLotto = new WinningLotto(Arrays.asList(1,2,3,4,5,7));

        assertThat(winningLotto.prizeOf(lotto)).isEqualTo(Prize.SECOND);
    }

    @Test
    public void 숫자_여섯개_일치() {
        Lotto lotto = new Lotto(Arrays.asList(1,2,3,4,5,6));
        WinningLotto winningLotto = new WinningLotto(Arrays.asList(1,2,3,4,5,6));

        assertThat(winningLotto.prizeOf(lotto)).isEqualTo(Prize.FIRST);
    }




}
