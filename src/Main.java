public class Main {
    public static void main(String[] args) {
byte booksNumber = 100;
        System.out.println("Значение переменной booksNumber с типом byte равно " + booksNumber);
        short year = 2023;
        System.out.println("Значение переменной booksNumber с типом short равно " + year);
        int flatPrice = 9700000;
        System.out.println("Значение переменной booksNumber с типом int равно " + flatPrice);
        long sunDistance = 149597870700L;
        System.out.println("Значение переменной booksNumber с типом long равно " + sunDistance);
        float pi = 3.14f;
        System.out.println("Значение переменной booksNumber с типом float равно " + pi);
        double exactPi = 3.141592653589793238462643;
        System.out.println("Значение переменной booksNumber с типом double равно " + exactPi);
    float a = 27.12f;
    long b = 987678965549L;
    float c = (float) 2.786;
    short d = 569;
    short e = -159;
    short f = 27897;
    byte g = 67;
    byte class1 = 23;
    byte class2 = 27;
    byte class3 = 30;
    int totalStudents = (short) (class1 + class2 + class3);
    short totalLists = 480;
    int listsForOneStudent = totalLists / totalStudents;
    System.out.println("На каждого ученика рассчитано " + listsForOneStudent + " листов бумаги");
byte speed = 16 / 2;
int bottlesBefore20min = speed * 20;
System.out.println("За 20 минут машина произвела " + bottlesBefore20min + " штук бутылок");
        int bottlesBefore1day = speed * 1440;
        System.out.println("За сутки машина произвела " + bottlesBefore1day + " штук бутылок");
        int bottlesBefore3days = bottlesBefore1day * 3;
        System.out.println("За 3 дня машина произвела " + bottlesBefore3days + " штук бутылок");
        int bottlesBefore1month = bottlesBefore1day * 31;
        System.out.println("За месяц машина произвела " + bottlesBefore1month + " штук бутылок");
 byte whiteColorOnClass = 2;
 byte brownColorOnClass = 4;
 byte totalColors = 120;
 int classes = totalColors /(whiteColorOnClass+brownColorOnClass);
int totalwhitecolors = classes * whiteColorOnClass;
int totalbrowncolors = classes * brownColorOnClass;
System.out.println("В школе, где " + classes + " классов, нужно " + totalwhitecolors + " банок белой краски и " + totalbrowncolors + " банок коричневой краски");

byte bananaWeight = 80;
byte milkWeight100Gramm = 105;
byte iceCreamWeigt = 100;
byte eggWeigt = 70;
int breakfastWeight = (bananaWeight * 5) + (milkWeight100Gramm * 2) + (iceCreamWeigt * 2) +(eggWeigt * 4);
System.out.println("Вес спортзавтрака " + breakfastWeight + " грамм");
float breakfastWeightKg = breakfastWeight / 1000f;
        System.out.println("Вес спортзавтрака " + breakfastWeightKg + " килограмм");

        byte fat = 7;
        short loose1 = 250;
        short loose2 = 500;
        int daysLoose1 = fat * 1000 / loose1;
        System.out.println("Если спортсмен будет терять по " + loose1 + " грамм, то на похудение уйдет " + daysLoose1 + " дней.");
        int daysLoose2 = fat * 1000 / loose2;
        System.out.println("Если спортсмен будет терять по " + loose2 + " грамм, то на похудение уйдет " + daysLoose2 + " дней.");
 int dayLoose = (daysLoose1 + daysLoose2) / 2;
 System.out.println("В среднем на похудение уйдет " + dayLoose + " день");

 int salary1 = 67760;
 int newSalary1 =  (salary1 / 100) * 110;
 int yearSalaryDif1 =  (newSalary1 * 12 ) - (salary1 * 12);

        System.out.println("Маша теперь получает " + newSalary1 + " рублей. Годовой доход вырос на " + yearSalaryDif1 + " рублей.");
        int salary2 = 83690;
        int newSalary2 =  (salary2 / 100) * 110;
        int yearSalaryDif2 =  (newSalary2 * 12 ) - (salary2 * 12);

        System.out.println("Денис теперь получает " + newSalary2 + " рублей. Годовой доход вырос на " + yearSalaryDif2 + " рублей.");
        int salary3 = 76230;
        int newSalary3 =  (salary3 / 100) * 110;
        int yearSalaryDif3 =  (newSalary3 * 12 ) - (salary3 * 12);

        System.out.println("Кристина теперь получает " + newSalary3 + " рублей. Годовой доход вырос на " + yearSalaryDif3 + " рублей.");
    }
}