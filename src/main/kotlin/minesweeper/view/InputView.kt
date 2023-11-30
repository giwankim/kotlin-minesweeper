package minesweeper.view

class InputView {
    fun getHeight(): Int {
        println("높이를 입력하세요.")
        return readln().toInt()
    }

    fun getWidth(): Int {
        println("너비를 입력하세요.")
        return readln().toInt()
    }

    fun getCountOfMine(): Int {
        println("지뢰는 몇 개인가요?")
        return readln().toInt()
    }
}
