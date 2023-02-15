package org.fop.account.controllers

import org.fop.account.dto.TestControllerResponse
import org.fop.account.services.TestService
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController(
    val testService: TestService
) {

    @GetMapping("/", produces = [MediaType.APPLICATION_JSON_VALUE])
    fun test(): ResponseEntity<TestControllerResponse> {
        return ResponseEntity.ok().body(
            TestControllerResponse(
                ip = testService.getIp()
            )
        )
    }
}
