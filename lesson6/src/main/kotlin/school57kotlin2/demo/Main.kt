package school57kotlin2.demo

import java.sql.DriverManager
import java.util.*



fun main() {


    val url = "jdbc:postgresql://localhost:5432/postgres"
    val props = Properties().apply {
        setProperty("user", "baeldung")
        setProperty("password", "baeldung")
    }

    DriverManager.getConnection(url, props).use { connection ->
        println(connection.metaData.databaseProductVersion)

        connection.createStatement().use { statement ->
            val rs = statement.executeQuery("SELECT 1+1;")

            rs.next()
            println(rs.getObject(1))
        }
    }
}


