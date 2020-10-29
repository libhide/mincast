package com.madebyratik.mincast.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.font
import androidx.compose.ui.text.font.fontFamily
import androidx.compose.ui.unit.sp
import com.madebyratik.mincast.R

val PoppinsFontFamily = fontFamily(
    font(R.font.poppins_regular),
    font(R.font.poppins_medium, FontWeight.Medium),
    font(R.font.poppins_semibold, FontWeight.SemiBold),
    font(R.font.poppins_bold, FontWeight.Bold),
)

val Typography = Typography(
    defaultFontFamily = PoppinsFontFamily,
    h1 = TextStyle(
        fontWeight = FontWeight.Bold,
        fontSize = 36.sp
    ),
    h2 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 24.sp
    ),
    h3 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 18.sp
    ),
    subtitle1 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 12.sp
    ),
    subtitle2 = TextStyle(
        fontWeight = FontWeight.SemiBold,
        fontSize = 11.sp,
        color = MidGrey
    ),
    body1 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp
    ),
    button = TextStyle(
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        letterSpacing = 1.5.sp
    ),
)
