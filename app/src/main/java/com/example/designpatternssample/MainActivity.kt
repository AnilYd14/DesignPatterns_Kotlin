package com.example.designpatternssample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.designpatternssample.adapterpattern.AudioPlayer
import com.example.designpatternssample.facadepattern.BookType
import com.example.designpatternssample.facadepattern.LibraryService


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Singleton Log", Singleton.doSomething())

        //Factory Patter
        DialogFactory.createDialog(DialogType.DIALOG_CREATE_CHAT).showDialog()

        //MaterialAlertDialogBuilder(this).setBackground().create()

        // builder pattern
        val humburger = Humburger.Builder()
            .cheese(true)
            .onion(true)
            .build()


        //Abstract Factory Pattern
        val vehicleFactory = VehicleFactoryProvider.getVehicleFactory(VehicleType.LUXURY)
        val ordinaryVehicle = vehicleFactory?.getVehicle("swift")
        ordinaryVehicle?.average()


        //Adapter Pattern

        val audioPlayer = AudioPlayer()
        audioPlayer.play("mp3", "beyond the horizon.mp3")


        //Facade Patter
        LibraryService().borrowBook(BookType.FICTION,"xyzzz")

    }
}