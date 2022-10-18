// A simple example to get you started
// JUnit assertion - the default Java assertion library
// https://junit.org/junit5/

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
public class AlignColumnsTest {

    @Test
    void shouldReturnSameInputWhenDollarIsNotPresent() {
        // Given
        var input = "Unacadenacambiada";
        var expected = "Unacadenacambiada";

        // When
        var actual = AlignColumns.replaceDollarBySpace(input);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnTwoSeparatedWordsWhenDollarIsPresentInBetween() {
        // Given
        var input = "Cadena$cambiada";
        var expected = "Cadena cambiada";

        // When
        var actual = AlignColumns.replaceDollarBySpace(input);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnFiveSeparatedWordsWhenDollarIsPresentInBetween() {
        // Given
        var input = "Soy$una$cadena$de$cinco$palabras";
        var expected = "Soy una cadena de cinco palabras";

        // When
        var actual = AlignColumns.replaceDollarBySpace(input);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnTwoPhrasesAlignedByColumnsWhenThereIsABreakLine() {
        // Given
        var input = "Cadena$cambiada\nSoy$cadena";
        var expected = "Cadena cambiada\nSoy    cadena";

        // When
        var actual = AlignColumns.replaceDollarBySpace(input);

        // Then
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnOneDollarSignWhenThereAreTwoDollarsContiguous() {
        // Given
        var input = "Cuesta$20$$todo";
        var expected = "Cuesta 20$ todo";

        // When
        var actual = AlignColumns.replaceDollarBySpace(input);

        // Then
        assertEquals(expected, actual);
    }



}
