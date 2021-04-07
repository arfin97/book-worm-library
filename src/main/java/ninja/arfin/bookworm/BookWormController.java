package ninja.arfin.bookworm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Responsibility
 *
 * @author Arfin
 * @since 07/Apr/21
 */
@RestController
public class BookWormController {

    @GetMapping("/")
    public String hello(){
        return "Hello world";
    }
}
