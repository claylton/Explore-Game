class Game {
    val path = mutableListOf<Direction>( Direction.START )

    val north = { path.add(Direction.NORTH) }
    val south = { path.add(Direction.SOUTH) }
    val east = { path.add(Direction.EAST) }
    val west = { path.add(Direction.WEST) }
    val end = { path.add(Direction.END); println("\nGame Over: $path"); path.clear(); false }

    val location = Location()

    fun move(where: () -> Unit){
        where.invoke()
    }

    fun makeMove(char: String?){
        when(char){
            "n" -> move { north(); location.updateLocation(Direction.NORTH) }
            "s" -> move { south(); location.updateLocation(Direction.SOUTH) }
            "e" -> move { east(); location.updateLocation(Direction.EAST) }
            "w" -> move { west(); location.updateLocation(Direction.WEST) }
            else -> move { end() }
        }
    }
}