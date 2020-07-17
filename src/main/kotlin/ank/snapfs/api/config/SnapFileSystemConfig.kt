package ank.snapfs.api.config

import ank.snapfs.entities.model.CompressionType
import ank.snapfs.entities.model.ReplicationType

data class SnapFileSystemConfig(
        val replicationType: ReplicationType = ReplicationType.ONE,
        val compressionType: CompressionType = CompressionType.GZIP,
        val volumes: List<Volume> = listOf()
)

data class Volume (
        val path: String?,
        val blockSizeInMB: Int = 1024 * 50,
        val utilizationPercentage: Int = 99,
        val dataDirectory: String = ".snapFS",
)

