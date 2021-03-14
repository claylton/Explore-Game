class Game {
    val path = mutableListOf<Direction>( Direction.START )

    val north = { path.add(Direction.NORTH) }
    val south = { path.add(Direction.SOUTH) }
    val east = { path.add(Direction.EAST) }
    val west = { path.add(Direction.WEST) }
    val end = { path.add(Direction.END); println("\nGame Over: $path"); path.clear(); false }

    fun move(where: () -> Unit){
        where.invoke()
    }

    fun makeMove(char: String?){
        when(char){
            "n" -> move { north() }
            "s" -> move { south() }
            "e" -> move { east() }
            "w" -> move { west() }
            else -> move { end() }
        }
    }
}