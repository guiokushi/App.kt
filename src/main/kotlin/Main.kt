import dao.JogoDAO
import dao.UsuarioDAO
import models.Jogo
import models.Usuario


fun main(args: Array<String>) {
    val userDAO = UsuarioDAO()
//    userDAO.inserirUm(Usuario(0,"Guilherme","gui@gui.com","senha123"))
//    userDAO.atualizar(Usuario(2,"Sabio","sabio@sabio","12313"))
//    userDAO.deletar(2)
    userDAO.inserirVarios(listOf(Usuario(0,"Jorge","jorge@amado","amadoJorge123"),Usuario(0,"Mario","mario@armario","Peach123")))
    var usuarios = userDAO.pegarTodos()
    for (usuario in usuarios){
        println(usuario)
    }
}