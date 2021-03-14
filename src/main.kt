fun main (){
    val game = Game()

    while (true){
        print("Enter a direction: n/s/e/w or end to exit: ")
        val input = readLine()

        game.makeMove(input)

        if (!(input == "n" || input == "s" || input == "e" || input == "w")) break

        println(game.description() + "\n")

    }

    println("\nObrigado por jogar o meu joguinho :D \n Feito por: Claylton Santos")

}