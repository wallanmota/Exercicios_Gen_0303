fun main() {
    /*
    Crie uma um programa para trabalhar com estoque de uma loja, o programa deverá
    trabalhar com Collection do tipo List do Kotlin para manipular os dados desse estoque, o
    programa deverá atender as seguintes funcionalidades:

    Armazenar dados da List
    Remover dados da list;
    Atualizar dados da list.
    Apresentar todos os dados da list.
     */

    val produtos = mutableListOf<String>()

    do{
        println("Digite a opção desejada: " +
                "\n1- Armazenar dados" +
                "\n2- Remover dados" +
                "\n3- Atualizar dados" +
                "\n4- Apresentar todos os dados" +
                "\n0- Sair: ")
        var menu = readLine()!!.toInt()
            while (menu <0 || menu >4) {
                println("Opção inválida")
                println(
                    "Digite a opção desejada: " +
                            "\n1- Armazenar dados" +
                            "\n2- Remover dados" +
                            "\n3- Atualizar dados" +
                            "\n4- Apresentar todos os dados" +
                            "\n0- Sair: "
                )
                menu = readLine()!!.toInt()
            }
        when(menu){
            1 ->{
                print("Digite o produto que deseja inserir: ")
                val produto = readLine()!!
                produtos.add(produto)
            }
            2 ->{
                print("Digite o produto que deseja remover: ")
                val produto = readLine()!!
                produtos.remove(produto)
            }
            3 ->{
                print("Digite o produto que deseja Atualizar: ")
                var produto = readLine()!!
                produtos.remove(produto)
                print("Digite o nome atualizado: ")
                produto = readLine()!!
                produtos.add(produto)
            }
            4 ->{
                println("\nOs produtos cadastrados são: \n$produtos\n")
            }
        }
    }while (menu != 0)
}