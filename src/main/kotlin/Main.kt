import models.Jogo
import models.Usuario
import java.sql.DriverManager

fun main(args: Array<String>) {

    val connection = DriverManager.getConnection("jdbc:mariadb://192.168.56.101:3306/application","admin","admin")
    val sqlStatement = connection.createStatement()
    val resultSet = sqlStatement.executeQuery("SELECT * FROM Usuario;")

    while (resultSet.next()){
        val user = Usuario(
            adsadad
            resultSet.getInt("id"),
            resultSet.getString("nome"),
            resultSet.getString("email"),
            resultSet.getString("senha"),
            //resultSet.getInt("data_de_publicação")
        )
        println("Jogo encontrado: ${user}")
    }
    resultSet.close()
    connection.close()
}