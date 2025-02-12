package school57kotlin2.demo

import java.time.LocalDateTime
import kotlin.random.Random
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.primaryConstructor

class Foo(
    val b: Int,
    val t: String
)

fun main() {
    // Находим первичный конструктор у класса Foo
    val constructor = Foo::class.primaryConstructor!!

    // Вызываем конструктор. Имитируем строчку val instance =  Foo(Random.nextInt(), LocalDateTime.now().toString())
    val instance = constructor.call(Random.nextInt(), LocalDateTime.now().toString())

    // Находим все поля в классе Foo и итерируемся по ним
    Foo::class.declaredMemberProperties.forEach { properties ->

        // Выводим в консоль название, тип и значения поля
        println("${properties.name} : ${properties.returnType} = ${properties.get(instance)}")
    }
}