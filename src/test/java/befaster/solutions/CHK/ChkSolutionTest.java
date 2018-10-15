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
    public void compute_sum() {
        assertThat(chk.checkout("ABCD"), equalTo(115));
    }
}
