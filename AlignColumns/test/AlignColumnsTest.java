// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class AlignColumnsTest {

    @Test
    void shouldReturnSameInputWhenDollarIsNotPresent() {
        // Given
        var input = "Unacadenacambiada";
        var expected = "Unacadenacambiada";

        // When
        var actual = AlignColumns.align(input);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn2SeparatedWordsWhenDollarIsPresentInBetween() {
        // Given
        var input = "Cadena$cambiada";
        var expected = "Cadena cambiada";

        // When
        var actual = AlignColumns.align(input);

        // Then
        assertEquals(expected, actual);
    }

}
