package app.takumi.obayashi.chackwork_2020spring_fri

import android.graphics.Color
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        countValueTextView.setTextColor(Color.BLACK)
        countValueTextView.text = "0"

        plusButton.setOnClickListener { plus() }
        minusButton.setOnClickListener { minus() }
        multipleButton.setOnClickListener { multiple() }
        devideButton.setOnClickListener { devide() }
        clearButton.setOnClickListener { clear() }
    }

    fun plus() {
        number++
        checkTextViewColor()
        countValueTextView.text = number.toString()
    }

    fun minus() {
        number--
        checkTextViewColor()
        countValueTextView.text = number.toString()
    }

    fun multiple() {
        number *= 2
        checkTextViewColor()
        countValueTextView.text = number.toString()
    }

    fun devide() {
        number /= 2
        checkTextViewColor()
        countValueTextView.text = number.toString()
    }

    fun clear() {
        number = 0
        checkTextViewColor()
        countValueTextView.text = number.toString()
    }

    fun checkTextViewColor() {
        when {
            number >= 10 -> {
                countValueTextView.setTextColor(Color.RED)
            }
            number <= -10 -> {
                countValueTextView.setTextColor(Color.BLUE)
            }
            else -> {
                countValueTextView.setTextColor(Color.BLACK)
            }
        }
    }
}
