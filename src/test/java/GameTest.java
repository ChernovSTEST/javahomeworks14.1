import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.netology.Game;
import ru.netology.NotRegisteredException;
import ru.netology.Player;

class GameTest {
    private Game game;
    private Player player1;
    private Player player2;
    private Player player3;

    @BeforeEach
    void setUp() {
        game = new Game();
        player1 = new Player(1, "John", 10);
        player2 = new Player(2, "Alice", 15);
        player3 = new Player(3, "Bob", 12);
    }

    @Test
    void testRound_Player1Wins() throws NotRegisteredException {
        game.register(player1);
        game.register(player2);

        int result = game.round("John", "Alice");

        Assertions.assertEquals(2, result);
    }

    @Test
    void testRound_Player2Wins() throws NotRegisteredException {
        game.register(player1);
        game.register(player2);

        int result = game.round("Alice", "John");

        Assertions.assertEquals(1, result);
    }

    @Test
    void testRound_Tie() throws NotRegisteredException {
        game.register(player1);
        game.register(player3);

        int result = game.round("John", "Bob");

        Assertions.assertEquals(2, result);
    }

    @Test
    void testRound_Player1NotRegistered() {
        game.register(player2);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("John", "Alice");
        });
    }

    @Test
    void testRound_Player2NotRegistered() {
        game.register(player1);

        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("John", "Alice");
        });
    }

    @Test
    void testRound_BothPlayersNotRegistered() {
        Assertions.assertThrows(NotRegisteredException.class, () -> {
            game.round("John", "Alice");
        });
    }
}
