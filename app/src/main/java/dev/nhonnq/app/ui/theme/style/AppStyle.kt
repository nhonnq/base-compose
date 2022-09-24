package dev.nhonnq.app.ui.theme.style

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import dev.nhonnq.app.ui.theme.FontPrimary

val baseTextStyle = TextStyle(
    fontFamily = FontPrimary,
    fontWeight = FontWeight.Normal
)

val smallTextView = baseTextStyle.merge(
    TextStyle(
        fontSize = 10.sp
    )
)

val normalTextView = baseTextStyle.merge(
    TextStyle(
        fontSize = 14.sp
    )
)

val mediumTextView = baseTextStyle.merge(
    TextStyle(
        fontSize = 16.sp
    )
)

val largeTextView = baseTextStyle.merge(
    TextStyle(
        fontSize = 22.sp
    )
)

val baseTextFieldStyle = TextStyle(
    fontFamily = FontPrimary,
    fontWeight = FontWeight.Normal
)