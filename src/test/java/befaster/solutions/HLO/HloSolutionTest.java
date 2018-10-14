package befaster.solutions.HLO;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import befaster.solutions.TST.One;

public class HloSolutionTest {
    private HelloSolution hello;

    @Before
    public void name() {
        hello = new HelloSolution();
    }

    @Test
    public void run() {
        assertThat(hello.hello("Fred Smith"), equalTo("Fred Smith"));
    }
}
