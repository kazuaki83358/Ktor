package example.com.routes


import example.com.data.model.Rabbit
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

private  const val BASE_URL = "http://192.168.1.39:8080"

private val rabits = listOf(
    Rabbit("nihal","fudu rabbit","$BASE_URL/rabbits/rabbit1.jpg"),
    Rabbit("supper rabbit","supper rabbit","$BASE_URL/rabbits/rabbit2.jpg"),
    Rabbit("dupper rabbit","supper dupper rabbit","$BASE_URL/rabbits/rabbit3.jpg"),
    Rabbit("rabbit yadav","bihari rabbit","$BASE_URL/rabbits/rabbit4.jpg"),
    Rabbit("rabbit jatt","haryanvi rabbit","$BASE_URL/rabbits/rabbit5.jpg")
)
fun Route.randomRabbit() {
    get("/randomRabbit") {
        call.respond(
            HttpStatusCode.OK,
            rabits.random()
        )
    }
}
