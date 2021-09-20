import java.util.Scanner;

public class Branch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double [] area2 = new double[99]; // Нужен ли здесь массив или можно обойтись переменной??

        int s = 56400; // Стоимость квадратного метра по АЖП
        // нужно прописать условие если,  стоимость м2 < чем по АЖП

        System.out.println("Введите площадь квартиры");
        double area = scanner.nextDouble();


        // дописать условие если площадь квартиры больше или меньше чем субсидия АЖП


        System.out.println("Введите процентную ставку");
        double c = scanner.nextDouble();
        double pr = (c/100); // расчет процентов


        if (area <= 33) {

            area2[33] = (((area*s)*0.6)*(pr)); //Если вводиться < 33, в какую ячейку сохраняется значение??

            System.out.println("Сумма возврата за месяц " + (area2[33] / 12)  + " рублей");

            System.out.println("Сумма возврата за год " + area2[33] + " рублей");

            System.out.println("Сумма возврата за 5 лет " + (area2[33] * 60) + " рублей");


        } else if (area <= 42) {

            area2[42] = (((area*s)*0.6)*(pr));

            System.out.println("Сумма возврата за месяц " + (area2[42] / 12)  + " рублей");

            System.out.println("Сумма возврата за год " + area2[42] + " рублей");

            System.out.println("Сумма возврата за 5 лет " + (area2[42] * 60) + " рублей");

        } else if (area <= 54) {

            area2[54] = (((area*s)*0.6)*(pr));

            System.out.println("Сумма возврата за месяц " + (area2[54] / 12)  + " рублей");

            System.out.println("Сумма возврата за год " + area2[54] + " рублей");

            System.out.println("Сумма возврата за 5 лет " + (area2[54] * 60) + " рублей");

        } else if (area <= 72) {

            area2[72] = (((area*s)*0.6)*(pr));

            System.out.println("Сумма возврата за месяц " + (area2[72] / 12)  + " рублей");

            System.out.println("Сумма возврата за год " + area2[72] + " рублей");

            System.out.println("Сумма возврата за 5 лет " + (area2[72] * 60) + " рублей");

        } else if (area <= 90) {

            area2[90] = (((area*s)*0.6)*(pr));

            System.out.println("Сумма возврата за месяц " + (area2[90] / 12)  + " рублей");

            System.out.println("Сумма возврата за год " + area2[90] + " рублей");

            System.out.println("Сумма возврата за 5 лет " + (area2[90] * 60) + " рублей");

        }


    }
}

