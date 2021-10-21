package models

import java.util.*

data class Avaliacao(
    val id: Int,
    val avaliacao: String,
    val idReview: Int,
    val data_de_postagem: Date
)
