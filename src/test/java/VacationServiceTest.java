import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTest {
    @ParameterizedTest

    @CsvFileSource(files = "src/test/resources/vacation.csv")

    public void shouldCalcMonthsOnVacation(int income, int expences, int threshold, int expected) {
        VacationService service = new VacationService();

        int actual = service.calculate(income, expences, threshold);

        Assertions.assertEquals(expected, actual);
    }

}
