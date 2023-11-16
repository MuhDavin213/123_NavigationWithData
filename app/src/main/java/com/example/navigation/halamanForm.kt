package com.example.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
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
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
            .background(color = Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            text = "Data Pelanggan",
            modifier = Modifier.padding(20.dp),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        OutlinedTextField(
            value = namaTxt,
            onValueChange = {
                namaTxt = it
            },
            label = { Text(text = "Nama")}
        )
        OutlinedTextField(
            value = telpTxt,
            onValueChange = {
                telpTxt = it
            },
            label = { Text(text = "No Telepon")}
        )
        OutlinedTextField(
            value = alamatTxt,
            onValueChange = {
                alamatTxt = it
            },
            label = { Text(text = "Alamat")}
        )

        Button(
            onClick = { goToNextPage(listData) },
            modifier = Modifier
                .fillMaxWidth()
                .padding(30.dp)
        ) {
            Text(text = "Next")

        }

    }
}