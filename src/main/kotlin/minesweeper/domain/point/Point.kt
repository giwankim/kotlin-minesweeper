package minesweeper.domain.point

sealed class Point(
    private val row: Int,
    private val col: Int,
) {
    init {
        require(row >= ZERO && col >= ZERO) { POINT_NEGATIVE_VALUE_EXCEPTION_MESSAGE }
    }

    companion object {
        private const val ZERO = 0
        private const val POINT_NEGATIVE_VALUE_EXCEPTION_MESSAGE = "좌표는 음수가 될 수 없습니다."
    }
}
