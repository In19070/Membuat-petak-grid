package com.paulina.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class TambahData(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)