package example.com.plugins

import example.com.routes.randomRabbit
import io.ktor.server.application.*
import io.ktor.server.http.content.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        randomRabbit()

        // Serve static files from the 'resources/rabbits' directory
        static("/rabbits") {
            resources("rabbits")
        }
    }
}

