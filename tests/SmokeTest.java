// A smoke test for the parts of the game that do not read from the console.
//
// There is no build tool and no test framework in this repository, so this is
// a plain class with a `main` that exits non-zero when something it checks is
// no longer true. Compile it against the classes built from `src/`, then run
// it; the CI workflow does exactly that.
//
//   javac -encoding UTF-8 -d build src/*.java
//   javac -encoding UTF-8 -cp build -d build tests/SmokeTest.java
//   java -ea -cp build SmokeTest
public class SmokeTest {

    private static int failures = 0;

    private static void assertThat(String what, boolean holds) {
        if (holds) {
            System.out.println("ok   - " + what);
        } else {
            System.out.println("FAIL - " + what);
            failures++;
        }
    }

    public static void main(String[] args) {
        Player player = new Player("Ada", "10000000001");
        assertThat("a player keeps the name it was constructed with", "Ada".equals(player.getName()));
        assertThat("a player keeps the id it was constructed with", "10000000001".equals(player.getID()));

        Game game = new Game(player);
        String[] menu = game.getGameLists();
        assertThat("the menu offers exactly one game", menu.length == 1);
        assertThat("the menu entry is not blank", menu[0] != null && !menu[0].trim().isEmpty());

        // Only entry 0 is dispatchable; anything else must be refused rather
        // than silently accepted, because Main feeds this whatever was typed.
        assertThat("a number past the end of the menu is refused", !game.startGameFromNumber(menu.length));
        assertThat("a negative number is refused", !game.startGameFromNumber(-1));

        GameInterface puzzle = new Wordpuzzle();
        assertThat("the puzzle is dispatchable through GameInterface", puzzle != null);

        if (failures > 0) {
            System.out.println(failures + " check(s) failed");
            System.exit(1);
        }
        System.out.println("all checks passed");
    }
}
