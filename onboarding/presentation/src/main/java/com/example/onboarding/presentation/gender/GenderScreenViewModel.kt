package com.example.onboarding.presentation.gender

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.core.domain.models.Gender
import com.example.core.domain.preferences.Preferences
import com.example.core.navigation.Route
import com.example.core.util.UiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GenderScreenViewModel @Inject constructor(private val preferences: Preferences) :
    ViewModel() {

    var selectedGender by mutableStateOf<Gender>(Gender.Male)
        private set

    private val _uiEvent = Channel<UiEvent>()
    val uiEvent = _uiEvent.receiveAsFlow()

    fun onGenderSelected(gender: Gender) {
        selectedGender = gender
    }

    fun onNextClick() {

        // This is like "Task" in SwiftUI. Async code must be called from a CoroutineScope,
        // in this case, one that is scoped to this ViewModel.
        viewModelScope.launch {
            preferences.saveGender(selectedGender)
            _uiEvent.send(UiEvent.Navigate(Route.AGE))
        }
    }
}