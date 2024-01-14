package shreya.example.mini_project.Adapter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import org.tensorflow.lite.DataType
import org.tensorflow.lite.support.tensorbuffer.TensorBuffer
import shreya.example.mini_project.R
import shreya.example.mini_project.ml.Detect
import java.nio.ByteBuffer

class Detect : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detect)
        var  button: Button = findViewById<Button>(R.id.button)
        button.setOnClickListener(View.OnClickListener {
            var ed1 : EditText = findViewById(R.id.editTextNumberDecimal);
            var ed2 : EditText = findViewById(R.id.editTextNumberDecimal);
            var ed3 : EditText = findViewById(R.id.editTextNumberDecimal3);
            var ed4 : EditText = findViewById(R.id.editTextNumberDecimal4);
            var ed5 : EditText = findViewById(R.id.editTextNumberDecimal5);
            var ed6 : EditText = findViewById(R.id.editTextNumberDecimal6);
            var ed7 : EditText = findViewById(R.id.editTextNumberDecimal7);
            var ed8 : EditText = findViewById(R.id.editTextNumberDecimal8);

            var v1 : Float = ed1.text.toString().toFloat()
            var v2 : Float = ed2.text.toString().toFloat()
            var v3 : Float = ed3.text.toString().toFloat()
            var v4 : Float = ed4.text.toString().toFloat()
            var v5 : Float = ed5.text.toString().toFloat()
            var v6 : Float = ed6.text.toString().toFloat()
            var v7 : Float = ed7.text.toString().toFloat()
            var v8 : Float = ed8.text.toString().toFloat()

            var byteBuffer : ByteBuffer = ByteBuffer.allocateDirect(4*8)
            byteBuffer.putFloat(v1)
            byteBuffer.putFloat(v2)
            byteBuffer.putFloat(v3)
            byteBuffer.putFloat(v4)
            byteBuffer.putFloat(v5)
            byteBuffer.putFloat(v6)
            byteBuffer.putFloat(v7)
            byteBuffer.putFloat(v8)


            val model = Detect.newInstance(this)


            val inputFeature0 = TensorBuffer.createFixedSize(intArrayOf(1, 8), DataType.FLOAT32)
            inputFeature0.loadBuffer(byteBuffer)


            val outputs = model.process(inputFeature0)
            val outputFeature0 = outputs.outputFeature0AsTensorBuffer.floatArray

            var tv : TextView = findViewById(R.id.textView)
            tv.text = ("good- " + outputFeature0[0].toString() +
                    "\n bad- " + outputFeature0[1].toString())
            model.close()


        })



    }
    }
