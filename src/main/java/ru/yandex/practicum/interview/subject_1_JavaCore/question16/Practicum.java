package ru.yandex.practicum.interview.subject_1_JavaCore.question16;

public class Practicum {
}
/*
Дан интерфейс Building, класс House, реализующий Building, и класс Street, представляющий собой набор нескольких Building.
interface Building {

}

class House implements Building {

}

class Street {
    String name;
    List<Building> buildingList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Building> getBuildingList() {
        return buildingList;
    }

    public void setBuildingList(List<Building> buildingList) {
        this.buildingList = buildingList;
    }
}
Также определён метод createStreet с использованием дженериков.
public static <T extends Building> Street createStreet(String name, T building1, T building2) {
    Street street = new Street();
    street.setName(name);
    street.setBuildingList(Arrays.asList(building1, building2));
    return street;
}
Во что будет преобразована сигнатура этого метода после компиляции?


public static Street createStreet(String name, T building1, T building2) — дженерики сохранятся после компиляции.

Неправильный ответ
public static Street createStreet(String name, Object building1, Object building2) — будет применено стирание типов, и все дженерики преобразуются в Object как базовый класс для всех объектов.
Дженерики преобразуются в Object, если границы дженерика не определены, либо в верхнюю границу дженерика, если она указана.

public static Street createStreet(String name, Building building1, Building building2) — будет применено стирание типов, и дженерики преобразуются в Building, поскольку это верхняя граница типа для дженерика.

public static Street createStreet(String name, House building1, House building2) — будет применено стирание типов, и дженерики преобразуются в House, поскольку это единственный существующий класс, имплементирующий Building.
 */