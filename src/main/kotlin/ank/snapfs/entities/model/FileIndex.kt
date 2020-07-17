package ank.snapfs.entities.model

import ank.snapfs.entities.model.CompressionType
import java.util.*

data class FileIndex(
        val id: UUID,
        val format: String,
        val compressionType: CompressionType,
        val replicationType: ReplicationType,
        val fileSizeInBytes: Long,
        val directory: String
)