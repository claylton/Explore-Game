fun main (){
    val game = Game()
    var run = true

    println(Location().currentLocation)
    while (run){
        print("Enter a direction: n/s/e/w or end to exit: ")
        val input = readLine()

        game.makeMove(input)

        if (!(input == "n" || input == "s" || input == "e" || input == "w")) run = false
    }

    println("\nObrigado por jogar o meu joguinho :D \n Feito por: Claylton Santos")

}