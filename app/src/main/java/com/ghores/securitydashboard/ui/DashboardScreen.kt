package com.ghores.securitydashboard.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ghores.securitydashboard.R

@Composable
fun SecurityDashboardScreen() {
    Column {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = colorResource(id = R.color.cultured))
        ) {
            Column {
                UserSection(
                    name = "Amin Ghazimoradi",
                    designation = "Android developer",
                    image = R.drawable.profile
                )
                SearchSection()
                StatisticsSection()
            }
        }
        CompanyGoalsAndBottomTabsSection()
    }
}

@Composable
fun CompanyGoalsAndBottomTabsSection() {
    val boxBackgroundGradiant = Brush.verticalGradient(
        colors = listOf(
            colorResource(id = R.color.maximum_blue_green),
            colorResource(id = R.color.flax)
        )
    )
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 16.dp),
            verticalAlignment = Alignment.Bottom
        ) {
            Text(
                text = "Company goals",
                color = colorResource(id = R.color.black),
                fontSize = 26.sp,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "All",
                color = colorResource(id = R.color.black),
                fontSize = 14.sp
            )
        }
        Box(
            modifier = Modifier
                .padding(horizontal = 24.dp)
                .padding(top = 8.dp, bottom = 24.dp)
                .border(1.dp, color = colorResource(id = R.color.black))
                .fillMaxWidth()
                .weight(1f)
        ) {
            Row {
                Box(
                    modifier = Modifier
                        .background(boxBackgroundGradiant)
                        .fillMaxHeight()
                        .width(12.dp)
                        .border(1.dp, color = colorResource(id = R.color.black))
                )
                Column(modifier = Modifier.padding(horizontal = 16.dp, vertical = 16.dp)) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.round_check_circle_24),
                            contentDescription = null,
                            modifier = Modifier.size(20.dp)
                        )
                        Text(
                            text = "Cyber security teams",
                            color = colorResource(id = R.color.black),
                            fontSize = 16.sp,
                            modifier = Modifier
                                .weight(1f)
                                .padding(start = 4.dp)
                        )
                        Text(
                            text = "Active",
                            color = colorResource(id = R.color.gray),
                            fontSize = 16.sp,
                            modifier = Modifier
                                .padding(start = 4.dp)
                        )
                    }
                    Text(
                        text = "Conduct pishing simulations\nwithin company",
                        color = colorResource(id = R.color.black),
                        fontSize = 20.sp,
                        fontWeight = FontWeight.SemiBold,
                        modifier = Modifier.padding(top = 18.dp)
                    )
                    Divider(
                        color = colorResource(id = R.color.gray),
                        thickness = 1.dp,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 18.dp)
                    )
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Image(
                            painter = painterResource(id = R.drawable.round_access_time_24),
                            contentDescription = null,
                            colorFilter = ColorFilter.tint(colorResource(id = R.color.gray)),
                            modifier = Modifier.size(20.dp)

                        )
                        Text(
                            text = "Ends in 24 days",
                            color = colorResource(id = R.color.gray),
                            fontSize = 16.sp,
                            modifier = Modifier.padding(start = 4.dp)
                        )
                    }

                }
            }
        }
        BottomTabsSection(
            tabs = listOf(
                R.drawable.round_dashboard_24,
                R.drawable.round_pie_chart_24,
                R.drawable.round_calendar_month_24,
                R.drawable.round_account_circle_24
            )
        )
    }
}

@Composable
fun BottomTabsSection(tabs: List<Int>) {
    Box(modifier = Modifier.fillMaxWidth()) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .align(Alignment.BottomStart)
                .padding(16.dp)
        ) {
            tabs.forEachIndexed { index, icon ->
                Image(
                    painter = painterResource(id = icon),
                    contentDescription = null,
                    modifier = Modifier
                        .size(32.dp)
                        .weight(1f),
                    colorFilter = ColorFilter.tint(
                        colorResource(id = if (index == 0) R.color.black else R.color.gray)
                    )
                )
            }
        }
    }
}

