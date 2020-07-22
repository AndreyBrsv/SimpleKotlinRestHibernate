package io.entities

import java.io.Serializable
import java.math.BigDecimal
import java.sql.Timestamp
import java.util.*

data class Transaction(
    var id: Long,
    var documentId: Long,
    var uuid: UUID,
    var time: Timestamp,
    var sum: BigDecimal,
    var fee: BigDecimal
) : Serializable {

    fun copy(): Transaction? {
        return Transaction(id, documentId, uuid, time, sum, fee)
    }
}