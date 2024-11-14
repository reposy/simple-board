package springbootkotlin.simpleboard

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/board")
class SimpleBoardController {

    @GetMapping
    fun selectBoard(id: Long): String {
        return "Hi, I'm Simple Board Application"
    }

    @PostMapping
    fun insertBoard(): String {
        return ""
    }

    @PatchMapping
    fun updateBoard(): String {
        return ""
    }

    @PutMapping
    fun updateBoard(id: Long): String {
        return ""
    }


}