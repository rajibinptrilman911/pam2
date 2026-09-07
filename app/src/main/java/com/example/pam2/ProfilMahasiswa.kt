package com.example.pam2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp

@Composable
fun ProfilMahasiswa() {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.padding(16.dp)
    ) {

        Image(

            painter = painterResource(R.mipmap.foto_profil),
            contentDescription = "Foto Profil",
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
        )

        Text(
            text = "Nama: Rajibin Putra Ilman\nNIM: 245150407111084",
            modifier = Modifier.padding(start = 12.dp)
        )
    }
}