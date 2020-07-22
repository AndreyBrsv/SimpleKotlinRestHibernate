package io.entities

import java.io.Serializable

data class PageableView<T : Serializable>(
    var entities : List<T>,
    var idFrom : Long,
    var lastId : Long,
    var limit : Int,
    var allIds : Int
) : Serializable