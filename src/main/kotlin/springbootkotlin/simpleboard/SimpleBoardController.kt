package springbootkotlin.simpleboard

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("")
class SimpleBoardController {

    @GetMapping
    fun boardIndex(): String {
        return "Hi, I'm Simple Board Application"
    }
}