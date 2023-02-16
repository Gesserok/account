package org.fop.account.dto

data class TestControllerResponse(
    val msg: String = "Hello from Account Service",
    val ip: String,
    val amount: String = "You have got a lot of money"
)
