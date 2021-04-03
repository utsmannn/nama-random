import java.util.*

/**
 * source:
 * https://www.ibupedia.com/artikel/keluarga/445-nama-bayi-indonesia-yang-unik-dan-indah
 * */
val raw = """
    
    Abichandra – cahaya kecerdasan

    Abimana – anak laki-laki yang berbudi

    Abimanyu – anak dari Arjuna, bersifat pahlawan, tidak takut susah

    Abinaya - semangat 

    Abyasa – anak laki-laki yang cerdas

    Adhi – yang paling penting, sempurna

    Adika – anak pertama

    Adinata – yang paling unggul, dapat diandalkan 

    Adipramana – penguasa pertama

    Aditya – pertama, tampan, pintar, matahari

    Adiwangsa - mulia

    Agam – memiliki kekuatan

    Agnibrata – bertindak dengan hangat

    Agung – megah, mewah

    Aji – sakti, berharga

    Andaru - wahyu

    Andi - kuat

    Angkasa – langit

    Apta – cerdas

    Aradhana - perdamaian

    Ardhi - bumi

    Ardiyanto – tegas dan teguh pendirian

    Arga - gunung

    Arief – pintar, berpengetahuan luas, bijaksana

    Arjanta – selalu bergembira

    Arya - bangsawan

    Asmaralaya – anak dari surga

    Astaguna – yang selalu berbuat kebaikan

    Aswangga - gesit

    Perempuan

    Adiratna – batu pertama yang indah

    Adriani – kuat dan teguh

    Airani – berjiwa muda

    Amanda – perempuan yang penuh cinta

    Anatari – pemimpin yang jeli

    Anindya- sempurna

    Anjani - ketekunan

    April – yang lahir di Bulan April

    Arkadewi – bidadari yang memesona

    Aruna – merah, fajar

    Arsyana – selalu bergembira

    Asri – indah dan sedap dipandang

    Ayu – cantik 

    Ayudisha – dewi yang cantik

    Nama Bayi Indonesia dengan Awalan Huruf B
    Laki-laki

    Bagas – kuat dan teguh

    Bagaskoro – matahari yang bersinar

    Bajradaka – air intan

    Bakti – kasih, setia

    Bamantara – penguasa udara

    Bambang - ksatria

    Banyu – air

    Baskoro – matahari di tengah hari

    Basuki – orang yang selamat

    Baswara - bercahaya

    Batara – raja yang berkuasa

    Bayu – angin yang berhembus

    Bhagawanta – untung dan sejahtera

    Bhanu – cahaya yang terang

    Bimo – luar biasa

    Birawa - dahsyat

    Bisma – luar biasa

    Brahma – dewa pencipta alam

    Bramantya - semangat

    Brawijaya – yang mulia raja wijaya

    Buana – jagad raya

    Budi – akhlak, perilaku

    Budiono – anak laki-laki yang baik budinya

    Perempuan

    Bandiani – kesejukan

    Banurasmi – surya

    Basagita – orang yang tutur katanya indah

    Batari – wajahnya seperti bidadari

    Binar – bersinar

    Bintang – bintang

    Bratarini – yang tingkah lakunya baik

    Bulan – penerang

    Nama Bayi Indonesia dengan Awalan Huruf C
    Laki-laki

    Cakra – roda, lingkaran

    Cakrawala – tempatnya bintang-bintang

    Candra – bulan, bersinar lembut

    Cipta – anak laki-laki yang baik hati, menciptakan

    Perempuan

    Cahaya – yang menerangi, kilau cahaya

    Calya – tanpa cacat

    Candramaya – cantik bagai bulan purnama

    Cempaka – nama bunga

    Citra – sempurna

    Citta – pikiran

    Cyntia – anak yang ayu

    Nama Bayi Indonesia dengan Awalan Huruf D
    Laki-laki

    Damar – yang menerangi 

    Daniswara – yang mulia

    Danurdara – diharapkan tumbuh menjadi orang yang berpengetahuan

    Darsa – keinginan 

    Dewangga – tubuh sang dewa

    Dharma – kebenaran

    Dipa – cahaya, raja

    Dimas – yang tersayang

    Dirga - udara

    Perempuan

    Danastri – anak yang cantik

    Danurdara – kaya akan ilmu 

    Dewi – dewi, penguasa

    Dhatu – anak yang anggun seperti ratu

    Diajeng – yang tersayang

    Dianti – istimewa

    Diatmika – yang baik hatinya dan 

    Ditya – anak yang punya kelebihan

    Dwi - dua

    Nama Bayi Indonesia dengan Awalan Huruf E
    Laki-laki

    Edi – sedap dipandang

    Endaru - kuat

    Estu – sungguh-sungguh

    Endang - menawan

    Perempuan

    Elok - cantik

    Erina – punya ketajaman

    Estiana – memiliki cita-cita

    Nama Bayi Indonesia dengan Awalan Huruf F
    Laki-laki

    Fadh – sosok yang kuat dan tegas

    Fadhly – anak laki-laki yang terakhir

    Fajar – cahaya kemerahan di langit di saat matahari akan terbit

    Perempuan

    Fitri – suci, bersih

    Nama Bayi Indonesia dengan Awalan Huruf G
    Laki-laki

    Gadhing – laki-laki yang kukuh

    Ganendra – pasukan dewa

    Gardara – berjiwa pengawal

    Gentala - naga

    Galih - hati

    Ganesh - penguasa

    Gibran – yang terbaik

    Gilang – laki-laki yang teguh

    Guinandra - sentosa

    Gumelar – laki-laki yang berterus terang

    Gunawan – laki- laki yang berguna

    Guntur – guruh, suara yang menggelegar

    Guritno – seseorang yang puitis

    Gusti – yang berkuasa, seorang pemimpin

    Perempuan

    Gadis – anak perempuan yang beranjak dewasa

    Gahyaka – nama pujian

    Gantari – menyinari

    Garini – istri yang baik

    Gayatri – memiliki tiga kekuatan

    Gema – suara yang membahana

    Gemani – bersuara tajam

    Gemintang – susunan bintang

    Gempita - meriah

    Genta – lonceng 

    Ginanita – menghitung

    Gyandra – keturunannya nampak

    Nama Bayi Indonesia dengan Awalan Huruf H
    Laki-laki

    Hadi – petunjuk jalan

    Hakim - adil

    Halim – jantan

    Hamdan – terpuji

    Hanafi – lurus

    Handaru - wahyu

    Hapsari - perhiasan

    Hardana – seseorang yang dimuliakan

    Haribawa – pembawa kebahagiaan

    Haris – tertata

    Harjita – hidup bermanfaat

    Hartadi – harta yang indah

    Hartanto – bergelimang harta

    Haryanto – api

    Hasta - delapan

    Hendro – bergaris emas

    Herdian – diharapkan menjadi orang yang mulia

    Herjuno – sangat sopan

    Henry – yang berkuasa di rumah

    Hery - kekuatan

    Perempuan

    Haira – intan

    Hanasta - menguasai

    Hanna – dambaan

    Harini – kelak menjadi pribadi yang cantik nan lembut

    Hasana – nantinya akan berbahagia

    Hasya – keceriaan

    Hayu – cantik

    Nama Bayi Indonesia dengan Awalan Huruf I
    Laki-laki

    Ihsan – kesempurnaan

    Indra – yang diberikan kebijaksanaan dan kemuliaan

    Ismoyono – teguh, bijaksana

    Perempuan

    Ika – anak pertama

    Ina – matahari di sore hari

    Indah – sedap dipandang, cantik, elok

    Indira – anak yang membawa kejayaan dan kekayaan bagi keluarga

    Indri – cantik

    Indriaya – pembawa kebahagiaan

    Intan – batu permata

    Istari – bercita-cita tinggi

    Isthika – orang yang berkeinginan

    Isty – nantinya akan menjadi orang yang baik

    Iswari – akan menjadi orang yang terhormat

    Nama Bayi Indonesia dengan Awalan Huruf J
    Laki-laki 

    Jamal – indah, rupawan

    Janu – yang pikirannya jauh ke depan

    Jati – pohon kayu yang sangat kuat

    Jatmika – berbudi luhur, sopan santun 

    Jaya – luar biasa

    Jenaka – penuh humor

    Jenggala – hutan rimba

    Jiwa – ruh, benih kehidupan

    Joko – anak muda

    Jumanta – emas

    Jumantara - angkasa

    Perempuan

    Jayanti – bunga yang indah

    Jelita – yang berwajah cantik 

    Jenar – berkulit kuning

    Juwita – cantik jelita

    Nama Bayi Indonesia dengan Awalan Huruf K
    Laki-laki

    Kala – waktu

    Kamajaya – dewa cinta

    Kamandaka – yang memimpin

    Karisma – kepemimpinan yang luar biasa dan membuat kagum 

    Karno – berhati lembut

    Karunia – belas kasih, pemberian

    Kawindra – punya rasa seni

    Kresna - bijaksana

    Perempuan

    Kahyang – kahyangan 

    Kamala - teratai

    Kana – nama bunga

    Kani – yang terbaik

    Kanista - termuda

    Karina – perempuan yang suci

    Karmika – aktif berbuat sesuatu

    Kartana – memilik tatanan yang baik

    Kasidya – melestarikan cinta orang tua

    Kasih – perasaan sayang

    Kasyaira – teratai

    Kayshila – orang suci

    Keinan – lagu yang indah

    Kemala – batu mulia yang berharga

    Kencana – emas

    Keswari – pujangga yang mulia

    Kila – kilau

    Kinnas – sang kekasih

    Kirana – cahaya yang terang

    Nama Bayi Indonesia dengan Awalan Huruf L
    Laki-laki

    Lakeswara – raja dunia

    Langit - angkasa

    Lasmana – berkemauan keras

    Leksana – memiliki kelebihan

    Lesmana - abadi

    Luthfi – berjiwa lembut

    Perempuan

    Laksita – anak yang cekatan

    Laksmi – cantik, molek

    Lalita – terus bergerak

    Lanita – mengabadikan cinta

    Laras - seimbang

    Larasati – yang berjiwa tenang

    Lasmaya – berakhir dengan semu

    Lawana – samudra

    Laya – bertempat tinggal

    Lelana – punya kelebihan 

    Lestari – mempertahankan

    Lestia – rupawan

    Lika – membuktikan kasih orang tua

    Limar – kain sutera

    Lily – nama bunga

    Lingga – simbol dari kekuasaan

    Listia - rupawan

    Listu – ceria dan bahagia

    Lituhayu – cantik rupawan

    Lukita – berdiri tegak 

    Nama Bayi Indonesia dengan Awalan Huruf M
    Laki-laki

    Madya - tengah

    Madyana – seseorang yang tidak memihak

    Mahadana – sangat kaya

    Mahadri – gunung yang besar

    Mahajana – terkenal

    Mahapraja – yang memiliki kekuasaan besar

    Mahaprana – bersikap optimis 

    Mahardika – berilmu dan berbudi luhur

    Mahatma – yang berjiwa besar

    Mahendra – bukit

    Malik – berdaulat

    Manggala – seorang pemimpin

    Mardhi – memelihara

    Margi - jalan

    Mulyadi - bernilai

    Perempuan

    Mada – kegembiraan yang mendalam

    Madaharsa – cinta, kesucian

    Madana – cinta

    Madarsana – bisa mencontoh yang baik

    Mahadewi – setingkat dengan laki-laki

    Maharani – ratu, permaisuri

    Mahawirya – sangat kuat

    Maktika – mutiara

    Malya – rangkaian bunga

    Manda – lemah lembut

    Manika – batu permata

    Mataya - wanita

    Maya – nama seorang dewi, air

    Mega – awan

    Megananda - guntur

    Melati – nama bunga

    Mentari – matahari

    Mirah – batu permata

    Miratussany – mengingat kebaikan 

    Mirtra - sahabat

    Mustika – batu mulia

    Nama Bayi Indonesia dengan Awalan Huruf N
    Laki-laki

    Naresh – raja para raja

    Nareswara – mulia serta bijaksana

    Naufal – laki-laki tampan

    Nugraha – anugerah, pemberian dari Tuhan

    Nusantara – kepulauan yang membentang

    Perempuan

    Nada - melodi

    Nadia – harapan

    Nadindra – sungai yang besar dan dalam

    Naeswari – pendiam dan jujur

    Nala – jantung hati

    Nanda – kebahagiaan

    Nara – manusia

    Nararya – yang dimuliakan

    Narasnama – nama yang suci

    Nata – pelindung

    Nawa - sembilan

    Nawang – orang yang bijaksana

    Ndari – bulan purnama

    Nehan – merasa bahagia

    Nidya – orang yang punya keutamaan

    Ningrum – di dalam jiwa

    Ningsih – penuh cinta

    Nirmala – bersih, suci

    Numatya – orang yang ikhlas

    Nama Bayi Indonesia dengan Awalan Huruf O
    (Tidak ada referensi)

    Nama Bayi Indonesia dengan Awalan Huruf P
    Laki-laki

    Panca – lima

    Perdana – yang pertama

    Perkasa – kuat

    Praba – cahaya

    Pradigta – berdiri dengan tegap

    Pradipto -  anak pertama yang menyinari kegelapan

    Pradnyana - pagi

    Pramana – anak laki-laki yang berpengetahuan luas

    Pramuditha – anak laki-laki yang bersemangat

    Pramudya - bijaksana

    Pranadipa - berani

    Pranawa – hati yang terang

    Prasaja – orang yang bersahaja

    Prasetyo – laki-laki yang setia, gagah

    Putra – laki-laki

    Perempuan

    Padmana – hati yang berkembang

    Paramastri – cantik bagai bidadari

    Paramita – kebijaksanaan

    Parmadita – pandai

    Pawana - angin

    Permata – batu mulia

    Pertiwi – tanah air

    Pramata – mutiara

    Pramidita – pandai

    Pratista – berdiri dengan tegap

    Puri – kastel, istana

    Purnama – bulan yang seutuhnya

    Puspa - bunga

    Puspita – bunga yang diberikan untuk seorang anak perempuan

    Putri – wanita, anak dari raja

    Nama Bayi Indonesia dengan Awalan Huruf Q
    (Tidak ada referensi)

    Nama Bayi Indonesia dengan Awalan Huruf R
    Laki-laki

    Raden – bangsawan

    Raditya – matahari yang bersinar terang

    Rahardian – makmur dan sejahtera

    Raharja - makmur

    Raka – anak laki-laki yang teguh

    Rama – nama seorang tokoh pewayangan

    Randika – yang melindungi keluarga

    Rangga – tanduk yang tajam, pegawai kerajaan

    Respati – gagah

    Reswara - unggul

    Reza  - kepuasan, senang

    Rezvan – anak laki-laki yang senang mencari ilmu

    Ricky – penguasa yang kuat

    Rudi - mulia

    Perempuan

    Radmila – bekerja untuk rakyat

    Rahmi – penyayang

    Rajini – putri raja

    Rananta – merantai

    Rani – bangsawan putri

    Ranupatma – bunga teratai

    Rara – gadis

    Rasmi – anak yang cantik

    Ratih – dewi kecantikan

    Ratimaya – bayangan keindahan

    Ratna – perhiasan, harta karun

    Ratri - malam

    Ratu – wanita yang berkuasa

    Rawika – sinar mentari

    Rembulan - bulan

    Rosa – bunga mawar

    Nama Bayi Indonesia dengan Awalan Huruf S
    Laki-laki

    Sadana - harta

    Sakti – mempunyai kesaktian

    Samudra – lautan

    Santoso – yang sejahtera

    Satria - pemberani

    Satriya - dinasti

    Satya – setia

    Sigit – tampan

    Siswanto - beribadah

    Sobiyanto – baik budi

    Sudiro – gagah dan pemberani

    Sugiarto – yang punya banyak harta

    Surya – cahaya, matahari

    Suryana - matahari

    Susilo – pemimpin yang baik

    Perempuan

    Sada – suci

    Saktika – kekuasaan spiritual

    Sakya – kebahagiaan

    Samada – penuh kesukaan

    Saraswati – dewi ilmu pengetahuan

    Sasi – bulan

    Sasmaya - indah

    Sekar – bunga

    Septha – anak ketujuh

    Seta – putih

    Sitaresmi – sinar bulan

    Suci – tanpa dosa, bersih

    Sukma –jiwa

    Swasti - mandiri

    Nama Bayi Indonesia dengan Awalan Huruf T
    Laki-laki

    Tamawijaya – permata yang abadi

    Tegar – tidak bisa diubah

    Teja - sinar

    Tirta - air

    Tohpati – bertaruh nyawa

    Tulus - ikhlas

    Perempuan

    Tantri – ajaran inti

    Tanya – seorang anak

    Tarasari – cantik bagai bunga

    Tisna – cinta dan kasih sayang

    Tiwi – anak yang punya kelebihan 

    Tri – tiga

    Tyas – kalbu, hati

    Nama Bayi Indonesia dengan Awalan Huruf U
    Laki-laki

    Ulung - unggul

    Perempuan

    Utami - sama

    Utari – sabar

    Nama Bayi Indonesia dengan Awalan Huruf V
    (Tidak ada referensi)

    Nama Bayi Indonesia dengan Awalan Huruf W
    Laki-laki

    Wardana – kesucian tubuh

    Wajendra – raja besar

    Wibisana – nama dari tokoh pewayangan

    Wibowo – berwibawa, berkarisma

    Widayaka - dewa

    Widura – batu permata

    Widodo - sejahtera

    Wijaya – menang, terbaik

    Wirya - mulia

    Perempuan

    Wangi – beraroma harum

    Wasana – anak terakhir

    Waskita - bijaksana

    Wening – anak yang tenang

    Widati – berhati harum

    Widhiani – gadis yang taat aturan

    Widi – aturan

    Widia – ilmu pengetahuan

    Widuri – batu mulia

    Wikasita – mekar

    Wiyana – pemimpin

    Wulan – bulan

    Wulandari – bulan purnama

    Wuri – yang di belakang

    Nama Bayi Indonesia dengan Awalan Huruf X
    (Tidak ada referensi)

    Nama Bayi Indonesia dengan Awalan Huruf Y
    Laki-laki

    Yoga – seni untuk mendapatkan kebahagiaan

    Yuda – perang

    Yudayana – panglima perang

    Perempuan

    Yanti – nama seorang dewi

    Yatiwara – bijak dan pandai

    Yatna – anak yang menjadi pengingat

    Yetri – bijak dan pandai

    Yulianti – yang lahir di bulan Juli

    Yuni – anak yang menghormati orang tua
    
""".trimIndent()

