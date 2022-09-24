package dev.nhonnq.app.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import dev.nhonnq.app.R
import dev.nhonnq.app.ui.theme.style.mediumTextView

@Composable
fun ConnectionBanner() {
    var visible by remember { mutableStateOf(true) }
    /*Observable.timer(2000, TimeUnit.MILLISECONDS)
        .subscribeOn(Schedulers.io())
        .observeOn(AndroidSchedulers.mainThread())
        .subscribe({
            visible = false
        }) { obj: Throwable -> obj.printStackTrace() }*/
    if (visible)
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(colorResource(id = R.color.no_internet_color))
                .wrapContentSize(Alignment.Center)
                .height(40.dp)
                .wrapContentHeight()
        ) {
            FontText(
                text = stringResource(id = R.string.no_internet_msg),
                modifier = Modifier.align(Alignment.CenterHorizontally),
                color = Color.White,
                isSingleLine = true,
                style = mediumTextView
            )
        }
}