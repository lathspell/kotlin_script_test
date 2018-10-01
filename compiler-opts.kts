#!/usr/bin/env kscript

@file:CompilerOpts("-jvm-target 1.8")
@file:KotlinOpts("-J-Xmx200m")
@file:DependsOn("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.7")

import com.fasterxml.jackson.databind.ObjectMapper

val json = ObjectMapper().writeValueAsString(args)
println("Commandline arguments as JSON: $json")
