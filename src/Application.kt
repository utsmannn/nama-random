package com.utsman

import User
import com.google.gson.FieldNamingPolicy
import generatePage1
import generatePage2
import generatePage3
import generatePage4
import io.ktor.application.*
import io.ktor.response.*
import io.ktor.request.*
import io.ktor.client.*
import io.ktor.client.engine.cio.*
import io.ktor.routing.*
import io.ktor.http.*
import io.ktor.gson.*
import io.ktor.features.*

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {
    val client = HttpClient(CIO) {
    }

    install(ContentNegotiation) {
        gson {
            this.setLenient()
            this.setPrettyPrinting()
            this.setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
            this.serializeNulls()
        }
    }

    install(CORS) {
        method(HttpMethod.Options)
        method(HttpMethod.Put)
        method(HttpMethod.Delete)
        method(HttpMethod.Patch)
        header(HttpHeaders.Authorization)
        header("MyCustomHeader")
        allowCredentials = true
        anyHost() // @TODO: Don't do this in production if possible. Try to limit it.
    }

    routing {
        get("/") {
            call.respondText("HELLO WORLD!", contentType = ContentType.Text.Plain)
        }

        get("/json/gson") {
            call.respond(mapOf("hello" to "world"))
        }

        get("/name") {
            when (call.parameters["page"]?.toIntOrNull()) {
                1 -> call.generateResponsePage(generatePage1)
                2 -> call.generateResponsePage(generatePage2)
                3 -> call.generateResponsePage(generatePage3)
                4 -> call.generateResponsePage(generatePage4)
                else -> call.respond(Response(success = false, data = null))
            }
        }
    }
}

data class Response(
    val success: Boolean = true,
    val totalPage: Int = 4,
    val data: List<User>? = null
)

suspend fun ApplicationCall.generateResponsePage(list: List<User>) {
    respond(Response(data = list))
}