@Composable
fun StatisticsSection() {
    Column {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 8.dp),
            verticalAlignment = Alignment.Bottom
        ) {
            Text(
                text = "Statistics",
                color = colorResource(id = R.color.black),
                fontSize = 26.sp,
                modifier = Modifier.weight(1f)
            )
            Text(
                text = "MONTH",
                color = colorResource(id = R.color.black),
                fontSize = 14.sp
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .padding(top = 12.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.round_key_24),
                contentDescription = null,
                colorFilter = ColorFilter.tint(colorResource(id = R.color.white)),
                modifier = Modifier
                    .size(48.dp)
                    .background(colorResource(id = R.color.black))
                    .padding(12.dp)
            )
            Text(
                text = "Security attacks",
                color = colorResource(id = R.color.black),
                fontSize = 20.sp,
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.round_arrow_upward_24),
                contentDescription = null,
                colorFilter = ColorFilter.tint(colorResource(id = R.color.keppel)),
                modifier = Modifier.width(20.dp)
            )
            Text(
                text = "68%",
                color = colorResource(id = R.color.keppel),
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(4.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp, vertical = 24.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.round_fingerprint_24),
                contentDescription = null,
                colorFilter = ColorFilter.tint(colorResource(id = R.color.white)),
                modifier = Modifier
                    .size(48.dp)
                    .background(colorResource(id = R.color.black))
                    .padding(12.dp)
            )
            Text(
                text = "Protected bunches",
                color = colorResource(id = R.color.black),
                fontSize = 20.sp,
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.round_arrow_downward_24),
                contentDescription = null,
                colorFilter = ColorFilter.tint(colorResource(id = R.color.middle_red)),
                modifier = Modifier.width(20.dp)
            )
            Text(
                text = "38%",
                color = colorResource(id = R.color.middle_red),
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(4.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 24.dp)
                .padding(bottom = 48.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.round_language_24),
                contentDescription = null,
                colorFilter = ColorFilter.tint(colorResource(id = R.color.white)),
                modifier = Modifier
                    .size(48.dp)
                    .background(colorResource(id = R.color.black))
                    .padding(12.dp)
            )
            Text(
                text = "Runtime cost",
                color = colorResource(id = R.color.black),
                fontSize = 20.sp,
                modifier = Modifier
                    .weight(1f)
                    .padding(start = 16.dp)
            )
            Text(
                text = "$6235",
                color = colorResource(id = R.color.black),
                fontSize = 20.sp,
                fontWeight = FontWeight.SemiBold,
                modifier = Modifier
                    .padding(4.dp)
            )
        }
    }
}

@Composable
fun SearchSection() {
    val searchTextState = remember {
        mutableStateOf(TextFieldValue())
    }
    val iconBackgroundGradiant = Brush.verticalGradient(
        colors = listOf(
            colorResource(id = R.color.maximum_blue_green),
            colorResource(id = R.color.flax)
        )
    )
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(24.dp)
            .border(1.dp, color = colorResource(id = R.color.black)),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Image(
            painter = painterResource(id = R.drawable.round_search_24),
            contentDescription = null,
            colorFilter = ColorFilter.tint(colorResource(id = R.color.gray)),
            modifier = Modifier
                .padding(start = 16.dp)
                .size(24.dp)
        )
        BasicTextField(
            value = searchTextState.value,
            onValueChange = { searchTextState.value = it },
            singleLine = true,
            textStyle = TextStyle(fontSize = 15.sp),
            modifier = Modifier
                .background(Color.Transparent)
                .padding(start = 4.dp, end = 16.dp)
                .weight(1f),
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done
            ),
            decorationBox = { innerTextField ->
                innerTextField()
                if (searchTextState.value.text.isEmpty()) {
                    Text(
                        text = "Search",
                        color = colorResource(id = R.color.gray),
                        fontSize = 15.sp
                    )
                }
            }
        )
        Image(
            painter = painterResource(id = R.drawable.round_filter_list_24),
            contentDescription = null,
            colorFilter = ColorFilter.tint(colorResource(id = R.color.black)),
            modifier = Modifier
                .size(48.dp)
                .background(iconBackgroundGradiant)
                .border(1.dp, color = colorResource(id = R.color.black))
                .padding(12.dp)
        )
    }
}


@Composable
fun UserSection(
    name: String, designation: String, image: Int
) {
    Row(
        modifier = Modifier
            .padding(horizontal = 24.dp)
            .padding(top = 28.dp)
            .fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier.weight(1f)) {
            Text(
                text = name,
                color = colorResource(id = R.color.black),
                fontSize = 26.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = designation,
                color = colorResource(id = R.color.gray),
                fontSize = 18.sp
            )
        }
        Image(
            painter = painterResource(id = image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(56.dp)
                .border(1.dp, color = colorResource(id = R.color.black))
        )
    }
}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview() {
    SecurityDashboardScreen()
}