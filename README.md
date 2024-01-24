## Задание 1 (обязательное)
_____________________________
Вам необходимо реализовать менеджер афиши для фильмов.  
В качестве объекта фильма можно взять объект строки — название фильма — или создать свой дата-класс.  

![img.png](img.png)

В этой задаче не нужно разделять менеджер и репозиторий — все фильмы должны храниться внутри массива в поле самого менеджера. Изначально, сразу после создания, менеджер не должен содержать фильмов.

Менеджер должен уметь выполнять следующие операции:

1. Добавление нового фильма.
2. Вывод всех фильмов в порядке добавления `(findAll)`.
3. Вывод максимально лимит* штук последних добавленных фильмов в обратном от добавления порядке `(findLast)`.  
*Сделайте так, чтобы по умолчанию выводилось последние 5 добавленных фильма, но при создании менеджера можно было указать другое число, чтобы, например, выдавать 7 или 3, а не 5. То есть у менеджера должно быть два конструктора: один без параметров, выставляющий лимит менеджера в 5, а другой с параметром, берущий значение лимита для менеджера из параметра конструктора.

Метод получения последних фильмов будет очень похож на тот, что был в лекции.  
Основное отличие в том, что вам в его начале надо будет вычислить правильный ожидаемый размер результирующего массива-ответа, а не просто брать длину массива, что лежит в поле.  
Сделать это можно, заведя целочисленную переменную, в которую вы сохраните желаемый размер создаваемого массива, вычислите с помощью условных операторов для неё значение, а затем только создадите массив, указав эту переменную как требуемый для него размер,  
например:
````java
...
??? resultLength;
if ??? {
resultLength = ???
} else {
resultLength = ???
}
??? result = new ???[resultLength];
for (???) {
// заполняем result из массива, что лежит в поле
// в обратном порядке
}
...
````
Не забывайте про использование отладчика для поиска проблем вашей реализации, если тесты проходить не будут.

Напишите необходимые, с вашей точки зрения, автотесты на различные состояния менеджера.  
Можно делать их не в одном файле.