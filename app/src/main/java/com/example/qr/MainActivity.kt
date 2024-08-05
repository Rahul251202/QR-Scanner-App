package com.example.qr


import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.zxing.integration.android.IntentIntegrator
import com.google.zxing.integration.android.IntentResult

class MainActivity : AppCompatActivity() {

    private lateinit var textViewResult: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonScan = findViewById<Button>(R.id.button_scan)
        textViewResult = findViewById(R.id.textView_result)

        buttonScan.setOnClickListener {
            val integrator = IntentIntegrator(this)
            integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE)
            integrator.setPrompt("Scan a QR code")
            integrator.setCameraId(0) // Use a specific camera of the device
            integrator.setBeepEnabled(true)
            integrator.setBarcodeImageEnabled(true)
            integrator.initiateScan()
        }
    }



    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        val result: IntentResult = IntentIntegrator.parseActivityResult(requestCode, resultCode, data)
        if (result != null) {
            if (result.contents == null) {
                textViewResult.text = "Cancelled"
            } else {
                textViewResult.text = "Scanned: " + result.contents

                // Check if the scanned result is a URL and open it
                if (result.contents.startsWith("http://") || result.contents.startsWith("https://")) {
                    val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse(result.contents))
                    startActivity(browserIntent)
                }
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }

}


