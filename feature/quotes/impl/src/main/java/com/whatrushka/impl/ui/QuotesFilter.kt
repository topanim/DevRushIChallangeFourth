package com.whatrushka.impl.ui

import android.graphics.drawable.VectorDrawable
import android.widget.ImageButton
import androidx.compose.foundation.clickable
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCompositionContext
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.whatrushka.impl.R

@Composable
fun QuotesFilter(modifier: Modifier) {
    var showFilter by remember { mutableStateOf(false) }

    Icon(
        painter = painterResource(R.drawable.icon_filter),
        contentDescription = null,
        modifier = modifier
            .clickable {
                showFilter = true
            }
    )

    if (showFilter) { QuotesFilterModal() }
}

@Composable
fun QuotesFilterModal() {

}