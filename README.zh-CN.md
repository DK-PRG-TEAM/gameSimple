[English](README.md) · **简体中文**

> 英文版是规范版本。本页与 [README.md](README.md) 不一致时，以英文版为准。

<!-- translation-of: README.md sha256:eb8d29d0507e696f -->

<!-- Source: Best-README-Template BLANK_README (Unlicense) — https://github.com/othneildrew/Best-README-Template -->
<a id="readme-top"></a>

# gameSimple

一个小型 Java 控制台程序：打印带编号的游戏菜单，并启动其中唯一的一个游戏——在二十次机会内猜出程序在 1 到 100 之间随机选定的数字，每猜一次都会提示猜大了还是猜小了。

[![CI](https://github.com/DK-PRG-TEAM/gameSimple/actions/workflows/ci.yml/badge.svg)](https://github.com/DK-PRG-TEAM/gameSimple/actions/workflows/ci.yml)
[![License](https://img.shields.io/github/license/DK-PRG-TEAM/gameSimple)](LICENSE)

[报告问题](https://github.com/DK-PRG-TEAM/gameSimple/issues/new?template=bug_report.yml) · [提出需求](https://github.com/DK-PRG-TEAM/gameSimple/issues/new?template=feature_request.yml)

<details>
  <summary>目录</summary>
  <ol>
    <li><a href="#about-the-project">关于本项目</a></li>
    <li><a href="#getting-started">开始使用</a></li>
    <li><a href="#usage">用法</a></li>
    <li><a href="#contributing">参与贡献</a></li>
    <li><a href="#license">许可证</a></li>
    <li><a href="#contact">联系方式</a></li>
  </ol>
</details>

## 关于本项目

这是一份 Java 课程作业，五个文件，没有任何框架。`src/Main.java` 创建一个玩家，
让 `src/Game.java` 打印游戏菜单，再把输入的编号交回去；`src/Game.java` 通过只有
一个方法的 `src/GameInterface.java` 来分发这个编号，因此要加第二个游戏，只需新增
一个类和一个菜单项，而不必改动分发逻辑。

唯一的游戏是 `src/Wordpuzzle.java`。虽然类名叫 Wordpuzzle、菜单项也写作猜字谜，
它实际实现的却是自身开头注释所描述的猜数字游戏：随机取 1 到 100 之间的整数，给
玩家二十次机会，每次回答猜大了还是猜小了，结束后再询问是否再来一局。玩家信息硬
编码在 `src/Main.java` 里，所以欢迎语中显示的姓名和学号属于当初写这个文件的人，
而不是正在游玩的人；程序的全部提示与输出均为中文。

计划中的功能与已知问题，见 [open issues](https://github.com/DK-PRG-TEAM/gameSimple/issues)。

## 开始使用

### 环境要求

- 一套 JDK，版本 17 或更高，提供 `javac` 与 `java`。`src/Game.java` 中 `switch`
  的箭头标签至少需要 Java 14，而 CI 工作流直接使用 GitHub 运行器自带的 JDK 编译。
- 除此之外别无要求。仓库里没有 Maven、Gradle 或 Ant 的构建文件，`javac` 与 `java`
  就是全部工具链，也没有任何需要下载的依赖。
- 终端需设置为 UTF-8，因为源文件和程序的全部输出都使用该编码。

### 安装

```sh
git clone https://github.com/DK-PRG-TEAM/gameSimple.git
cd gameSimple
javac -encoding UTF-8 -d build src/*.java
```

编译结果会留在 `build/` 目录下，这也是本项目产出的唯一构件。

## 用法

在编译输出所在的目录下运行 `Main` 类：

```sh
java -cp build Main
```

程序会打印菜单，等待输入游戏编号，然后启动对应的游戏。只有输入 `0` 才会真正启动
游戏；菜单、规则和每一条提示都是中文，一次会话大致是这样：

```text
0	猜字谜游戏
请输入游戏序号: 0
请输入一个数字: 50
你输入的数字大了!
请输入一个数字: 25
你输入的数字小了!
```

在结束时的提示处输入 `y` 再来一局，输入 `n` 结束。

## 参与贡献

欢迎参与。[CONTRIBUTING.md](CONTRIBUTING.md) 说明如何提交 issue 或 pull request，[CODE_OF_CONDUCT.md](CODE_OF_CONDUCT.md) 说明对所有参与者的行为要求。

请不要在公开的 issue 或 pull request 中报告安全问题。[SECURITY.md](SECURITY.md) 说明了私下报告的方式。

## 许可证

以 MIT 许可证分发。详见 [LICENSE](LICENSE)。

## 联系方式

项目地址：[https://github.com/DK-PRG-TEAM/gameSimple](https://github.com/DK-PRG-TEAM/gameSimple)

<p align="right">(<a href="#readme-top">back to top</a>)</p>
