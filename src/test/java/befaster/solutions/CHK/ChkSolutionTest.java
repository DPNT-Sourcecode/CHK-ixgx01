package befaster.solutions.CHK;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ChkSolutionTest {
    private CheckoutSolution chk;

    @Before
    public void setUp() {

        chk = new CheckoutSolution();
    }

    @Test
    public void compute_chk1() {
        assertThat(chk.checkout("ABCD"), equalTo(50+30+20+15));
    }    
    @Test
    public void compute_chk2() {
        assertThat(chk.checkout("ABCDE"), equalTo(-1));
    }
    @Test
    public void compute_chk3() {
        assertThat(chk.checkout("AAABCD"), equalTo(130+30+20+15));
    }
    @Test
    public void compute_chk4() {
        assertThat(chk.checkout("ABBCD"), equalTo(50+45+20+15));
    }
    
}
