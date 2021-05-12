package ru.netology

fun main() {
    var totalAmount: Double = 500_000.0     //всё в копейках
    val firstDiscount = 10000        //первая скидка в 100р
    val secondDiscount = 0.05         //скидка в 5%
    val regularCustomer: Boolean = true    //постоянный покупатель или нет
    val regularCustomerDiscount = 0.01    //скидка постоянного покупателя 1%
    if (totalAmount in 0.0..1000.0) {
        if (regularCustomer) {
            totalAmount -= (totalAmount * regularCustomerDiscount)
            convertationInRubles(totalAmount)
        } else convertationInRubles(totalAmount)
    } else if (totalAmount in 100_001.0..1_000_000.0) {
        if (regularCustomer) {
            totalAmount -= firstDiscount
            totalAmount -= (totalAmount * regularCustomerDiscount)
            convertationInRubles(totalAmount)
        } else {
            totalAmount -= firstDiscount
            convertationInRubles(totalAmount)
        }
    } else if (totalAmount >= 1_000_001) {
        if (regularCustomer) {
            totalAmount -= (totalAmount * secondDiscount)
            totalAmount -= (totalAmount * regularCustomerDiscount).toInt()
            convertationInRubles(totalAmount)
        } else {
            totalAmount -= (totalAmount * secondDiscount)
            convertationInRubles(totalAmount)
        }
    }
}

fun convertationInRubles(totalAmount: Double) {
    val convertation: Int = totalAmount.toInt()
    val totalAmountInRubles: Double = convertation / 100.0
    println("Ваша сумма после применения скидок $totalAmountInRubles рублей")
}