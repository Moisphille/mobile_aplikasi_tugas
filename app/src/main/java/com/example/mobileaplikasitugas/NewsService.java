package com.example.mobileaplikasitugas;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class NewsService extends Service {

    private static final String TAG = "NewsService";

    public NewsService() {
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "Service onCreate");
        // Di sini Anda bisa melakukan inisialisasi, seperti membuat objek pengelola berita, dll.
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {
        Log.d(TAG, "Service onStartCommand");
        // Di sini Anda bisa memulai proses pengambilan data berita.
        // Anda juga bisa menggunakan intent untuk membaca informasi tambahan yang mungkin dilewatkan dari aktivitas.
        // Selain itu, Anda bisa memilih untuk membuat layanan ini menjadi layanan foreground jika diperlukan.
        return START_STICKY; // Atau nilai kembalian lain sesuai dengan kebutuhan aplikasi Anda.
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Service onDestroy");
        // Di sini Anda bisa membersihkan sumber daya yang digunakan oleh layanan, seperti menutup koneksi ke server berita, dll.
    }
}

