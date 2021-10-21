import dao.JogoDAO
import models.Jogo
import models.Usuario
import java.sql.DriverManager

fun main(args: Array<String>) {
    val jogoDAO = JogoDAO()
    var jogos = jogoDAO.pegarTodos()
    //Intera pelo resultado obtido
    for (jogo in jogos){
        println(jogo)
    }
    var jogosum = jogoDAO.pegarUm(1)

}