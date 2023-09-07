package A.dateTask;

public class PrintPalindromeDates {
    public void palindromeDates(int startYear, int endYear) {
        for (int year = startYear; year <= endYear; year++) {
            for (int month = 1; month <= 12; month++) {
                for (int day = 1; day <= 31; day++) {
                    String date = "" + year +
                            (month < 10 ? "0" + month : month) +
                            (day < 10 ? "0" + day : day);

                    String reversedDate = new StringBuilder(date).reverse().toString();
                    if (date.equals(reversedDate)) {
                        System.out.println(date);
                    }
                }
            }
        }
    }
}
