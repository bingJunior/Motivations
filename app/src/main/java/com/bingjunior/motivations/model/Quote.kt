package com.bingjunior.motivations.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Quote(@StringRes val stringResourceId: Int, @DrawableRes val imageResourceId: Int)