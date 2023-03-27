package com.example.kotlindersler.nesne_tabanlı_programlama.genel

class Odev2 {

    // Soru 1 Dönüşüm Sorusu

    fun donusumfahrenheit(celcius: Double): Double {

        var donusumsonuc: Double = celcius * 1.8 + 32
        return donusumsonuc
    }

    // Soru 2 dikdörtgen çevresi

    fun dikdortgenCevreHesaplama(kisaKenar: Double, uzunKenar: Double) {

        var dikdortgenCevresi = kisaKenar * 2 + uzunKenar * 2

        println("Dikdörtgen Çevresi : $dikdortgenCevresi")

    }

    // 3. soru Faktoriyel
    fun faktoriyel(girilenSayi: Int): Int {

        var faktoriyelSonuc: Int = 1

        for (i in 1..girilenSayi) {

            faktoriyelSonuc = faktoriyelSonuc * i
        }
        return faktoriyelSonuc

    }

    //soru4 kelime içinde bulma
    fun harfsayisi(kelime: String) {
        val kelime = "ahmet" // kelimeyi değiştirmek istediğiniz kelimeyle değiştirin
        val harfSayilari = hashMapOf<Char, Int>()
        for (harf in kelime) {
            harfSayilari[harf] = harfSayilari.getOrDefault(harf, 0) + 1
        }
        for ((harf, sayi) in harfSayilari) {
            println("$harf: $sayi")
        }
    }

    //5. soru iç açılar toplamı
    fun icAcilarToplami(kenarSayisi: Int): Int {

        var Sonuç = (kenarSayisi - 2) * 180
        return Sonuç

    }

    // 6. soru maas hesaplama
    fun maashesapla(günSayisi: Int): Int {

        var maas = 0
        var gunlukCalismaSüresi = 8
        var gunlukCalismaSaatiUcreti = 10
        var mesaiSaatlikUcret = 20
        var topCalismaSaati = gunlukCalismaSüresi * gunlukCalismaSaatiUcreti
        var calismaSaati = 0
        var ekMesaiSaati = 0
        for (i in 1..topCalismaSaati) {
            if (i <= 160) {
                calismaSaati++
            } else {
                ekMesaiSaati++
            }
        }
        maas = (calismaSaati * gunlukCalismaSaatiUcreti) + (ekMesaiSaati * mesaiSaatlikUcret)
        return maas
    }

    fun internetücretihesapalama(kotaMiktarı: Int): Int {
        var faturaBedeli = 100
        var kota = 50
        var ilaveücret = 0
        var kotaAsimi = kotaMiktarı - kota
        for (x in 1..kotaAsimi) {
            ilaveücret = ilaveücret + 4
        }
        faturaBedeli = faturaBedeli + ilaveücret
        return faturaBedeli
    }

}