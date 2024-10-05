package ru.yandex.practicum.interview.subject_1_JavaCore.question3;

public class Practicum {
}
/*
Что выведет этот код?

public static void main(String[] args) {
    IntWrapper int1 = new IntWrapper(5);
    IntWrapper int2 = new IntWrapper(5);

    System.out.println(int1 == int2);
    System.out.println(int1.equals(int2));
    System.out.println(int1.getValue() == int2.getValue());
}

static class IntWrapper {
    private Integer value;

    public IntWrapper(int value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IntWrapper that = (IntWrapper) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}



false, true, false.

Правильный ответ
false, true, true.

true, false, false.

true, true, true.
 */