package dev.nhonnq.app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.CircularProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.nhonnq.app.ui.theme.BasecomposeTheme
import dev.nhonnq.app.ui.theme.style.mediumTextView
import dev.nhonnq.app.R

@Composable
fun LoadingIndicator() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .wrapContentSize(Alignment.Center)
    ) {
        Column(
            modifier = Modifier
                .width(100.dp)
                .height(100.dp)
                .wrapContentSize(Alignment.Center)
        ) {
            CircularProgressIndicator(
                color = colorResource(id = R.color.color_primary)
            )
        }
    }
}

@Composable
fun LoadingView(
    title: String = "",
    autoHide: Boolean = false
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.loading_dimmer_background))
            .wrapContentSize(Alignment.Center)
    ) {
        Card(
            shape = RoundedCornerShape(12.dp),
            backgroundColor = colorResource(id = R.color.loading_background),
            modifier = Modifier
                .wrapContentWidth()
                .wrapContentSize(Alignment.Center),
        ) {
            Column(
                modifier = Modifier
                    .width(100.dp)
                    .height(100.dp)
                    .wrapContentSize(Alignment.Center)
            ) {
                CircularProgressIndicator()
            }

        }
        Spacer(modifier = Modifier.height(8.dp))
        if (title.isNotEmpty()) {
            FontText(
                text = title,
                modifier = Modifier.align(Alignment.CenterHorizontally),
                color = Color.White,
                isSingleLine = true,
                style = mediumTextView
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
fun LoadingViewPreview() {
    BasecomposeTheme(darkTheme = true) {
        Surface(color = MaterialTheme.colors.background) {
            LoadingView()
            LoadingView("Loading...")
        }
    }
}