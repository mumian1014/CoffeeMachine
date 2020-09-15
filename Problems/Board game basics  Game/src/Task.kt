class PlayingField {
    companion object Size {
        var width:Int = 0
        var height:Int = 0
        fun changeSize(width:Int, height:Int) {
            PlayingField.width = width.coerceAtLeast(0)
            PlayingField.height = height.coerceAtLeast(0)
        }
    }
}