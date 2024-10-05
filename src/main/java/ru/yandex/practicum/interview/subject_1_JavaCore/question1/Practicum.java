package ru.yandex.practicum.interview.subject_1_JavaCore.question1;

public class Practicum {
    public static void main(String[] args) {
        System.out.println(calculate(1, 2, 3));

    }

    static int calculate(int a, int b, int c) {
        int max = a;
        if (b > a)
            System.out.println("b больше, чем a");
        max = b;
        if (c > max)
            return c;
        else
            return max;
    }
}
/*
Перед вами функция calculate, которая возвращает максимум из трёх чисел. Прочитайте её.
static int calculate(int a, int b, int c) {
        int max = a;
        if (b > a)
            System.out.println("b больше, чем a");
            max = b;
        if (c > max)
            return c;
        else
            return max;
    }
При каком вызове функция вернёт неверный результат?


calculate(1, 2, 3).

calculate(3, 2, 1).

calculate(3, 3, 3).

Неправильный ответ
Функция будет работать корректно для всех входных значений.
Подумайте о ситуации, в которой максимальное значение будет содержаться в переменной a.
 */