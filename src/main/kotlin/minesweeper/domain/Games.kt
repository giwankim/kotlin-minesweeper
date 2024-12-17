package minesweeper.domain

sealed interface Game {
    val board: Board
    val isOver: Boolean
}

class PlayableGame(
    override val board: PlayableBoard,
) : Game {
    override val isOver: Boolean get() = false
}

sealed interface CompletedGame : Game {
    override val isOver: Boolean get() = true
}

class PlayerWonGame(
    override val board: PlayerWonBoard,
) : CompletedGame

class MineDetonatedGame(
    override val board: MineDetonatedBoard,
) : CompletedGame
