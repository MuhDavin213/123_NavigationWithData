package com.example.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue

@Composable
fun HalamanBaru(
  goToNextPage: (MutableList<String>) -> Unit,
){
    var namaTxt by remember {
        mutableStateOf("")
    }
    var telpTxt by remember {
        mutableStateOf("")
    }
    var alamatTxt by remember {
        mutableStateOf("")
    }
    val listData = mutableListOf<String>(namaTxt,telpTxt,alamatTxt)


    Column (

    ){

    }
}