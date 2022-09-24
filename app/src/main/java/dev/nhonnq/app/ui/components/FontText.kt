package dev.nhonnq.app.ui.components

import androidx.compose.material.LocalTextStyle
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import dev.nhonnq.app.ui.theme.style.baseTextStyle

enum class FontTextStyle(val value: Int) {
    SMALL_TYPE(1),
    NORMAL_TYPE(2),
    MEDIUM_TYPE(3),
    LARGE_TYPE(4);
}

@Composable
fun FontText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colors.surface,
    fontSize: TextUnit = TextUnit.Unspecified,
    fontStyle: FontStyle? = null,
    fontWeight: FontWeight? = null,
    fontFamily: FontFamily? = null,
    letterSpacing: TextUnit = TextUnit.Unspecified,
    textDecoration: TextDecoration? = null,
    textAlign: TextAlign? = null,
    lineHeight: TextUnit = TextUnit.Unspecified,
    overflow: TextOverflow = TextOverflow.Clip,
    softWrap: Boolean = true,
    maxLines: Int = Int.MAX_VALUE,
    onTextLayout: (TextLayoutResult) -> Unit = {},
    style: TextStyle = LocalTextStyle.current,
    isSingleLine: Boolean = false
) {
    Text(
        AnnotatedString(text),
        modifier,
        color,
        fontSize,
        fontStyle,
        fontWeight,
        fontFamily,
        letterSpacing,
        textDecoration,
        textAlign,
        lineHeight,
        if (isSingleLine) TextOverflow.Ellipsis else overflow,
        softWrap,
        if (isSingleLine) 1 else maxLines,
        emptyMap(),
        onTextLayout,
        baseTextStyle.merge(style)
    )
}

/*
@Composable
fun FontSmallText(text: String) {
    FontText(text = text, style = smallTextView)
}

@Composable
fun FontNormalText(text: String) {
    FontText(text = text, style = normalTextView)
}

@Composable
fun FontMediumText(
    text: String,
    modifier: Modifier = Modifier,
    color: Color = MaterialTheme.colors.surface,
    textStyle: TextStyle = mediumTextView,
    textAlign: TextAlign = TextAlign.Center,
    isSingleLine: Boolean = false
) {
    FontText(
        text = text,
        modifier = modifier,
        color = color,
        style = mediumTextView.merge(textStyle),
        textAlign = textAlign,
        isSingleLine = isSingleLine
    )
}

@Composable
fun FontLargeText(text: String) {
    FontText(text = text, style = largeTextView)
}*/
