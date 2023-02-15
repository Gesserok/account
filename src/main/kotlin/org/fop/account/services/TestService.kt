package org.fop.account.services

import org.springframework.stereotype.Service
import java.net.Inet4Address

@Service
class TestService {

    fun getIp(): String {
        return Inet4Address.getLocalHost().hostAddress
    }
}