package mn

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus

@Controller("/controller")
class Controller {

    @Get("/")
    fun index(): HttpStatus {
        return HttpStatus.OK
    }
}