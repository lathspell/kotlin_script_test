#!/usr/bin/env kscript
//DEPS com.fasterxml.jackson.module:jackson-module-kotlin:2.9.7

import com.fasterxml.jackson.databind.ObjectMapper

val json = ObjectMapper().writeValueAsString(args)
println("Commandline arguments as JSON: $json")
