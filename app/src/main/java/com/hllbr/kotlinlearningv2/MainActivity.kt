package com.hllbr.kotlinlearningv2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Değişken Türleri ==

        //Tam Sayılar Integer ifadeler


        var x = 5

        var y = 4

        var age = 35

        println(age/7*5)//Buradaki sonucu bir değişkenede atayabilirdim

        //Bir sonuç değişkeni yada sabiti tanımlayarak bu işleme eşitleyebilirdim

        val result = age/7*5

        println("final result "+result)
        //İşlemlerin sonuçlarıda deşikenlere yada sabitlere atanabiliyor


        //Tanımlama yapılırken değişkenin Tipini(Türünü) de belirleyebiliyorum

        val myInteger : Int//Benim myInteger adlı bir sabitim olacak ve bu integer bir değer alacak anlamına geliyor

        //Buradaki tanımlama Java ve C gibi dillere göre farklılık gösteriyor

        //Bu tanımlama yapıldıktan sonra myInteger ifadesine integer değerler hariç herhangi bir değer atayamam

        myInteger = 10
        //Burada değeri val oalrak tanımladığım için bunu bir sabit oalrak görecek ve ikinci birr tanımlamaya müsade etmeyecektir yani myInsteger ifadesine ben bir alt satırda 20 değerini atayamam

        //Değişkenlere Değerini atama işlemine INITİALİZE = BAŞLATMAK/DEGERİNİ ATAMAK denir ...


        var  myInteger2 : Int
        //Üst satırdaki işleme ise Defining = Tanımlamak denir.

        myInteger2 = 20//Bu ifadeyi alt satırlarda 30/40 ... gibi değerler atayarak değiştirebilirim.Çünkü bu ifadeyi variables = var olarak tanımladım bir kere

      //  myInteger2 = "hllbr"//Gibi bir tanımlama yapamam Bunun sebebi ise Başta tanımlama yani Defining alanında ifadenin Integer olduğunu belirtmiştim yani sadece tam sayılar kümesi ile değişkenin alacağı değerler kümesinin sınırladım

        //Burad yaptığım işlem ise bir yazıyı buna String denir değişkenime atamak bunu içerisinde bulunduğum dil kabul etmiyor.Buna yetkim yok

        val a: Int = 23 //INITIALİZE && DEFİNİNG

        println(a/2)//2 farklı integer değer ile yaptığımız işlemlerin sonucuda integer gelir normalde bu işlemin sonucu 11.5 fakat ben logOut ekranında 11 sonucunu göreceğim
        //Eğer değişkenlerden en az biri double/float yapılarında birinde tanımlanmış olsaydı sonuç 11.5 çıkacaktı

        //Experiments 2

        val b:Int = 23

        println("2 değerimi integer dışında bir veri tipinde belirterek yaptığım işlemin sonucu : "+23/2.0)

        






    }
}