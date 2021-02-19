package com.example.rickandmorty.di

import android.content.Context
import com.example.rickandmorty.domain.AuthRepository

/**
 * Singleton for "DI" in our example app
 */
object GlobalDI {

//    private val vacancyListRouterSourcesMap = mutableMapOf<String, VacancyListRouterSource>()

    private lateinit var applicationContext: Context


    fun initWithContext(applicationContext: Context) {
        this.applicationContext = applicationContext
    }

    fun getAuthRepository(): AuthRepository {
        return AuthRepository(applicationContext)
    }

//    fun putVacancyListRouterSource(vacancyListType: String, routerSource: VacancyListRouterSource) {
//        vacancyListRouterSourcesMap[vacancyListType] = routerSource
//    }
//
//    fun fetchVacancyListRouterSource(vacancyListType: String): VacancyListRouterSource? {
//        return vacancyListRouterSourcesMap[vacancyListType]
//    }
//
//    fun removeVacancyListRouterSource(vacancyListType: String) {
//        vacancyListRouterSourcesMap.remove(vacancyListType)
//    }

}