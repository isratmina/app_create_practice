import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import com.example.bmi_calculator.R

class MainActivity : AppCompatActivity() {
    private lateinit var heightET: EditText
    private lateinit var weightET: EditText
    private lateinit var countText: TextView
    private lateinit var countResult: TextView
    private lateinit var rangeText: TextView
    private lateinit var calBtn: Button
    private lateinit var cardV3: CardView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        heightET = findViewById(R.id.heightET)
        weightET = findViewById(R.id.weightET)
        countText = findViewById(R.id.countTV)
        countResult = findViewById(R.id.countRTV)
        rangeText = findViewById(R.id.rangeTV)
        calBtn = findViewById(R.id.calBtn)
        cardV3 = findViewById(R.id.cardV3)


        calBtn.setOnClickListener {
            val height = heightET.text.toString()
            val weight = weightET.text.toString()
            if (height.isEmpty() && weight.isEmpty()){
                Toast.makeText(this, "Please enter value", Toast.LENGTH_SHORT).show()
            }
            else{
                val bmi = weight.toDouble() / ((height.toDouble() / 100) * (height.toDouble() / 100))
                val bmiDigit = String.format("%.2f", bmi).toDouble()
                displayResult(bmiDigit)
                cardV3.visibility = View.VISIBLE
                heightET.text.clear()
                weightET.text.clear()
            }
        }
    }
    private fun displayResult(bmiDigit: Double) {
        countText.text = bmiDigit.toString()
        countResult.text = "You are healthy"
        rangeText.text = "Normal range is 18.5 - 24.5"

        var result = ""
        var color = 0
        var range = ""

        when{
            bmiDigit < 18.5 ->{
                result = "Underweight"
                color = R.color.under_weight
                range = "Underweight range is less than 18.5"
            }
            bmiDigit in 18.5 .. 24.9->{
                result = "Healthy"
                color = R.color.normal
                range = "Healthy range is 18.5 - 24.9"
            }
            bmiDigit in 25.0 .. 29.9->{
                result = "Overweight"
                color = R.color.over_weight
                range = "Overweight range is 25.0 - 29.9"
            }
            bmiDigit > 29.9->{
                result = "Obese"
                color = R.color.obese
                range = "Obese range is greater than 29.9"
            }
        }
        countResult.setTextColor(ContextCompat.getColor(this,color))
        countResult.text = result
        rangeText.setTextColor(ContextCompat.getColor(this,color))
        rangeText.text = range
    }
}