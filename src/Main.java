public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        // Задача №1

        int a = 100000;
        System.out.println("Значение переменной a с типом int равно " + a);
        byte b = 20;
        System.out.println("Значение переменной b с типом byte равно " + b);
        short c = -20000;
        System.out.println("Значение переменной c с типом short равно " + c);
        long d = 400000000L;
        System.out.println("Значение переменной d с типом long равно " + d);
        double e = 1.234;
        System.out.println("Значение переменной e с типом double равно " + e);
        float f = 1.1234567899F;
        System.out.println("Значение переменной f с типом float равно " + f);


        // Задача №2

        float t = 27.12F;
        long n = 987678965549L;
        float u = 2.786F;
        short w = 569;
        short q = -159;
        short y = 27897;
        byte g = 67;


        // Задача 3

        byte lpStudents = 23;
        byte asStudents = 27;
        byte eaStudents = 30;
        short allSheets = 480;
        short sheetsOfPaperPerPerson = (short) ((short) allSheets / (lpStudents + asStudents + eaStudents));
        System.out.println("На каждого ученика рассчитано " + sheetsOfPaperPerPerson + " листов бумаги");

        // Задача 4


        byte twoMinProd = 16;
        byte oneMinProd = (byte) (twoMinProd / 2);
        int TwentyMinProd = oneMinProd * 20;        // почему нельзя использовать тип short, получаеться неверное значение -96???
        System.out.println("За 20 минут машина произвела " + TwentyMinProd + " штук бутылок.");
        short oneDay = 24 * 60;
        short oneDayProd = (short) (oneDay * oneMinProd);
        System.out.println("За одни сутки машина произвела " + oneDayProd + " штук бутылок.");
        int threeDayProd = oneDayProd * 3;         // почему нельзя использовать тип short, получаеться неверное значение???
        System.out.println("За трое суток машина произвела " + threeDayProd + " штук бутылок.");
        int oneMonthProd = threeDayProd * 10;
        System.out.println("За месяц машина произвела " + oneMonthProd + " штук бутылок.");


        //  Задача 5
        byte allCans = 120;
        byte takesOneClass = 2 + 4;
        byte classes = (byte) (allCans / takesOneClass);
        byte whiteCans = 20 * 2;
        byte brownCans = 20 * 4;
        System.out.println("В школе где, " + classes + " классов, нужно " + whiteCans + " банок белой красски и " + brownCans + " банок коричневой краски.");


        // Задача 6


        short banana = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        short allWeightGramm = (short) (banana + milk + iceCream + eggs);
        float allWeightKg = (float) allWeightGramm / 1000;
        System.out.println("Вес спортивного завтрака в граммах равен " + allWeightGramm + ", а вес в килограммах равен " + allWeightKg);


        // Задача 7

        short needResetKillo = 7;
        int needResetGramm = needResetKillo * 1000;
        short minGrammPerDay = 250;
        short maxGrammPerDay = 500;
        int  ifMinGrammDay = needResetGramm / minGrammPerDay;
        int ifMaxGrammDay = needResetGramm / maxGrammPerDay;
        int avgDay = (ifMinGrammDay + ifMaxGrammDay) / 2;
        System.out.println("Если худеть по " + minGrammPerDay + " грамм, на это уйдет " + ifMinGrammDay+ " дней, если же худеть по " + maxGrammPerDay + " грамм, то на это уйдет " + ifMaxGrammDay + " дней. В среднем похудение займет " + avgDay+ " день.");


        // Задача 8

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        int mothOfYear = 12;
        float mashaSalaryUp =  (float) mashaSalary / 100 * 10;
        float denisSalaryUp =  (float) denisSalary / 100 * 10;
        float kristinaSalaryUp = (float) kristinaSalary / 100 * 10;
        float mashaNewMothSalary = mashaSalaryUp + mashaSalary;
        float denisNewMothSalary = denisSalaryUp + denisSalary;
        float kristinaNewMothSalary = kristinaSalaryUp + kristinaSalary;
        float mashaYearSalaryUp = mashaSalaryUp * mothOfYear;
        float denisYearSalaryUp = denisSalaryUp * mothOfYear;
        float kristinaYearSalaryUp = kristinaSalaryUp * mothOfYear;
        System.out.println("Маша теперь получает " + mashaNewMothSalary + " рублей. Годовой доход вырос на " + mashaYearSalaryUp + " рублей.");
        System.out.println("Денис теперь получает " + denisNewMothSalary + " рублей. Годовой доход вырос на " + denisYearSalaryUp + " рублей.");
        System.out.println("Кристина теперь получает " + kristinaNewMothSalary + " рублей. Годовой доход вырос на " + kristinaYearSalaryUp + " рублей.");















    }
}