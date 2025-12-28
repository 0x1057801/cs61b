import org.junit.Test;
import org.junit.FixMethodOrder;
import org.junit.runners.MethodSorters;

import static com.google.common.truth.Truth.assertThat;

/** JUnit 4 version of ArithmeticTest for CS61B Lab01 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ArithmeticTest {

    /** Performs a few arbitrary tests to see if the product method is correct */
    @Test
    public void testProduct() {
        assertThat(Arithmetic.product(5, 6)).isEqualTo(30);
        assertThat(Arithmetic.product(5, -6)).isEqualTo(-30);
        assertThat(Arithmetic.product(0, -6)).isEqualTo(0);
        assertThat(Arithmetic.product(-5, -6)).isEqualTo(30);
    }

    /** Performs a few arbitrary tests to see if the sum method is correct */
    @Test
    public void testSum() {
        assertThat(Arithmetic.sum(5, 6)).isEqualTo(11);
        assertThat(Arithmetic.sum(5, -6)).isEqualTo(-1);
        assertThat(Arithmetic.sum(0, -6)).isEqualTo(-6);
        assertThat(Arithmetic.sum(6, -6)).isEqualTo(0);
        assertThat(Arithmetic.sum(-5, -5)).isEqualTo(-10);
    }
}

