package example.micronaut

import io.micronaut.http.MediaType
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.annotation.Produces

@Controller("/hello") // <1>
class HelloController {

    @Get("/")  //
    @Produces(MediaType.TEXT_PLAIN)
    fun index(): String {
        return "Hello World"  // <4>
    }

    @Get("/dope")
    @Produces(MediaType.APPLICATION_JSON)
    fun dopeIndex(): String {
        return new Winner()
    }
}