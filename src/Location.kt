import kotlin.math.absoluteValue

class Location(val width: Int = 4, val height: Int = 4) {

    val map = Array(width) { arrayOfNulls<String>(height) }

    var currentLocation = Pair(0,0)

    fun updateLocation (direction: Direction) {
        if(direction == Direction.NORTH){
            currentLocation = Pair(currentLocation.first, (currentLocation.second + 1).rem(height))
        } else if (direction == Direction.SOUTH){
            currentLocation = Pair(currentLocation.first, (currentLocation.second - 1).absoluteValue.rem(height))
        } else if (direction == Direction.EAST){
            currentLocation = Pair((currentLocation.first + 1).rem(width), currentLocation.second)
        } else if (direction == Direction.WEST){
            currentLocation = Pair((currentLocation.first - 1).absoluteValue.rem(width), currentLocation.second)

        }
        println(currentLocation)
    }

    init {
        map [0] [0] = "Você está no início de sua jornada. [n / e]"
        map [0] [1] = "A estrada se estende diante de você. Ela promete beleza e aventura. [n / s / e]"
        map [0] [2] = "A estrada ainda se estende diante de você. Chove e a água forma poças. [n / s / e]"
        map [0] [3] = "Está ficando muito mais frio e você gostaria de ter um casaco de lã. [s / e]"

        map [1] [0] = "O caminho estreito se estende diante de você. Você está feliz por estar a pé. [n / e / w]"
        map [1] [1] = "Está ficando mais quente. Você cheira a musgo e fezes de marmota. Você foi picado por um mosquito. [n / s / e / w]"
        map [1] [2] = "Você decide sentar-se de costas e deslizar por um vasto campo de neve. [n / s / e / w]"
        map [1] [3] = "Você escalou até o topo de uma montanha com neve e está gostando da vista. [w / s / e]"

        map [2] [0] = "Você cruza uma velha ponte de pedra. Você ouve o murmúrio da água. E outro som de resmungo. [n / e / w]"
        map [2] [1] = "Um troll de bridge aparece. Ele balança um porrete e exige ouro. Você dá a eles todas as suas moedas. [n / s / e / w]"
        map [2] [2] = "Está ficando mais frio. Uma densa névoa se aproxima. Você pode ouvir vozes estranhas. [n / s / e / w]"
        map [2] [3] = "Os contrafortes prometem uma jornada extenuante. Você percorre rochedos gigantescos. [s / e / w]"

        map [3] [0] = "Sua jornada continua. Uma raposa atravessa o caminho com uma galinha na boca. [n / e]"
        map [3] [1] = "À distância, você vê uma casa. Você quase tromba com um fazendeiro com uma espingarda grande. Eles não prestam atenção em você. [n / s / w]"
        map [3] [2] = "Está ficando quente, seco e muito, muito silencioso. Você pensa em água e gostaria de ter trazido um cantil. [n / s / w]"
        map [3] [3] = "Você alcançou o deserto infinito. Não há nada aqui além de dunas de areia. Você foi picado por uma pulga da areia. [s / w]"
    }
}