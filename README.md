<!-- Source: Best-README-Template BLANK_README (Unlicense) — https://github.com/othneildrew/Best-README-Template -->
<a id="readme-top"></a>

# gameSimple

A small Java console program that prints a numbered game menu and launches the one game it holds: guess a number the program picked at random between 1 and 100, within twenty tries, with a higher-or-lower hint after each guess.

**English** · [简体中文](README.zh-CN.md)

[![CI](https://github.com/DK-PRG-TEAM/gameSimple/actions/workflows/ci.yml/badge.svg)](https://github.com/DK-PRG-TEAM/gameSimple/actions/workflows/ci.yml)
[![License](https://img.shields.io/github/license/DK-PRG-TEAM/gameSimple)](LICENSE)

[Report a bug](https://github.com/DK-PRG-TEAM/gameSimple/issues/new?template=bug_report.yml) · [Request a feature](https://github.com/DK-PRG-TEAM/gameSimple/issues/new?template=feature_request.yml)

<details>
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#about-the-project">About The Project</a></li>
    <li><a href="#getting-started">Getting Started</a></li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#contributing">Contributing</a></li>
    <li><a href="#license">License</a></li>
    <li><a href="#contact">Contact</a></li>
  </ol>
</details>

## About The Project

This is a coursework exercise in Java, five files and no framework. `src/Main.java`
builds a player, asks `src/Game.java` to print its menu of games and passes back
whichever number was typed; `src/Game.java` dispatches that number through the
one-method `src/GameInterface.java`, so adding a second game means adding a class
and a menu entry rather than editing the dispatcher.

The single game is `src/Wordpuzzle.java`. Despite its name, and despite the menu
entry calling it a character-riddle game, what it implements is the number-guessing
game its own opening comment describes: it draws a random integer from 1 to 100,
gives the player twenty guesses, answers each one with higher or lower, and offers
a rematch at the end. The player is hard-coded in `src/Main.java`, so the name and
student id printed in the welcome line belong to whoever wrote the file rather than
to whoever is playing, and every prompt and message is in Chinese.

See the [open issues](https://github.com/DK-PRG-TEAM/gameSimple/issues) for planned features and known issues.

## Getting Started

### Prerequisites

- A JDK, version 17 or newer, providing `javac` and `java`. The arrow labels in
  the `switch` in `src/Game.java` need at least Java 14, and the CI workflow
  compiles with whichever JDK the GitHub runner already has.
- Nothing else. There is no Maven, Gradle or Ant file in the repository, so
  `javac` and `java` are the whole toolchain, and there are no dependencies to
  download.
- A terminal set to UTF-8, since the source files and all of the program's
  output are encoded that way.

### Installation

```sh
git clone https://github.com/DK-PRG-TEAM/gameSimple.git
cd gameSimple
javac -encoding UTF-8 -d build src/*.java
```

That leaves the compiled classes in `build/`, which is the only artifact the
project produces.

## Usage

Run the `Main` class from the directory you compiled into:

```sh
java -cp build Main
```

The program prints the menu, waits for a game number, and starts that game.
Entering `0` is the only number that starts anything; the menu, the rules and
every prompt are in Chinese, so a session reads like this:

```text
0	猜字谜游戏
请输入游戏序号: 0
请输入一个数字: 50
你输入的数字大了!
请输入一个数字: 25
你输入的数字小了!
```

Answer the closing prompt with `y` to play again or `n` to stop.

## Contributing

Contributions are welcome. Read [CONTRIBUTING.md](CONTRIBUTING.md) for how to open an issue or a pull request, and [CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) for the standards expected of everyone taking part.

Please do not report security issues in public issues or pull requests. [SECURITY.md](SECURITY.md) explains how to report them privately.

## License

Distributed under the MIT License. See [LICENSE](LICENSE) for details.

## Contact

Project link: [https://github.com/DK-PRG-TEAM/gameSimple](https://github.com/DK-PRG-TEAM/gameSimple)

<p align="right">(<a href="#readme-top">back to top</a>)</p>
