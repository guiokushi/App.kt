import dao.JogoDAO
import models.Jogo


fun main(args: Array<String>) {
    val jogoDAO = JogoDAO()
//    jogoDAO.inserirUm(Jogo(0,"Pokemon","Santo Monica Studios","Playstation",22032005))
//    jogoDAO.atualizar(Jogo(3,"Coelho Sabido", "Nao sei","Nao faco ideia", 124563))
//    jogoDAO.deletar(5)
    jogoDAO.inserirVarios(listOf(Jogo(0,"Pokemon","Pokemon Company","Nintendo Consoles",22032005),Jogo(0,"Trackmania","Nadeo","PC",1120235)))
    var jogos = jogoDAO.pegarTodos()
    for (jogo in jogos){
        println(jogo)
    }
}