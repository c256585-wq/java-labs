public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException(
                    "Знаменатель не может быть равен нулю"
            );
        }

        this.numerator = numerator;
        this.denominator = denominator;
    }

    // Сложение с дробью
    public Fraction sum(Fraction other) {
        int newNumerator =
                numerator * other.denominator +
                        other.numerator * denominator;

        int newDenominator = denominator * other.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    // Сложение с целым числом
    public Fraction sum(int number) {
        return new Fraction(
                numerator + number * denominator,
                denominator
        );
    }

    // Вычитание дроби
    public Fraction minus(Fraction other) {
        int newNumerator =
                numerator * other.denominator -
                        other.numerator * denominator;

        int newDenominator = denominator * other.denominator;

        return new Fraction(newNumerator, newDenominator);
    }

    // Вычитание целого числа
    public Fraction minus(int number) {
        return new Fraction(
                numerator - number * denominator,
                denominator
        );
    }

    // Умножение на дробь
    public Fraction multiply(Fraction other) {
        return new Fraction(
                numerator * other.numerator,
                denominator * other.denominator
        );
    }

    // Умножение на целое число
    public Fraction multiply(int number) {
        return new Fraction(numerator * number, denominator);
    }

    // Деление на дробь
    public Fraction div(Fraction other) {
        if (other.numerator == 0) {
            throw new ArithmeticException("Деление на ноль");
        }

        return new Fraction(
                numerator * other.denominator,
                denominator * other.numerator
        );
    }

    // Деление на целое число
    public Fraction div(int number) {
        if (number == 0) {
            throw new ArithmeticException("Деление на ноль");
        }

        return new Fraction(numerator, denominator * number);
    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}