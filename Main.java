import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        // =================================
        // ЗАДАНИЕ 1.1 — ТОЧКИ
        // =================================

        System.out.println("===== ЗАДАНИЕ 1.1: ТОЧКИ =====");

        Point point1 = new Point(3, 5);
        Point point2 = new Point(7, 2);
        Point point3 = new Point(10, 8);

        System.out.println("Первая точка: " + point1);
        System.out.println("Вторая точка: " + point2);
        System.out.println("Третья точка: " + point3);


        // =================================
        // ЗАДАНИЕ 1.3 — ИМЕНА
        // =================================

        System.out.println("\n===== ЗАДАНИЕ 1.3: ИМЕНА =====");

        Name name1 = new Name(null, "Клеопатра", null);
        Name name2 = new Name("Пушкин", "Александр", "Сергеевич");
        Name name3 = new Name("Маяковский", "Владимир", null);

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);


        // =================================
        // ЗАДАНИЕ 2.1 — ЛИНИИ
        // =================================

        System.out.println("\n===== ЗАДАНИЕ 2.1: ЛИНИИ =====");

        Point start1 = new Point(1, 3);
        Point end1 = new Point(23, 8);

        Point start2 = new Point(5, 10);
        Point end2 = new Point(25, 10);

        Line line1 = new Line(start1, end1);
        Line line2 = new Line(start2, end2);

        // Начало третьей линии совпадает с началом первой,
        // конец третьей линии совпадает с концом второй.
        Line line3 = new Line(line1.getStart(), line2.getEnd());

        System.out.println("Первая линия: " + line1);
        System.out.println("Вторая линия: " + line2);
        System.out.println("Третья линия: " + line3);

        // Изменяем координаты первой и второй линий.
        line1.getStart().setX(2);
        line1.getStart().setY(4);

        line2.getEnd().setX(30);
        line2.getEnd().setY(10);

        System.out.println("\nПосле изменения координат:");
        System.out.println("Первая линия: " + line1);
        System.out.println("Вторая линия: " + line2);
        System.out.println("Третья линия: " + line3);

        // Заменяем начало первой линии новой точкой.
        // Третья линия продолжает хранить старую точку.
        line1.setStart(new Point(100, 100));

        System.out.println("\nПосле замены начала первой линии:");
        System.out.println("Первая линия: " + line1);
        System.out.println("Третья линия: " + line3);


        // =================================
        // ЗАДАНИЕ 3.3 И 4.8 — ГОРОДА
        // =================================

        System.out.println("\n===== ЗАДАНИЯ 3.3 И 4.8: ГОРОДА =====");

        City A = new City("A");
        City B = new City("B");
        City C = new City("C");
        City D = new City("D");
        City E = new City("E");
        City F = new City("F");

        // Добавляем маршруты согласно схеме из задания.
        A.addRoute(F, 1);
        A.addRoute(D, 6);

        F.addRoute(B, 1);
        F.addRoute(E, 2);

        E.addRoute(D, 2);

        D.addRoute(C, 4);

        C.addRoute(B, 3);

        B.addRoute(A, 5);

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
        System.out.println(D);
        System.out.println(E);
        System.out.println(F);


        // =================================
        // ЗАДАНИЕ 5.5 — ДРОБИ
        // =================================

        System.out.println("\n===== ЗАДАНИЕ 5.5: ДРОБИ =====");

        Fraction f1 = new Fraction(1, 3);
        Fraction f2 = new Fraction(2, 3);
        Fraction f3 = new Fraction(3, 4);

        System.out.println("Первая дробь: " + f1);
        System.out.println("Вторая дробь: " + f2);
        System.out.println("Третья дробь: " + f3);

        // Сложение
        System.out.println(
                f1 + " + " + f2 + " = " + f1.sum(f2)
        );

        // Вычитание
        System.out.println(
                f1 + " - " + f2 + " = " + f1.minus(f2)
        );

        // Умножение
        System.out.println(
                f1 + " * " + f2 + " = " + f1.multiply(f2)
        );

        // Деление
        System.out.println(
                f1 + " / " + f2 + " = " + f1.div(f2)
        );

        // Операции с целыми числами
        System.out.println(
                f1 + " + 5 = " + f1.sum(5)
        );

        System.out.println(
                f1 + " - 5 = " + f1.minus(5)
        );

        System.out.println(
                f1 + " * 5 = " + f1.multiply(5)
        );

        System.out.println(
                f1 + " / 5 = " + f1.div(5)
        );

        // Выражение из условия лабораторной
        Fraction result = f1.sum(f2).div(f3).minus(5);

        System.out.println("\nРезультат выражения:");
        System.out.println("f1.sum(f2).div(f3).minus(5) = " + result);
    }
}