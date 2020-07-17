package ank.snapfs.api.services

import ank.snapfs.api.config.SnapFileSystemConfig
import ank.snapfs.api.interfaces.SnapDisk
import ank.snapfs.api.interfaces.SnapFactory

private class SnapFactoryService: SnapFactory {
    val config: SnapFileSystemConfig = SnapFileSystemConfig()

    override fun getInstance(): SnapDisk {
        return SnapDiskService(config)
    }
}
