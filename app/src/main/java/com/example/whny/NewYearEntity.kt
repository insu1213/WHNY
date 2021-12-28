package com.example.whny

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class NewYearEntity (
    //실질적 entity 2개
    var content : String,
    var country : String
){
    //primarykey 오류 확인, 유지보수용 생성. 항상 0이 되어 있어야 한다
    @PrimaryKey(autoGenerate = true)
    var id : Long = 0
}