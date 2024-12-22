package minesweeper.ui

import minesweeper.domain.ClosedEmptyCell
import minesweeper.domain.CompletedGame
import minesweeper.domain.MineDetonatedGame
import minesweeper.domain.MinedCell
import minesweeper.domain.OpenedEmptyCell
import minesweeper.domain.PlayableBoard
import minesweeper.domain.PlayableGame
import minesweeper.domain.PlayerWonGame

object ResultView {
    private val NEWLINE = System.lineSeparator()
    private const val GAME_START = "지뢰찾기 게임 시작"
    private const val SPACE = " "
    private const val CLOSED = "C"

    fun start() {
        println(NEWLINE + GAME_START)
    }

    fun render(game: PlayableGame) {
        game.board.render()
    }

    fun result(game: CompletedGame) {
        when (game) {
            is PlayerWonGame -> println("Won Game.")
            is MineDetonatedGame -> println("Lose Game.")
        }
    }

    private fun PlayableBoard.render() {
        val grid = toGrid()
        val rendered =
            buildString {
                grid.forEach { row ->
                    appendLine(row.joinToString(SPACE))
                }
            }
        println(rendered)
    }

    private fun PlayableBoard.toGrid(): List<List<String>> {
        val maxY = cells.keys.maxOf { it.y }
        val maxX = cells.keys.maxOf { it.x }
        return (0..maxY).map { y ->
            (0..maxX).map { x ->
                when (get(y, x)) {
                    is MinedCell, is ClosedEmptyCell -> CLOSED
                    is OpenedEmptyCell -> countMines(y, x).toString()
                    null -> error("정상적으로 판이 생성되었으면 도달할 수 없는 코드")
                }
            }
        }
    }
}
