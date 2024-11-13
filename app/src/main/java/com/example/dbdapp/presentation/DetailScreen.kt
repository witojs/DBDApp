package com.example.dbdapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dbdapp.DummyData
import com.example.dbdapp.model.Killer

@Composable
fun DetailScreen(
    killerId: String?,
) {
    val scrollState = rememberScrollState()

    val data = DummyData.killerList

    val killerDetail: List<Killer> = data.filter { killer ->
        killer.id == killerId
    }

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp)
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.Center) {
            Image(
                painterResource(killerDetail[0].photo),
                contentScale = ContentScale.Crop,
                contentDescription = null
            )
        }
        Text(text = killerDetail[0].name, fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text(text = killerDetail[0].description, textAlign = TextAlign.Justify)
        Text(text = killerDetail[0].power, fontSize = 24.sp, fontWeight = FontWeight.Bold)
        Text(text = killerDetail[0].powerDescription, textAlign = TextAlign.Justify)
    }
}
