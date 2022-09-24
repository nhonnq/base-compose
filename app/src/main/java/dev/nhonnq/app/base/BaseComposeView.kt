package dev.nhonnq.app.base

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import dev.nhonnq.app.ui.components.LoadingView

@Composable
fun BaseComposeView(
    shouldLoading: Boolean = false,
    content: @Composable () -> Unit,
) {
    ConstraintLayout {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(0.dp, 0.dp, 0.dp, 0.dp),
        ) {
            content()
        }
        if (shouldLoading)
            Box {
                LoadingView()
            }
    }

}

@Preview(showBackground = true)
@Composable
fun BaseComposeViewPreview() {
    BaseComposeView {

    }
}