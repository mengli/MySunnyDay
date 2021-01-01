package com.limeng.mysunnyday.utils

interface DomainMapper<T, DomainModel> {

  fun mapToDomainModel(model: T): DomainModel
}