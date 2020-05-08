    import android.os.Bundle  
    import com.google.android.gms.ads.AdRequest  
    import com.google.android.gms.ads.AdView  
      
    class MainActivity : AppCompatActivity() {  
      
        override fun onCreate(savedInstanceState: Bundle?) {  
            super.onCreate(savedInstanceState)  
            setContentView(R.layout.activity_main)  
            var addview: AdView =findViewById(R.id.myaddview)  
    //finding view          
    var addRequest: AdRequest = AdRequest.Builder()  
    .addTestDevice(AdRequest.DEVICE_ID_EMULATOR).build()  
    //initializing AdRequest  
            addview.loadAd(addRequest)  
    //load view with AdMob.  
      
        }  
    }  
