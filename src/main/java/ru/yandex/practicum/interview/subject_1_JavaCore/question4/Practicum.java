package ru.yandex.practicum.interview.subject_1_JavaCore.question4;

public class Practicum {
}
/*
Дана функция crazyDivide. Прочитайте её.
public int crazyDivide(int a, int b) {
    try {
        return a / b;
    } catch (ArithmeticException e) {
        System.out.println("Так нельзя!");
    } finally {
        return -1;
    }
}
Что произойдёт при вызове этой функции с аргументами (4, 2)?


Неправильный ответ
Функция вернёт
2
2 — сработает первый return.
Спецификация Java гарантирует, что содержимое блока finally будет обязательно выполнено, поэтому после завершения блока try будет исполнена команда return -1.

Функция вернёт
−
1
−1 — сработает return из блока finally.

Код не скомпилируется.

Код скомпилируется, но произойдёт ошибка во время выполнения.
 */