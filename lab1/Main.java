import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);

    // ЗАДАНИЕ 1. МЕТОДЫ
    // Вариант 5: 1, 2, 6, 7, 10

    // 1. Дробная часть
    public double fraction(double x) {
        return x - (int) x;
    }

    // 2. Сумма знаков
    public int sumLastNums(int x) {
        x = x < 0 ? -x : x;

        int last = x % 10;
        int secondLast = x / 10 % 10;

        return last + secondLast;
    }

    // 6. Большая буква
    public boolean isUpperCase(char x) {
        return x >= 'A' && x <= 'Z';
    }

    // 7. Диапазон
    public boolean isInRange(int a, int b, int num) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        return num >= a && num <= b;
    }

    // 10. Многократный вызов
    public int lastNumSum(int a, int b) {
        return a % 10 + b % 10;
    }

    // ЗАДАНИЕ 2. УСЛОВИЯ
    // Вариант 5: 1, 4, 5, 8, 9

    // 1. Модуль числа
    public int abs(int x) {
        if (x < 0) {
            return -x;
        }

        return x;
    }

    // 4. Строка сравнения
    public String makeDecision(int x, int y) {
        if (x > y) {
            return x + ">" + y;
        }

        if (x < y) {
            return x + "<" + y;
        }

        return x + "==" + y;
    }

    // 5. Тройной максимум
    public int max3(int x, int y, int z) {
        int max = x;

        if (y > max) {
            max = y;
        }

        if (z > max) {
            max = z;
        }

        return max;
    }

    // 8. Возраст
    public String age(int x) {
        int last = x % 10;
        int lastTwo = x % 100;

        if (last == 1 && lastTwo != 11) {
            return x + " год";
        }

        if ((last == 2 || last == 3 || last == 4)
                && lastTwo != 12
                && lastTwo != 13
                && lastTwo != 14) {
            return x + " года";
        }

        return x + " лет";
    }

    // 9. День недели
    public String day(int x) {
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }

    // ЗАДАНИЕ 3. ЦИКЛЫ
    // Вариант 5: 2, 3, 7, 8, 10

    // 2. Числа наоборот
    public String reverseListNums(int x) {
        String result = "";

        for (int i = x; i >= 0; i--) {
            result = result + i;

            if (i > 0) {
                result = result + " ";
            }
        }

        return result;
    }

    // 3. Четные числа
    public String chet(int x) {
        String result = "";

        for (int i = 0; i <= x; i += 2) {
            result = result + i;

            if (i + 2 <= x) {
                result = result + " ";
            }
        }

        return result;
    }

    // 7. Квадрат
    public void square(int x) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // 8. Левый треугольник
    public void leftTriangle(int x) {
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // 10. Угадайка
    public void guessGame() {
        int number = (int) (Math.random() * 10);
        int input;
        int attempts = 0;

        System.out.println("Я загадал число от 0 до 9.");

        do {
            System.out.print("Введите число от 0 до 9: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Ошибка! Введите целое число.");
                scanner.next();
                System.out.print("Введите число от 0 до 9: ");
            }

            input = scanner.nextInt();

            if (input < 0 || input > 9) {
                System.out.println("Ошибка! Число должно быть от 0 до 9.");
                continue;
            }

            attempts++;

            if (input != number) {
                System.out.println("Вы не угадали!");
            }

        } while (input != number);

        System.out.println("Вы угадали!");
        System.out.println("Количество попыток: " + attempts);
    }

    // ЗАДАНИЕ 4. МАССИВЫ
    // Вариант 5: 3, 4, 5, 6, 9

    // 3. Поиск максимального по модулю
    public int maxAbs(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (abs(arr[i]) > abs(max)) {
                max = arr[i];
            }
        }

        return max;
    }

    // 4. Добавление в массив
    public int[] add(int[] arr, int x, int pos) {
        int[] result = new int[arr.length + 1];

        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }

        result[pos] = x;

        for (int i = pos; i < arr.length; i++) {
            result[i + 1] = arr[i];
        }

        return result;
    }

    // 5. Добавление массива в массив
    public int[] add(int[] arr, int[] ins, int pos) {
        int[] result = new int[arr.length + ins.length];

        for (int i = 0; i < pos; i++) {
            result[i] = arr[i];
        }

        for (int i = 0; i < ins.length; i++) {
            result[pos + i] = ins[i];
        }

        for (int i = pos; i < arr.length; i++) {
            result[i + ins.length] = arr[i];
        }

        return result;
    }

    // 6. Реверс
    public void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    // 9. Все вхождения
    public int[] findAll(int[] arr, int x) {

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                count++;
            }
        }

        int[] result = new int[count];

        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                result[j] = i;
                j++;
            }
        }

        return result;
    }


    // ВСПОМОГАТЕЛЬНЫЕ МЕТОДЫ

    private int readInt(String message) {
        System.out.print(message);

        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Введите целое число.");
            scanner.next();
            System.out.print(message);
        }

        return scanner.nextInt();
    }

    private double readDouble(String message) {
        System.out.print(message);

        while (!scanner.hasNextDouble()) {
            System.out.println("Ошибка! Введите число.");
            scanner.next();
            System.out.print(message);
        }

        return scanner.nextDouble();
    }

    private int[] readArray() {
        int n = readInt("Введите размер массива: ");

        while (n <= 0) {
            System.out.println("Размер должен быть больше 0.");
            n = readInt("Введите размер массива: ");
        }

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = readInt("arr[" + i + "] = ");
        }

        return arr;
    }

    private void printArray(int[] arr) {
        System.out.print("[ ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("]");
    }

    // MAIN

    public static void main(String[] args) {

        Main program = new Main();

        System.out.println("");
        System.out.println("      ЛАБОРАТОРНАЯ №1");
        System.out.println("          ВАРИАНТ 5");

        // ЗАДАНИЕ 1

        System.out.println("\n========== ЗАДАНИЕ 1 ==========");

        double x = program.readDouble(
                "\n1. Дробная часть\nВведите x: "
        );
        System.out.println("Ответ: " + program.fraction(x));


        int number = program.readInt(
                "\n2. Сумма двух последних цифр\nВведите x: "
        );
        System.out.println(
                "Ответ: " + program.sumLastNums(number)
        );


        System.out.println("\n6. Большая буква");

        char letter;

        while (true) {
            System.out.print("Введите одну букву: ");
            String str = program.scanner.next();

            if (str.length() == 1) {
                letter = str.charAt(0);
                break;
            }

            System.out.println("Ошибка! Введите один символ.");
        }

        System.out.println(
                "Ответ: " + program.isUpperCase(letter)
        );


        System.out.println("\n7. Диапазон");

        int a = program.readInt("Введите a: ");
        int b = program.readInt("Введите b: ");
        int num = program.readInt("Введите num: ");

        System.out.println(
                "Ответ: " + program.isInRange(a, b, num)
        );


        System.out.println("\n10. Многократный вызов");

        int result = program.readInt("Введите первое число: ");

        for (int i = 2; i <= 5; i++) {
            int next = program.readInt(
                    "Введите число " + i + ": "
            );

            result = program.lastNumSum(result, next);
        }

        System.out.println("Итог: " + result);

        // ЗАДАНИЕ 2

        System.out.println("\n========== ЗАДАНИЕ 2 ==========");

        int absNumber = program.readInt(
                "\n1. Модуль числа\nВведите x: "
        );

        System.out.println(
                "Ответ: " + program.abs(absNumber)
        );


        System.out.println("\n4. Строка сравнения");

        int x1 = program.readInt("Введите x: ");
        int y1 = program.readInt("Введите y: ");

        System.out.println(
                "Ответ: " + program.makeDecision(x1, y1)
        );


        System.out.println("\n5. Тройной максимум");

        int x2 = program.readInt("Введите x: ");
        int y2 = program.readInt("Введите y: ");
        int z2 = program.readInt("Введите z: ");

        System.out.println(
                "Ответ: " + program.max3(x2, y2, z2)
        );


        System.out.println("\n8. Возраст");

        int age = program.readInt("Введите возраст: ");

        while (age < 0) {
            System.out.println("Возраст не может быть отрицательным.");
            age = program.readInt("Введите возраст: ");
        }

        System.out.println("Ответ: " + program.age(age));


        System.out.println("\n9. День недели");

        int day = program.readInt(
                "Введите номер дня (1-7): "
        );

        System.out.println(
                "Ответ: " + program.day(day)
        );

        // ЗАДАНИЕ 3

        System.out.println("\n========== ЗАДАНИЕ 3 ==========");

        System.out.println("\n2. Числа наоборот");

        int reverseNumber = program.readInt("Введите x: ");

        System.out.println(
                "Ответ: "
                        + program.reverseListNums(reverseNumber)
        );


        System.out.println("\n3. Четные числа");

        int evenNumber = program.readInt("Введите x: ");

        System.out.println(
                "Ответ: " + program.chet(evenNumber)
        );


        System.out.println("\n7. Квадрат");

        int squareSize = program.readInt(
                "Введите размер квадрата: "
        );

        System.out.println("Ответ:");

        program.square(squareSize);


        System.out.println("\n8. Левый треугольник");

        int triangleSize = program.readInt(
                "Введите высоту треугольника: "
        );

        System.out.println("Ответ:");

        program.leftTriangle(triangleSize);


        System.out.println("\n10. Угадайка");

        program.guessGame();

        // ЗАДАНИЕ 4

        System.out.println("\n========== ЗАДАНИЕ 4 ==========");

        System.out.println("\n3. Максимальное по модулю");

        int[] arr1 = program.readArray();

        System.out.print("Массив: ");
        program.printArray(arr1);

        System.out.println(
                "Ответ: " + program.maxAbs(arr1)
        );


        System.out.println("\n4. Добавление в массив");

        int[] arr2 = program.readArray();

        int value = program.readInt(
                "Введите число для вставки: "
        );

        int pos = program.readInt(
                "Введите позицию: "
        );

        while (pos < 0 || pos > arr2.length) {
            System.out.println("Неверная позиция.");

            pos = program.readInt(
                    "Введите позицию от 0 до "
                            + arr2.length + ": "
            );
        }

        int[] arr2Result = program.add(
                arr2, value, pos
        );

        System.out.print("Ответ: ");
        program.printArray(arr2Result);


        System.out.println("\n5. Добавление массива в массив");

        int[] arr3 = program.readArray();

        System.out.println("Введите вставляемый массив:");

        int[] insert = program.readArray();

        int pos2 = program.readInt(
                "Введите позицию: "
        );

        while (pos2 < 0 || pos2 > arr3.length) {
            System.out.println("Неверная позиция.");

            pos2 = program.readInt(
                    "Введите позицию от 0 до "
                            + arr3.length + ": "
            );
        }

        int[] arr3Result = program.add(
                arr3, insert, pos2
        );

        System.out.print("Ответ: ");
        program.printArray(arr3Result);


        System.out.println("\n6. Реверс");

        int[] arr4 = program.readArray();

        System.out.print("До: ");
        program.printArray(arr4);

        program.reverse(arr4);

        System.out.print("После: ");
        program.printArray(arr4);


        System.out.println("\n9. Все вхождения");

        int[] arr5 = program.readArray();

        int search = program.readInt(
                "Введите искомое число: "
        );

        int[] indexes = program.findAll(
                arr5, search
        );

        System.out.print("Ответ: ");
        program.printArray(indexes);


        System.out.println("       Конец лабы :)");

        program.scanner.close();
    }
}