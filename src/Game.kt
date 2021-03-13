class Game {
    val path = mutableListOf<Direction>( Direction.START )

    val north = { Direction.NORTH }
    val south = { Direction.SOUTH }
    val east = { Direction.EAST }
    val west = { Direction.WEST }
    val end = { Direction.END; println("Game Over: $path"); path.clear(); false }
}