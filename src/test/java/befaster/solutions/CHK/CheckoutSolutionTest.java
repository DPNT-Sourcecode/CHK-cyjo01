package befaster.solutions.CHK;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CheckoutSolutionTest {
    private CheckoutSolution sum;

    @Before
    public void setUp() {

        sum = new CheckoutSolution();
    }

    @Test
    public void compute_sum() {
        assertThat(sum.checkout(""), equalTo(0));
        assertThat(sum.checkout("-"), equalTo(-1));
        assertThat(sum.checkout(null), equalTo(-1));
        assertThat(sum.checkout("ABCa"), equalTo(-1));
        assertThat(sum.checkout("ABCDABCD"), equalTo(215));

    }
}
