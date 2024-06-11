package com.example.core.domain.preferences

import com.example.core.domain.models.ActivityLevel
import com.example.core.domain.models.Gender
import com.example.core.domain.models.GoalType
import com.example.core.domain.models.UserInfo

interface Preferences {

    fun saveGender(gender: Gender)
    fun saveAge(age: Int)
    fun saveWeight(weight: Float)
    fun saveHeight(height: Int)
    fun saveActivityLevel(activityLevel: ActivityLevel)
    fun saveGoalType(goalType: GoalType)
    fun saveCarbRatio(ratio: Float)
    fun saveProteinRatio(ratio: Float)
    fun saveFatRatio(ratio: Float)


    fun loadUserInfo(): UserInfo

    companion object {
        const val GENDER_KEY = "gender"
        const val AGE_KEY = "age"
        const val WEIGHT_KEY = "weight"
        const val HEIGHT_KEY = "height"
        const val ACTIVITY_LEVEL_KEY = "activity_level"
        const val GOAL_TYPE_KEY = "goal_type"
        const val CARB_RATIO_KEY = "carb_ratio"
        const val PROTEIN_RATIO_KEY = "protein_ratio"
        const val FAT_RATIO_KEY = "fat_ratio"
    }
}