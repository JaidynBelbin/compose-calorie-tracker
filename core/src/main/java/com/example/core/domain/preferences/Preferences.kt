package com.example.core.domain.preferences

import com.example.core.domain.models.Gender

interface Preferences {

    fun saveGender(gender: Gender)

}