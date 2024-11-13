package com.example.dbdapp.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.History
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.SearchBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavHostController, viewModel: SearchViewModel = viewModel()) {
    val killers by viewModel.filteredItems.collectAsState()


    var query = viewModel.querySearch.collectAsState().value
    var isSearching by remember { mutableStateOf(false) }
    val history = remember {
        mutableListOf("")
    }

    Column {
        SearchBar(query = query,
            onQueryChange = viewModel::onQueryTextChanged,
            onSearch = {
                history.add(query)
                isSearching = false
            },
            active = isSearching,
            onActiveChange = { isSearching = it },
            modifier = Modifier.fillMaxWidth(),
            placeholder = { Text("Search Killer") },
            leadingIcon = {
                Icon(imageVector = Icons.Rounded.Search, contentDescription = null)
            },
            trailingIcon = {
                if (isSearching) {
                    Icon(
                        modifier = Modifier.clickable {
                            if (query.isNotEmpty()) query = "" else {
                                isSearching = false
                            }
                        },
                        imageVector = Icons.Default.Close, contentDescription = "Close"
                    )
                }
            }
        ) {
            history.forEach {
                Row(modifier = Modifier.padding(16.dp)) {
                    Icon(
                        modifier = Modifier.padding(end = 10.dp),
                        imageVector = Icons.Default.History, contentDescription = null
                    )
                    Text(it)
                }
            }
        }
        if (killers.isEmpty()) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Text("No Data Found")
            }
        }
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            items(killers) { item ->
                Card(
                    modifier = Modifier
                        .padding(vertical = 8.dp)
                        .clickable {
                            val killerId = item.id
                            navController.navigate("detail/$killerId")
                        },
                    elevation = CardDefaults.cardElevation(8.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(8.dp),
                        verticalArrangement = Arrangement.spacedBy(8.dp)
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp),
                            contentAlignment = Alignment.Center
                        ) {
                            Image(
                                painter = painterResource(item.photo),
                                contentDescription = item.name,
                                contentScale = ContentScale.FillHeight
                            )
                        }
                        Text(text = item.name, fontSize = 24.sp, fontWeight = FontWeight.Bold)
                        Text(
                            text = item.description,
                            textAlign = TextAlign.Justify,
                            maxLines = 4,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }
            }
        }

    }

}