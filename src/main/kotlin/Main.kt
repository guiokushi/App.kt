import dao.AvaliacaoDAO
import dao.JogoDAO
import dao.ReviewDAO
import dao.UsuarioDAO
import models.Avaliacao
import models.Jogo
import models.Review
import models.Usuario


fun main(args: Array<String>) {
    val avaliacaoDAO = AvaliacaoDAO()
    //avaliacaoDAO.inserirUm(Avaliacao(0,5,1,10102021))
//    userDAO.atualizar(Usuario(2,"Sabio","sabio@sabio","12313"))
    avaliacaoDAO.deletar(2)
//    userDAO.inserirVarios(listOf(Usuario(0,"Jorge","jorge@amado","amadoJorge123"),Usuario(0,"Mario","mario@armario","Peach123")))
    var avaliacoes = avaliacaoDAO.pegarTodos()
    for (avalia in avaliacoes){
        println(avalia)
    }
}