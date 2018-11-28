package mn

import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

@MicronautTest
class SpockSpeck extends Specification {
    def 'it should compile'() {
        expect:
        true
    }
}
