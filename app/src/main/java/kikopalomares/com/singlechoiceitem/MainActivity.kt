package kikopalomares.com.singlechoiceitem

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    //Opciones a mostrar para seleccionar
    private val options = arrayOf("Bike", "Car", "Train")

    //Posición por defecto seleccionada del array de options
    private var defaultPosition = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Si queremos usar un array desde los recursos xml
        //val options = resources.getStringArray(R.array.options)

        openAlertButton.setOnClickListener {

            val builderSingle = AlertDialog.Builder(this)
            builderSingle.setTitle("Select")
            builderSingle.setPositiveButton(getString(android.R.string.ok)) { dialog, _ -> dialog.dismiss() }
            builderSingle.setSingleChoiceItems(options, defaultPosition) { _, which ->
                defaultPosition = which
                itemSelected.text = options[which]
            }
            builderSingle.show()
        }
    }
}
