package ru.yandex.practicum.interview.subject_1_JavaCore.question15;

public class Practicum {
}
/*
Перед вами код класса, который хранит информацию о праздниках в разные времена года. Прочитайте его.
public class HolidayEvent {

    static HashMap<String, Set<HolidayEvent>> eventsBySeason = new HashMap();

    private String eventName;

    static {
        System.out.println("Static block initialization");
    }

    public HolidayEvent(String eventName) {
        Set<HolidayEvent> events = new HashSet<>();
        eventsBySeason.put("Весна", events);
        eventsBySeason.put("Лето", events);
        eventsBySeason.put("Осень", events);
        eventsBySeason.put("Зима", events);

        this.eventName = eventName;
    }

    public static void main(String[] args) {
        HolidayEvent birthday = new HolidayEvent("День рождения");
        HolidayEvent newYear = new HolidayEvent("Новый год");

        eventsBySeason.get("Осень").add(birthday);
        eventsBySeason.get("Зима").add(newYear);

    }
}
Выберите все проблемы, которые есть в этом коде.


Неправильный ответ
Статические переменные (в данном случае eventsBySeason) должны обязательно полностью инициализироваться при создании. Здесь этого не происходит, и инициализация вынесена в конструктор.
Статические переменные могут инициализироваться как при создании, так и в блоке static.

Статические переменные (в данном случае eventsBySeason) должны инициализироваться в блоке static. А здесь инициализация происходит в конструкторе.

При наличии статической переменной нельзя создавать два объекта класса HolidayEvent — код будет работать некорректно.

Хеш-таблица eventsBySeason объявлена как содержащая Set для каждого значения — однако, когда значения добавляются в неё, вместо Set передаётся HashSet.

Один и тот же Set<HolidayEvent> events кладётся в eventsBySeason для каждого ключа, а нужно создавать новый HashSet для каждого из них.
Вы выбрали не все правильные ответы
 */