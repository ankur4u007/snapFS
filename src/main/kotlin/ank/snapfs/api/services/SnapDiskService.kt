package ank.snapfs.api.services

import ank.snapfs.api.config.SnapFileSystemConfig
import ank.snapfs.api.interfaces.SnapDisk
import ank.snapfs.api.interfaces.SnapFile
import kotlinx.coroutines.flow.Flow

internal class SnapDiskService(
        val config: SnapFileSystemConfig
): SnapDisk {
    override suspend fun save(file: SnapFile) {
        TODO("Not yet implemented")
    }

    override suspend fun read(id: String): SnapFile {
        TODO("Not yet implemented")
    }

    override fun readAll(): Flow<SnapFile> {
        TODO("Not yet implemented")
    }

    override suspend fun delete(id: String) {
        TODO("Not yet implemented")
    }

    override suspend fun update(id: String, file: SnapFile) {
        TODO("Not yet implemented")
    }

}