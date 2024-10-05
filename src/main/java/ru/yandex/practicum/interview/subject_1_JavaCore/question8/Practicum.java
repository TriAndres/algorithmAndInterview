package ru.yandex.practicum.interview.subject_1_JavaCore.question8;

public class Practicum {
}
/*
Прочитайте этот код.
public class MagicBox implements Comparable<MagicBox> {
    int value;

    public MagicBox(int value) {
        this.value = value;
    }

    @Override
    public int compareTo(MagicBox o) {
        if (value > o.value) {
            return 42;
        } else {
            return -42;
        }
    }
}
Можно ли использовать такую реализацию метода compareTo для сортировки массива элементов MagicBox по значению в возрастающем порядке и почему?


Да, метод compareTo реализован корректно, и элементы будут сортироваться в возрастающем порядке.

Нет, метод compareTo должен возвращать
42
42, если данный элемент меньше аргумента, а сейчас реализовано наоборот.

Неправильный ответ
Нет, метод compareTo должен обязательно возвращать
−
1
−1,
0
0 или
1
1.
Метод compareTo должен возвращать любое отрицательное, нулевое или любое положительное значение, если объект, соответственно, меньше объекта-аргумента, равен ему или больше его, — необязательно
−
1
−1 и
1
1.

Нет, метод compareTo должен возвращать
0
0 в некоторых случаях.
 */