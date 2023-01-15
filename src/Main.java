public class Main {
    public static void main(String[] args)
    {
        System.out.println("Test Data - Year and is it a leap year: ");
        System.out.println("Year: 2018        " + IsLeapYear.isLeapYear(2018));
        System.out.println("Year: 2019        " + IsLeapYear.isLeapYear(2019));
        System.out.println("Year: 2020        " + IsLeapYear.isLeapYear(2020)); //This is a leap year
        System.out.println("Year: 2021        " + IsLeapYear.isLeapYear(2021));
        System.out.println("Year: 2022        " + IsLeapYear.isLeapYear(2022));
        System.out.println("Year: 2023        " + IsLeapYear.isLeapYear(2023));
        System.out.println("Year: 2024        " + IsLeapYear.isLeapYear(2024)); //This is a leap year
    }

    public static class IsLeapYear
    {
        public static boolean isLeapYear(int year)
        {
            if (year > 9999 || year < 0) return false;
            else
            {
                if (((year % 4) == 0) && (year % 100 == 0) && (year % 400 == 0)) return true;
                if (((year % 4) == 0) && (year % 100 != 0)) return true;
                else return false;
            }
        }
    }
}