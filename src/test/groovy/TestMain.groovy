import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification

@SpringBootTest
class TestMain extends Specification{
    def "application starts up"() {
        expect: "application runs up without error"
        Main.main()
        true
    }
    def "application accepts valid arg list"() {
        expect: "application runs up without error"
        Main.main("0","0", "0","0", "0","0", "0","0", "0","0", "0","0", "0","0", "0","0", "0","0", "0","0")
        true
    }
}
