package com.rosprom.truckapi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TruckapiApplication

fun main(args: Array<String>) {
    runApplication<TruckapiApplication>(*args)
}
