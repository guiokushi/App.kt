package dao

import models.Jogo
import java.sql.DriverManager

class JogoDAO : GenericoDAO {

    override fun pegarUm(id: Int): Any {
        var jogo : Jogo? = null
        //Cria uma conexão com o banco
        var connection : ConnectionDAO? = null
        try {
            connection = ConnectionDAO()
            val resultSet = connection.executeQuery("SELECT * FROM Jogo WHERE id = ${id};")
            while(resultSet?.next()!!){
                jogo = Jogo(
                    resultSet.getInt("id"),
                    resultSet.getString("nome"),
                    resultSet.getString("empresa"),
                    resultSet.getString("plataforma"),
                    resultSet.getInt("data_de_publicacao")
                )
                println("Jogo encontrado: ${jogo}")
            }
        }catch (exception: Exception){
            exception.printStackTrace()
        }finally {
            connection?.close()
        }
        return jogo!!

    }

    override fun pegarTodos(): List<Any> {
        val jogos = mutableListOf<Jogo>()
        var connection : ConnectionDAO? = null
        try {
            //Cria uma conexão com o banco
            connection = ConnectionDAO()
            val resultSet = connection.executeQuery("SELECT * FROM Jogo;")
            //Intera pelo resultado obtido
            while (resultSet?.next()!!) {
                jogos.add(
                    Jogo(
                        resultSet.getInt("id"),
                        resultSet.getString("nome"),
                        resultSet.getString("empresa"),
                        resultSet.getString("plataforma"),
                        resultSet.getInt("data_de_publicacao")
                    )
                )
            }

        }
        catch (exception:Exception){
            exception.printStackTrace()
        }
        finally {
            connection?.close()
        }
        return jogos
    }

    override fun inserirUm(objeto: Any) {
        TODO("Not yet implemented")
    }

    override fun inserirVarios(lista: List<Any>) {
        TODO("Not yet implemented")
    }

    override fun atualizar(objeto: Any) {
        TODO("Not yet implemented")
    }

    override fun deletar(id: Int) {
        TODO("Not yet implemented")
    }
}