#!/usr/bin/env kscript

println("Hello from Kotlin!")
for (arg in args) {
    println("arg: $arg")
}

Thread.sleep(10*1000)
println("Hello from Kotlin!")
