import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {
    @Test
    public void shouldCalcMonthsOnVacation() {
        VacationService service = new VacationService();
        int income = 10_000;
        int expences = 3_000;
        int threshold = 20_000;
        int expected = 3;
        int actual = service.calculate(income, expences, threshold);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldCalcMonthsOnVacationMoreIncom() {
        VacationService service = new VacationService();
        int income = 100_000;
        int expences = 60_000;
        int threshold = 150_000;
        int expected = 2;
        int actual = service.calculate(income, expences, threshold);

        Assertions.assertEquals(expected, actual);
    }
}
