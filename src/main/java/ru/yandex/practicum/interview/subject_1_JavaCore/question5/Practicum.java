package ru.yandex.practicum.interview.subject_1_JavaCore.question5;

public class Practicum {
}
/*
Прочитайте код.
public static void main(String[] args) {
   try {
       int x = 5 / 0;
   } catch (RuntimeException e) {
       System.out.println("Runtime exception");
   } catch (ArithmeticException e2) {
       System.out.println("Arithmetic exception");
   } catch (Exception e3) {
       System.out.println("Some exception");
   }
}
Что этот код выведет при запуске, если при делении на
0
0 Java выбрасывает ArithmeticException?


Неправильный ответ
Runtime exception, поскольку ArithmeticException является RuntimeException и сработает первый catch-блок.
Так и было бы, если бы отсутствовал второй catch-блок ArithmeticException. Определение более специфичного блока после менее специфичного — синтаксическая ошибка.

Arithmetic exception, поскольку сработает наиболее специфичный catch-блок.

Some exception, поскольку сработает последний подходящий catch-блок.

Код не скомпилируется, поскольку второй catch-блок недостижим.
 */
