import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HolidayService {
    @Test
    void shouldCalculateAmountMonthRestThreshould20_000() {
        HolidayService service = new HolidayService();

        // подготавливаем данные:
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;
        int expected = 3;

        // вызываем целевой метод:
        int actual = service.calculate (income, expenses, threshold);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    private int calculate(int income, int expenses, int threshold) {
    }

}
