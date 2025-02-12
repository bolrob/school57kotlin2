package school57kotlin2.demo

import java.sql.Connection

class MyRepository<T : Any>(
    val connection: Connection,
) {

    inline fun <reified T : Any> create(obj: T): T {
        //return T::class.primaryConstructor!!.call(....)
        TODO()
    }

    inline fun <reified T : Any> read(id: Long): T {
        TODO()
    }

    inline fun <reified T : Any> update(obj: T): T {
        TODO()
    }

    inline fun <reified T : Any> delete(id: Long): T {
        TODO()
    }

}

fun main() {
    val connection: Connection = TODO()
    val repository = MyRepository<...>(connection)

    val entity = repository.create(...)
    repository.read(entity.id)
        ..
}