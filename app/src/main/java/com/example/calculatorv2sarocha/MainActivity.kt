package com.example.calculatorv2sarocha

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var st: String
        var temp: String
        var NewOp = true
        var oldNumber = 0
        var op = "+"

        num0.setOnClickListener {
            temp = "0"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(temp)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                st = textshow.text.toString().plus(temp)
                textshow.setText(st)
            }
        }

        num1.setOnClickListener {
            temp = "1"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(temp)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                st = textshow.text.toString().plus(temp)
                textshow.setText(st)
            }
        }

        num2.setOnClickListener {
            temp = "2"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(temp)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                st = textshow.text.toString().plus(temp)
                textshow.setText(st)
            }
        }

        num3.setOnClickListener {
            temp = "3"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(temp)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                st = textshow.text.toString().plus(temp)
                textshow.setText(st)
            }
        }

        num4.setOnClickListener {
            temp = "4"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(temp)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                st = textshow.text.toString().plus(temp)
                textshow.setText(st)
            }
        }

        num5.setOnClickListener {
            temp = "5"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(temp)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                st = textshow.text.toString().plus(temp)
                textshow.setText(st)
            }
        }

        num6.setOnClickListener {
            temp = "6"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(temp)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                st = textshow.text.toString().plus(temp)
                textshow.setText(st)
            }
        }

        num7.setOnClickListener {
            temp = "7"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(temp)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                st = textshow.text.toString().plus(temp)
                textshow.setText(st)
            }
        }

        num8.setOnClickListener {
            temp = "8"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(temp)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                st = textshow.text.toString().plus(temp)
                textshow.setText(st)
            }
        }

        num9.setOnClickListener {
            temp = "9"
            if (textshow.text.toString().toInt() == 0) {
                textshow.setText(temp)
            } else {
                if (NewOp) {
                    textshow.setText("")
                }
                NewOp = false
                st = textshow.text.toString().plus(temp)
                textshow.setText(st)
            }
        }

        clear.setOnClickListener {
            textshow.setText("0")
        }

        delete.setOnClickListener {
            if (textshow.text.length != 1) {
                st = textshow.text.toString().dropLast(1)
                textshow.setText(st)
            } else {
                st = "0"
                textshow.setText(st)
            }
        }

        plus.setOnClickListener {
            var num = textshow.text.toString().toInt()
            NewOp = true
            oldNumber = num
            op = "+"
            st = "0"
        }

        minus.setOnClickListener {
            var num = textshow.text.toString().toInt()
            NewOp = true
            oldNumber = num
            op = "-"
            st = "0"
        }

        multiply.setOnClickListener {
            var num = textshow.text.toString().toInt()
            NewOp = true
            oldNumber = num
            op = "*"
            st = "0"
        }

        divide.setOnClickListener {
            var num = textshow.text.toString().toInt()
            NewOp = true
            oldNumber = num
            op = "/"
            st = "0"
        }

        mod.setOnClickListener {
            var num = textshow.text.toString().toInt()
            NewOp = true
            oldNumber = num
            op = "%"
            st = "0"
        }

        equal.setOnClickListener {
            var new:String = textshow.text.toString()
            var result = 0
            if (op == "+") {
                result = oldNumber + new.toInt()
                textshow.setText(result.toString())
            } else if (op == "-") {
                result = oldNumber - new.toInt()
                textshow.setText(result.toString())
            } else if (op == "*") {
                result = oldNumber * new.toInt()
                textshow.setText(result.toString())
            } else if (op == "/") {
                if (new == "0") {
                    textshow.setText("Can't divide by zero")
                } else {
                    result = oldNumber / new.toInt()
                    textshow.setText(result.toString())
                }
            } else if (op == "%") {
                if (new == "0") {
                    textshow.setText("Can't mod by zero")
                } else {
                    result = oldNumber % new.toInt()
                    textshow.setText(result.toString())
                }
            }
        }
    }
}
