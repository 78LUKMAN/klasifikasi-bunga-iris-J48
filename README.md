Machine Learning
Machine learning atau pembelajaran mesin adalah salah satu cabang dari kecerdasan buatan (artificial
intelligence) yang berfokus pada pengembangan sistem dan algoritma yang memungkinkan komputer
belajar dari data dan pengalaman, tanpa perlu diprogram secara eksplisit. Perusahaan teknologi banyak berinvestasi dalam Machine Learning, jadi mengetahui cara melatih dan
bekerja dengan model menjadi hal yang penting bagi pengembang. Machine learning melibatkan proses sebagai berikut:
1. Pengumpulan data Data yang relevan dengan tugas yang ingin diselesaikan dikumpulkan, bisa dari berbagai sumber seperti sensor, database, file, internet, dll. 
2. Pemrosesan data Data yang dikumpulkan kemudian diproses untuk membersihkan noise, menghilangkan data yang tidak relevan, dan menyusunnya ke dalam format yang dapat
diolah oleh algoritma machine learning. 
3. Memilih model/algoritma Tergantung pada tugas yang ingin diselesaikan, model atau
algoritma machine learning yang sesuai dipilih, seperti regresi, klasifikasi, clustering, neural network, dll. 
4. Pelatihan model Model dilatih menggunakan data yang telah diproses agar dapat belajar
dan menemukan pola atau insight dari data tersebut. 
5. Evaluasi model Kinerja model dievaluasi dengan menggunakan metrik evaluasi yang
sesuai. 
6. Penyesuaian model Jika performa belum memuaskan, model dapat disesuaikan dengan
mengubah parameter, memilih algoritma lain, atau menambah data pelatihan. 
7. Penyebaran model Setelah performa model sudah cukup baik, model dapat digunakan
untuk tugas sebenarnya seperti prediksi, pengenalan pola, rekomendasi, dll. 

Machine learning sangat berguna untuk memecahkan masalah kompleks yang sulit diselesaikan dengan
pemrograman konvensional. Dengan kemampuannya belajar dari data, machine learning dapat
menemukan pola tersembunyi dan membuat prediksi atau keputusan yang akurat. Klasifikasi
Klasifikasi adalah salah satu tugas utama dalam machine learning yang bertujuan untuk
memperkirakan label atau kategori dari suatu data input berdasarkan pola yang dipelajari dari
data pelatihan. Dalam klasifikasi, setiap instance/record data akan diklasifikasikan ke dalam salah satu kategori
atau kelas yang telah ditentukan sebelumnya. Dataset Iris
Dataset Iris adalah salah satu dataset yang paling terkenal dan sering digunakan dalam machine
learning, khususnya untuk tugas klasifikasi. Dataset ini pertama kali diperkenalkan oleh Ronald
Fisher, seorang ahli statistik dari Inggris pada tahun 1936.


![alt text](src/main/resources/com/machinelearning/iris-flower.png)

Dataset Iris berisi data pengukuran dari 150 bunga iris yang terdiri dari 3 spesies, yaitu:
1. Iris Setosa
2. Iris Versicolor
3. Iris Virginica

Setiap instance dalam dataset memiliki 4 fitur atau
variabel, yaitu:

1. Panjang kelopak bunga (sepal length) dalam cm
2. Lebar kelopak bunga (sepal width) dalam cm
3. Panjang mahkota bunga (petal length) dalam cm
4. Lebar mahkota bunga (petal width) dalam cm

Tujuan dari klasifikasi pada dataset ini adalah untuk memperkirakan spesies iris berdasarkan
keempat fitur tersebut. Dataset Iris sering digunakan dalam pembelajaran machine learning karena:

1. Sederhana dan mudah dipahami
2. Ukuran dataset kecil (150 instances) sehingga cocok untuk pembelajaran
3. Memiliki fitur numerik yang bisa divisualisasikan
4. Merupakan contoh klasifikasi multi-kelas (3 kelas)

Meskipun sederhana, dataset ini tetap berguna untuk mengilustrasikan konsep-konsep seperti
eksplorasi data, pemilihan fitur, pelatihan model klasifikasi, dan evaluasi model. Dataset Iris sangat populer sehingga tersedia di banyak pustaka machine learning seperti scikitlearn pada Python, R, Weka, dan lainnya. Ini membuatnya menjadi dataset standar untuk
mempelajari dan menguji algoritma klasifikasi baru. Pada latihan ini kita akan membuat program GUI java yang menerapkan machine learning yaitu
melakukan klasifikasi menggunakan algoritma J48 atau C4.5 dengan dataset iris
