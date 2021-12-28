package com.example.whny.Count

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.whny.R
import com.example.whny.databinding.ActivityCountBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.text.SimpleDateFormat
import java.util.*

class CountActivity : AppCompatActivity() {
    lateinit var binding : ActivityCountBinding
    lateinit var viewModel : CountActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_count)
        viewModel = ViewModelProvider(this).get(CountActivityViewModel::class.java)


        var search = intent.getStringExtra("searchEdit")
        println(search)

        if(search == null) {
            search = "" //값이 비어있을 시 그리니치 표준시로 설정
        }


        CoroutineScope(Dispatchers.Main).launch {
            while (true){
                val date = Date()
                val year = SimpleDateFormat("yyyy")
                val month = SimpleDateFormat("MM")
                val day = SimpleDateFormat("dd")
                val df = SimpleDateFormat("HH:mm:ss ")
                val hour = SimpleDateFormat("HH")
                val min = SimpleDateFormat("mm")
                val sec = SimpleDateFormat("ss")
                val UT = SimpleDateFormat("(z Z)")

                var formattedDate = year.format(Date())
                val yearInt = formattedDate.toInt()

                formattedDate = month.format(Date())
                val monthInt =  formattedDate.toInt()

                formattedDate = day.format(Date())
                val dayInt =  formattedDate.toInt()

                formattedDate = hour.format(Date())
                val hourInt =  formattedDate.toInt()

                formattedDate = min.format(Date())
                val minInt =  formattedDate.toInt()

                formattedDate = sec.format(Date())
                val secInt =  formattedDate.toInt()


                var stamp = 31_536_000

                if(yearInt % 4 == 0) {
                    stamp = 31_622_400
                }

                var timer = 0

                timer = when(monthInt) {
                    1 -> 0
                    2 -> 31
                    3 -> if (yearInt % 4 == 0) {
                        60
                    } else {
                        59
                    }
                    4 -> if (yearInt % 4 == 0) {
                        91
                    } else {
                        90
                    }
                    5 -> if (yearInt % 4 == 0) {
                        121
                    } else {
                        120
                    }
                    6 -> if (yearInt % 4 == 0) {
                        152
                    } else {
                        151
                    }
                    7 -> if (yearInt % 4 == 0) {
                        182
                    } else {
                        181
                    }
                    8 -> if (yearInt % 4 == 0) {
                        213
                    } else {
                        212
                    }
                    9 -> if (yearInt % 4 == 0) {
                        244
                    } else {
                        243
                    }
                    10 -> if (yearInt % 4 == 0) {
                        274
                    } else {
                        273
                    }
                    11 -> if (yearInt % 4 == 0) {
                        305
                    } else {
                        304
                    }
                    12 -> if (yearInt % 4 == 0) {
                        335
                    } else {
                        334
                    }
                    else -> 0
                }

                var rate = stamp - ((timer + dayInt) * 86400) - (hourInt * 3600) - (minInt * 60) - secInt



                var time: TimeZone = TimeZone.getTimeZone(search) //Asia/Seoul, America/Los_Angeles
                df.timeZone = time
                binding.text1.text = "${time.displayName} ${year.format(date)}년 ${month.format(date)}월 ${day.format(date)}일 ${df.format(date)}"

                val rateDay: Int = rate / 86400
                rate -= (86400 * rateDay)
                val rateHour: Int = rate / 3600
                rate -= (3600 * rateHour)
                val rateMin: Int = rate / 60
                rate -= (60 * rateMin)
                val rateSec: Int = rate

                binding.text2.text = "남은 시간 : $rateDay 일 $rateHour 시간 $rateMin 분 $rateSec 초 남았습니다"
                delay(1000)
            }
        }
    }
}