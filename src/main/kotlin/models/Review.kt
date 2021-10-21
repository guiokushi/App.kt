package models

data class Review(
    val id: Int,
    val texto: String,
    val idJogo: Int,
    val idUser: Int
)
