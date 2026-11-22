package com.example.kopi_senja.ui

import androidx.compose.animation.*
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.spring
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.CheckCircle
import androidx.compose.material.icons.rounded.ShoppingCart
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.compose.SubcomposeAsyncImage
import com.example.kopi_senja.data.model.MenuItem
import com.example.kopi_senja.ui.theme.Kopi_SenjaTheme
import java.util.Locale

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val menuItems = remember {
        listOf(
            // --- CATEGORY: MINUMAN (COFFEE & SPECIALTY) ---
            MenuItem(1, "Kopi Gula Aren", "Kopi espresso susu dengan gula aren asli yang berlapis.", 18000.0, "https://images.unsplash.com/photo-1658043186384-7add63d278fd?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=NHwxMjA3fDA%3D", "Minuman"),
            MenuItem(2, "Vietnam Drip", "Kopi hitam kental dengan tetesan susu kental manis.", 20000.0, "https://images.unsplash.com/photo-1662105489808-f3dd79b7f13c?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=NHwxMjA3fDA%3D", "Minuman"),
            MenuItem(3, "Es Kopi Hitam", "Kesegaran kopi hitam dingin dari biji kopi lokal terbaik.", 15000.0, "https://images.unsplash.com/photo-1514432324607-a09d9b4aefdd?q=80&w=687&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=NHwxMjA3fDA%3D", "Minuman"),
            MenuItem(4, "Cappuccino Senja", "Perpaduan espresso dan foam susu yang sangat lembut.", 22000.0, "https://images.unsplash.com/photo-1534778101976-62847782c213?q=80&w=600", "Minuman"),
            MenuItem(5, "Avocado Coffee", "Espresso dengan jus alpukat kental yang sangat creamy.", 25000.0, "https://images.unsplash.com/photo-1559496417-e7f25cb247f3?q=80&w=600", "Minuman"),
            MenuItem(6, "Caramel Macchiato", "Susu vanilla dengan espresso dan saus karamel manis.", 24000.0, "https://images.unsplash.com/photo-1485808191679-5f86510681a2?q=80&w=600", "Minuman"),
            
            // --- CATEGORY: MAKANAN (AUTHENTIC INDONESIAN SNACKS) ---
            MenuItem(101, "Pisang Goreng Keju", "Pisang goreng krispi dengan taburan keju melimpah.", 15000.0, "https://media.istockphoto.com/id/2221470245/id/foto/pisang-goreng-dengan-keju.jpg?s=2048x2048&w=is&k=20&c=BK3eSID8rqPIKXH3yrK2leYxtWUyEpbJYW1UJYVdCLU=", "Makanan"),
            MenuItem(102, "Singkong Goreng", "Singkong empuk merekah yang digoreng hingga garing.", 12000.0, "https://media.istockphoto.com/id/687511388/id/foto/singkong-goreng.jpg?s=2048x2048&w=is&k=20&c=hT6eurPY-ynKv61ON_ybm21c4nTRxETjh-xdv8Tup2g=", "Makanan"),
            MenuItem(103, "Martabak Telur", "Martabak gurih dengan isian telur dan daging spesial.", 25000.0, "https://images.unsplash.com/photo-1706922122195-a1d670210618?q=80&w=1126&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=NHwxMjA3fDA%3D", "Makanan"),
            MenuItem(104, "Tahu Isi Sayur", "Tahu goreng dengan isian sayuran segar yang melimpah.", 10000.0, "https://images.unsplash.com/photo-1657251867373-e1c96a9ed57f?q=80&w=1170&auto=format&fit=crop&ixlib=rb-4.1.0&ixid=NHwxMjA3fDA%3D", "Makanan"),
            MenuItem(105, "Tempe Mendoan", "Tempe goreng tepung lebar dengan bumbu rempah asli.", 10000.0, "https://media.istockphoto.com/id/1191593314/id/foto/indonesian-traditional-food-tempe-mendoan.jpg?s=2048x2048&w=is&k=20&c=qwof4o2TrwHVrvyE-B_u-F-LIqYyalAGtIuyAhnndpk=", "Makanan"),
            MenuItem(106, "Bakwan Sayur", "Gorengan sayur renyah sebagai teman ngopi paling pas.", 10000.0, "https://media.istockphoto.com/id/2162351539/id/foto/bakwan-adalah-gorengan-sayur.jpg?s=2048x2048&w=is&k=20&c=d4a5OjihwrZB_CHZbzQBTChDb-u7tBQP3nTP_SxDR7w=", "Makanan")
        )
    }

    var selectedItemIds by remember { mutableStateOf(setOf<Int>()) }
    val selectedCount = selectedItemIds.size

    Box(modifier = Modifier.fillMaxSize()) {
        // Immersive Full-Screen Cafe Atmosphere
        AsyncImage(
            model = "https://images.unsplash.com/photo-1501339817308-c7a319a882d1?q=80&w=1200",
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop,
            alpha = 0.45f
        )
        
        // Gradient Scrim for deep atmosphere and text contrast
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            MaterialTheme.colorScheme.background.copy(alpha = 0.65f),
                            MaterialTheme.colorScheme.background.copy(alpha = 0.85f),
                            MaterialTheme.colorScheme.background
                        )
                    )
                )
        )

        Scaffold(
            containerColor = Color.Transparent,
            floatingActionButton = {
                AnimatedVisibility(
                    visible = selectedCount > 0,
                    enter = scaleIn() + fadeIn(),
                    exit = scaleOut() + fadeOut()
                ) {
                    ExtendedFloatingActionButton(
                        onClick = { /* Simulated Checkout Flow */ },
                        icon = { Icon(Icons.Rounded.ShoppingCart, contentDescription = null) },
                        text = { Text("Pesan Sekarang ($selectedCount)") },
                        containerColor = MaterialTheme.colorScheme.primary,
                        contentColor = MaterialTheme.colorScheme.onPrimary,
                        shape = CircleShape,
                        elevation = FloatingActionButtonDefaults.elevation(defaultElevation = 12.dp),
                        modifier = Modifier.navigationBarsPadding()
                    )
                }
            }
        ) { innerPadding ->
            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 16.dp),
                contentPadding = PaddingValues(
                    top = innerPadding.calculateTopPadding() + 16.dp,
                    bottom = innerPadding.calculateBottomPadding() + 120.dp
                ),
                horizontalArrangement = Arrangement.spacedBy(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                // Greeting and Branding Section
                item(span = { GridItemSpan(2) }) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 40.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Selamat Sore",
                            style = MaterialTheme.typography.displayMedium.copy(
                                fontWeight = FontWeight.Black,
                                letterSpacing = (-2).sp
                            ),
                            color = MaterialTheme.colorScheme.primary
                        )
                        Text(
                            text = "Kopi Senja",
                            style = MaterialTheme.typography.headlineSmall,
                            color = MaterialTheme.colorScheme.secondary,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(12.dp))
                        Text(
                            text = "Sajian kopi dan makanan terbaik untuk menemani senjamu.",
                            style = MaterialTheme.typography.bodyLarge,
                            color = MaterialTheme.colorScheme.onSurfaceVariant,
                            textAlign = TextAlign.Center,
                            modifier = Modifier.padding(horizontal = 24.dp)
                        )
                    }
                }

                // Category Headers and Items
                val categories = menuItems.map { it.category }.distinct()
                categories.forEach { category ->
                    item(span = { GridItemSpan(2) }) {
                        Text(
                            text = if (category == "Minuman") "Kopi & Minuman" else "Cemilan Teman Ngopi",
                            style = MaterialTheme.typography.titleLarge,
                            fontWeight = FontWeight.ExtraBold,
                            color = MaterialTheme.colorScheme.primary,
                            modifier = Modifier.padding(top = if (category == "Minuman") 0.dp else 32.dp, bottom = 8.dp)
                        )
                    }
                    items(menuItems.filter { it.category == category }, key = { it.id }) { item ->
                        val isSelected = selectedItemIds.contains(item.id)
                        MenuCard(
                            item = item,
                            isSelected = isSelected,
                            onToggleSelection = {
                                selectedItemIds = if (isSelected) {
                                    selectedItemIds - item.id
                                } else {
                                    selectedItemIds + item.id
                                }
                            }
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun MenuCard(
    item: MenuItem,
    isSelected: Boolean,
    onToggleSelection: () -> Unit
) {
    val cardColor by animateColorAsState(
        targetValue = if (isSelected) MaterialTheme.colorScheme.primaryContainer else MaterialTheme.colorScheme.surface.copy(alpha = 0.95f),
        animationSpec = spring(),
        label = "cardColor"
    )

    val elevation by animateDpAsState(
        targetValue = if (isSelected) 16.dp else 4.dp,
        label = "elevation"
    )

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .shadow(elevation, RoundedCornerShape(32.dp))
            .clickable(onClick = onToggleSelection),
        shape = RoundedCornerShape(32.dp),
        colors = CardDefaults.cardColors(containerColor = cardColor),
        border = if (isSelected) androidx.compose.foundation.BorderStroke(2.dp, MaterialTheme.colorScheme.primary) else null
    ) {
        Box {
            Column(
                modifier = Modifier
                    .padding(8.dp)
                    .fillMaxWidth()
            ) {
                // High-quality menu image using SubcomposeAsyncImage for professional loading states
                SubcomposeAsyncImage(
                    model = item.imageUrl,
                    contentDescription = item.name,
                    modifier = Modifier
                        .fillMaxWidth()
                        .aspectRatio(1f)
                        .clip(RoundedCornerShape(26.dp)),
                    contentScale = ContentScale.Crop,
                    loading = {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(MaterialTheme.colorScheme.surfaceVariant),
                            contentAlignment = Alignment.Center
                        ) {
                            CircularProgressIndicator(
                                modifier = Modifier.size(28.dp),
                                color = MaterialTheme.colorScheme.primary,
                                strokeWidth = 3.dp
                            )
                        }
                    },
                    error = {
                        Box(
                            modifier = Modifier
                                .fillMaxSize()
                                .background(MaterialTheme.colorScheme.errorContainer),
                            contentAlignment = Alignment.Center
                        ) {
                            Text(
                                "!", 
                                color = MaterialTheme.colorScheme.onErrorContainer,
                                style = MaterialTheme.typography.titleLarge
                            )
                        }
                    }
                )
                
                Spacer(modifier = Modifier.height(12.dp))
                
                Column(modifier = Modifier.padding(horizontal = 8.dp)) {
                    Text(
                        text = item.name,
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.ExtraBold,
                        maxLines = 1,
                        color = MaterialTheme.colorScheme.onSurface
                    )
                    Text(
                        text = item.category,
                        style = MaterialTheme.typography.labelMedium,
                        color = MaterialTheme.colorScheme.secondary,
                        fontWeight = FontWeight.Bold
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    Text(
                        text = "Rp ${String.format(Locale.getDefault(), "%.0f", item.price)}",
                        style = MaterialTheme.typography.titleLarge,
                        color = MaterialTheme.colorScheme.primary,
                        fontWeight = FontWeight.Black
                    )
                }
                Spacer(modifier = Modifier.height(8.dp))
            }

            // Selection indicator (checkmark)
            if (isSelected) {
                Icon(
                    imageVector = Icons.Rounded.CheckCircle,
                    contentDescription = "Selected",
                    tint = MaterialTheme.colorScheme.primary,
                    modifier = Modifier
                        .align(Alignment.TopEnd)
                        .padding(14.dp)
                        .size(32.dp)
                        .background(Color.White, CircleShape)
                        .padding(2.dp)
                )
            }
        }
    }
}

@Preview(showBackground = true, device = "spec:width=411dp,height=891dp")
@Composable
fun MainScreenPreview() {
    Kopi_SenjaTheme {
        MainScreen()
    }
}
