package com.example.dbdapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.dbdapp.R
import com.example.dbdapp.ui.theme.DBDAppTheme

@Composable
fun AboutScreen(modifier: Modifier = Modifier) {
    val scrollState = rememberScrollState()
    Column(
        modifier = modifier
            .fillMaxWidth()
            .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Spacer(modifier = Modifier.height(48.dp))
        Image(
            painter = painterResource(R.drawable.about_photo),
            contentDescription = null,
            modifier = Modifier.clip(
                CircleShape
            )
        )
        Text(text = stringResource(R.string.author_name), fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Text(text = stringResource(R.string.author_email))
        Text(text = stringResource(R.string.author_university))
        Text(text = stringResource(R.string.author_major))
    }
}

@Preview
@Composable
private fun AboutScreenPreview() {
    DBDAppTheme {
        AboutScreen()
    }
}