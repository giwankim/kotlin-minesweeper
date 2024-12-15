package minesweeper.domain

class Board(
    val cells: Map<Coordinate, Cell>,
) {
    init {
        require(cells.isNotEmpty()) { "빈 판을 생성할 수 없다" }
    }

    fun countMines(coordinate: Coordinate): Int =
        coordinate
            .neighbors
            .count { cells[it] is MinedCell }
}
