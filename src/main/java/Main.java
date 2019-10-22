import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.example.BowlingScorecard;

@SpringBootApplication
public class Main implements CommandLineRunner {

    @Autowired
    private BowlingScorecard bowlingScorecard;

    @Override
    public void run(String... args) throws Exception {
        int[] scores = new int[21];
        bowlingScorecard.score(scores);
    }

    public static void main(String[] args) {
        SpringApplication.run(BowlingScorecard.class, args);
    }
}