fun rawToList(): List<String> {
    return raw
        .split("\n\n")
        .filter {
            it.contains(" - ")
        }.map {
            val lineList = it.split("-")
            lineList.first()
        }
}

val shuffle1 = rawToList().shuffled()
val shuffle2 = rawToList().shuffled()
val shuffle3 = rawToList().shuffled()

fun generateName(first: List<String>, last: List<String>): String {
    val firstName = first.random()
    var lastName = last.random()
    if (lastName == firstName) {
        lastName = last.random()
    }
    return "$firstName $lastName".replace("\\s+".toRegex(), " ").trim()
}

val generatePage1: List<User> get() {
    val first = shuffle1.slice(1..20)
    val last = shuffle2.slice(1..20)
    return (1..20).shuffled().map {
        generateName(first, last)
    }.distinct().map { generateUser(it) }
}

val generatePage2: List<User> get() {
    val first = shuffle1.slice(21..40)
    val last = shuffle2.slice(21..40)
    return (1..20).shuffled().map {
        generateName(first, last)
    }.distinct().map { generateUser(it) }
}

val generatePage3: List<User> get() {
    val first = shuffle3.slice(41..60)
    val last = shuffle2.slice(41..60)
    return (1..20).shuffled().map {
        generateName(first, last)
    }.distinct().map { generateUser(it) }
}

val generatePage4: List<User> get() {
    val first = shuffle1.slice(1..20)
    val last = shuffle3.slice(41..60)
    return (1..20).shuffled().map {
        generateName(first, last)
    }.distinct().map { generateUser(it) }
}

fun generateUser(name: String): User {
    return User(
        id = UUID.randomUUID().toString(),
        name = name
    )
}

data class User(
    val id: String,
    val name: String
)

fun main(args: Array<String>) {
    println(generatePage1)
    println(generatePage2)
    println(generatePage3)
    println(generatePage4)
}