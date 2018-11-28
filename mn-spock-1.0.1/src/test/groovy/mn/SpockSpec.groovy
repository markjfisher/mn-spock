package mn

import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

@MicronautTest
class SpockSpec extends Specification {
    def 'it should compile'() {
        expect:
        true
    }
}
