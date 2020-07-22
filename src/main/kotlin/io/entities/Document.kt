package io.entities

import java.io.Serializable
import java.sql.Timestamp

data class Document(
    var id: Long,
    var number: Long,
    var openDate: Timestamp,
    var companyName: String,
    var inn : String,
    var kpp : String
) : Serializable {

    fun copy(): Document? {
        return Document(id, number, openDate, companyName, inn, kpp)
    }
}