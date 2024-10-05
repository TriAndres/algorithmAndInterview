package ru.yandex.practicum.interview.subject_1_JavaCore.question11;

public class Practicum {
}
/*
Проанализируйте следующую структуру классов.
class Car {
    protected int productionYear;
    protected int power;

    public Car(int productionYear, int power) {
        this.productionYear = productionYear;
        this.power = power;
    }

    public boolean equals(Jeep jeep) {
        return productionYear == jeep.productionYear && power == jeep.power;
    }

    @Override
    public int hashCode() {
        return Objects.hash(productionYear, power);
    }
}

class Jeep extends Car {

    public Jeep(int productionYear, int power) {
        super(productionYear, power);
    }
}
Что выведет этот код и почему?
Jeep jeep1 = new Jeep(2020, 146);
Jeep jeep2 = new Jeep(2020, 146);

HashSet<Car> cars = new HashSet<>();
cars.add(jeep1);
cars.add(jeep2);

System.out.println("size: " + cars.size());


Неправильный ответ
size: 1 — HashSet внутри себя вызовет функцию equals, согласно определению которой jeep1 и jeep2 равны.
Обратите внимание, соответствует ли сигнатура функции equals, определённой в Car, той, что требует Java.

size: 2 — HashSet попытается вызвать функцию equals, но, поскольку jeep1 и jeep2 имеют тип данных Jeep, а не Car, функция equals, определённая в Car, не будет применена.

size: 2 — HashSet попытается вызвать функцию equals, но, так как функция equals, определённая в Car, не содержит аннотации @Override, она не будет распознана как equals и вызвана.

size: 2 — HashSet попытается вызвать функцию equals, но, так как функция equals, определённая в Car, принимает на вход Jeep, а не Object, она не будет распознана как equals и вызвана.
 */