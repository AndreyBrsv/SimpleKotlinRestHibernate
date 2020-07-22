package io.entities.rq

import java.io.Serializable

data class GetPageRequest(
    var idFrom : Long,
    var limit : Int
) : Serializable {
}