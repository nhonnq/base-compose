package dev.nhonnq.app.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.nhonnq.app.ui.theme.style.mediumTextView
import dev.nhonnq.app.R

@Composable
fun FontButton(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
    elevation: ButtonElevation? = ButtonDefaults.elevation(),
    shape: Shape = MaterialTheme.shapes.small,
    border: BorderStroke? = null,
    colors: ButtonColors = ButtonDefaults.buttonColors(),
    contentPadding: PaddingValues = ButtonDefaults.ContentPadding,
    style: TextStyle = mediumTextView
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.textButtonColors(
            backgroundColor = colorResource(id = R.color.color_primary),
        ),
        enabled = enabled
    ) {
        FontText(
            text = text,
            style = style,
            color = Color.White,
            fontSize = 16.sp,
            fontWeight = FontWeight.W500
        )
    }
}