package ru.yandex.practicum.interview.subject_1_JavaCore.question7;

public class Practicum {
}
/*
Дан класс Book со следующей реализацией метода compareTo. Прочитайте его.
public class Book implements Comparable<Book> {
    private String title;
    private int numberOfPages;
    private int publicationYear;

    @Override
    public int compareTo(Book book) {
        if ((book.numberOfPages == numberOfPages)
            && (book.publicationYear == publicationYear)) {
                return 0;
            }
        if (book.numberOfPages > numberOfPages) {
            return 1;
        } else if (book.publicationYear > publicationYear) {
            return 1;
        }
        else return -1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return numberOfPages == book.numberOfPages && publicationYear == book.publicationYear;
    }
}
Какое из правил реализации функции compareTo здесь нарушено?


Неправильный ответ
Идемпотентность — при каждом вызове для одних и тех же a и b функция должна возвращать одинаковый результат.
Это условие здесь выполняется — функция всегда возвращает один и тот же результат для одинаковых входных значений.

Обратимость — если a.compareTo(b) > 0, то b.compareTo(a) < 0.

Транзитивность — если a.compareTo(b) > 0 и b.compareTo(c) > 0, то а.compareTo(c) > 0.

Консистентность c equals — a.compareTo(b) = 0 тогда и только тогда, когда a.equals(b) = true.
 */
