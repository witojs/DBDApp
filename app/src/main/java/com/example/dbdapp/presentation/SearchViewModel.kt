package com.example.dbdapp.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.dbdapp.DummyData
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.combine
import kotlinx.coroutines.flow.stateIn

class SearchViewModel : ViewModel() {
    private val _querySearch = MutableStateFlow("")
    val querySearch = _querySearch.asStateFlow()

    private val _items = MutableStateFlow(DummyData.killerList)
    val filteredItems = querySearch
        .combine(_items) { query, items ->
            if (query.isBlank()) items else items.filter {
                it.name.contains(
                    query,
                    ignoreCase = true
                )
            }
        }
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), _items.value)

    fun onQueryTextChanged(query: String) {
        _querySearch.value = query
    }

}