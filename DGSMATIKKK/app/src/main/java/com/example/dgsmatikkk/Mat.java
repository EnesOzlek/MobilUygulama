package com.example.dgsmatikkk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Mat extends AppCompatActivity {
    String[] TopicsMAT={"TemelKavramlar","Sayılar",
            "Rasyonel Sayılar ve Ondalık Kesirler ",
            "Sayı Sistemleri ve Basamak Kavramı ",
            "Asal Çarpanlar ve Tam Bölen Sayısı",
            "Bölme ve Bölünebilme Kuralları",
            "Faktöriyel",
            "Obeb (Ebob) ve Okek (Ekok)",
            "Taban Aritmetiği",
            "Denklem Çözme",
            " Basit Eşitsizlikler ve Sıralama",
            "Mutlak Değer",
            "Üslü Sayılar",
            "Kareköklü Sayılar",
            "Çarpanlara Ayırma ve Özdeşlikler",
            "Oran Orantı",
            "Sayı Problemleri",
            "Kesir Problemleri",
            "Sayfa Problemleri",
            "Saat Problemleri",
            "Yaş Problemleri",
            "Yüzde Problemleri",
            "Kar ve Zarar Problemleri",
            "Faiz Problemleri",
            "Karışım Problemleri",
            "Hız Hareket Problemleri",
            "İşçi ve Havuz Problemleri",
            "Kümeler",
            "Fonksiyonlar",
            "İşlem",
            "Modüler Aritmetik",
            "Permütasyon",
            "Kombinasyon",
            "Olasılık",
            "Sayısal Mantık"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mat);

        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<String>(Mat.this, android.R.layout.simple_expandable_list_item_1,TopicsMAT);

        ListView listView = (ListView) findViewById(R.id.math);
        listView.setAdapter(adapter);

    }
}