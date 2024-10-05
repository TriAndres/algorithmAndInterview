package ru.yandex.practicum.interview.subject_1_JavaCore.question6;

public class Practicum {
}
/*
Дан enum Season, описывающий времена года. Проанализируйте его.
public enum Season {
    SPRING("Весна"),
    SUMMER("Лето"),
    AUTUMN("Осень"),
    WINTER("Зима");

    private String title;

    public Season(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

}
Выберите все варианты, которые позволят получить элемент, соответствующий времени года «осень».


Неправильный ответ
Season.valueOf("Осень").
Такой код не сработает. valueOf подразумевает, что переданная в аргументе строка должна совпадать с названием элемента enum-а.

Season.valueOf("AUTUMN").

Следующий код.
    Arrays.stream(Season.values())
            .filter((season) -> season.getTitle() == "Осень")
            .findFirst()
            .get();


Правильный ответ
Season.values()[2].
Вы выбрали не все правильные ответы
 */
