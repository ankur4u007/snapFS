package ank.snapfs.api.interfaces

import kotlinx.coroutines.flow.Flow

interface SnapDisk {

    suspend fun save(file: SnapFile)

    suspend fun read(id: String): SnapFile

    fun readAll(): Flow<SnapFile>;

    suspend fun delete(id: String)

    suspend fun update(id: String, file: SnapFile)
}
