package ru.yandex.practicum.interview.subject_1_JavaCore.question10;

public class Practicum {
}
/*
Дана структура классов. Проанализируйте её.
class Book implements Serializable {
    String title;
    int publicationYear;
    Author author;

    public Book(String title, int publicationYear, Author author) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.author = author;
    }
}

class Bestseller extends Book {
    int rating;

    public Bestseller(String title, int publicationYear, Author author) {
        super(title, publicationYear, author);
    }
}

class Author {
    String surname;
    String name;
    int yearOfBirth;

    public Author(String surname, String name, int yearOfBirth) {
        this.surname = surname;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
    }
}
Выполнится ли этот код и почему?
Author tolstoy = new Author("Толстой", "Лев", 1885);
Bestseller book = new Bestseller("Война и мир", 1985, tolstoy);

ObjectOutputStream objectOutputStream = new ObjectOutputStream(
    new FileOutputStream("book.out"));
objectOutputStream.writeObject(book);
objectOutputStream.close();


Неправильный ответ
Да, код будет работать корректно.
Проверьте ещё раз, все ли классы, которые присутствуют в итоговом объекте book, реализуют интерфейс Serializable.

Нет, поскольку для корректной работы сериализации в классах должны быть имплементированы методы writeObject и readObject.

Нет, поскольку класс Author не реализует интерфейс Serializable.

Нет, поскольку класс Bestseller не реализует интерфейс Serializable.

Нет, поскольку во всех классах отсутствует конструктор без аргументов.
 */