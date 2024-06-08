package com.example.core.data.preferences

import android.content.SharedPreferences
import com.example.core.domain.models.ActivityLevel
import com.example.core.domain.models.Gender
import com.example.core.domain.models.GoalType
import com.example.core.domain.models.UserInfo
import com.example.core.domain.preferences.Preferences

class DefaultPreferences(private val sharedPrefs: SharedPreferences) : Preferences {
    override fun saveGender(gender: Gender) {
        sharedPrefs.edit().putString(Preferences.GENDER_KEY, gender.name).apply()
    }

    override fun saveAge(age: Int) {
        sharedPrefs.edit().putInt(Preferences.AGE_KEY, age).apply()
    }

    override fun saveWeight(weight: Float) {
        sharedPrefs.edit().putFloat(Preferences.WEIGHT_KEY, weight).apply()
    }

    override fun saveHeight(height: Int) {
        sharedPrefs.edit().putInt(Preferences.HEIGHT_KEY, height).apply()
    }

    override fun saveActivityLevel(activityLevel: ActivityLevel) {
        sharedPrefs.edit().putString(Preferences.ACTIVITY_LEVEL_KEY, activityLevel.name).apply()
    }

    override fun saveGoalType(goalType: GoalType) {
        sharedPrefs.edit().putString(Preferences.GOAL_TYPE_KEY, goalType.name).apply()
    }

    override fun saveCarbRatio(ratio: Float) {
        sharedPrefs.edit().putFloat(Preferences.CARB_RATIO_KEY, ratio).apply()
    }

    override fun saveProteinRatio(ratio: Float) {
        sharedPrefs.edit().putFloat(Preferences.PROTEIN_RATIO_KEY, ratio).apply()
    }

    override fun saveFatRatio(ratio: Float) {
        sharedPrefs.edit().putFloat(Preferences.FAT_RATIO_KEY, ratio).apply()
    }

    override fun loadUserInfo(): UserInfo {
        val gender = sharedPrefs.getString(Preferences.GENDER_KEY, "")
        val age = sharedPrefs.getInt(Preferences.AGE_KEY, -1)
        val height = sharedPrefs.getInt(Preferences.HEIGHT_KEY, -1)
        val weight = sharedPrefs.getFloat(Preferences.WEIGHT_KEY, -1f)
        val activityLevel = sharedPrefs.getString(Preferences.ACTIVITY_LEVEL_KEY, "")
        val goalType = sharedPrefs.getString(Preferences.GOAL_TYPE_KEY, "")
        val carbRatio = sharedPrefs.getFloat(Preferences.CARB_RATIO_KEY, -1f)
        val proteinRatio = sharedPrefs.getFloat(Preferences.PROTEIN_RATIO_KEY, -1f)
        val fatRatio = sharedPrefs.getFloat(Preferences.FAT_RATIO_KEY, -1f)

        return UserInfo(
            gender = Gender.fromString(gender ?: "male"),
            age = age,
            height = height,
            weight = weight,
            activityLevel = ActivityLevel.fromString(activityLevel ?: "medium"),
            goalType = GoalType.fromString(goalType ?: "keep_weight"),
            carbRatio = carbRatio,
            proteinRatio = proteinRatio,
            fatRatio = fatRatio
        )
    }
}