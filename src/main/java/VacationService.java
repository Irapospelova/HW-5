public class VacationService {
    public int calculate(int income, int expenses, int threshold) {
       // income = 10_000;
       // expenses = 3_000;
       // threshold = 20_000;
        int count = 0;
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                count++;
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}

