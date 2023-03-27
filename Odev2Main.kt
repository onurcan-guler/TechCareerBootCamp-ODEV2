package com.example.kotlindersler.nesne_tabanlı_programlama.genel
// Soru 1
fun main() {
    var deger = Odev2() // nesne oluşturdum.
    var celcius: Double = 45.6
    var fahrenheitKarsiligi = deger.donusumfahrenheit(celcius)
    println("derece $celcius : fahrenheit $fahrenheitKarsiligi")

// Soru 2
    deger.dikdortgenCevreHesaplama(6.2,10.6)

// Soru 3

    var faktoriyelSayisi = 5
    var faktoriyelSonuc =deger.faktoriyel(faktoriyelSayisi)
    println("faktoriyel sayısı $faktoriyelSayisi : $faktoriyelSonuc")
// soru 4

    var harfadeti = deger.harfsayisi("ahmet")


// Soru 5

    var kenarSayisi = 3
     var Sonuc = deger.icAcilarToplami(kenarSayisi)
    println("kenar sayısı : $kenarSayisi iç açılar toplamı : $Sonuc")
// soru 6

var gunSayisi = 10
    var maasSonuc = deger.maashesapla(gunSayisi)
    println("Toplam Maas : $maasSonuc")

// soru 7

var  kotamiktarı = 66
    val fatura = deger.internetücretihesapalama(kotamiktarı)
    println("fatura ucreti : $fatura , kota aşımı: ${kotamiktarı-50}")



}
