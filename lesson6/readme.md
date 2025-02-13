На этом уроке смотрим новое

2) Подключаемся к базе через [Connections](https://www.instaclustr.com/support/documentation/postgresql/using-postgresql/connect-to-postgresql-with-java/). Нужно поднять посгрес в докер образе и создать к нему коннекшен. Смотри [пример](src/main/kotlin/school57kotlin2/demo/Main.kt)
3) Выбираем сущность с командного проекта, минимум c 3я полями. Создаем через Connection табличку и добавляем туда(Insert into ...) 3 записи этой сущности. После этого ищем (select where ...) по любому полю запись и превращаем ее в обычный объект. Возвращаем объект.
4) Смотрим на [Reflection](https://www.baeldung.com/kotlin/reflection#kotlin-reflection-enhancements) . [Видосик на ютубе](https://www.youtube.com/watch?v=hDs_LyBmhtc). В репе есть [пример использования](src/main/kotlin/school57kotlin2/demo/Reflection.kt)
5) Используя рефлексию пишем свой [hibernate](https://skillbox.ru/media/code/crudprilozhenie-na-hibernate-dlya-nachinayushchikh/). Пишем CRUD репозиторий для выбранной сущности в файле [MyRepository](src/main/kotlin/school57kotlin2/demo/MyRepository.kt)

Необязательное домашнее задание к 12:00 на 19.02:
Дописать CRUD репозиторий и проверить, что он работает в функции main используя все методы из репозитория