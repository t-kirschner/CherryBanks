import backend.Bank
import controlling.MVC


fun main() {
    val bank1 = Bank()
    val mvc = MVC(bank1)
    mvc.startBanking()
}

