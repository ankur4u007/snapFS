# SnapFs

This is yet another simple file system in a sea of [open source filesystems](https://en.wikipedia.org/wiki/List_of_file_systems) 
but is optimized for local resilient disk storage with commodity hardware.  
The main aim is to assist the [snapIt application](https://github.com/ankur4u007/snapIt) that enables users to manage and search their images better!

Inspired by [facebook haystack paper](https://www.usenix.org/legacy/event/osdi10/tech/full_papers/Beaver.pdf). 
Note: There has been few opinionated modification to the haystack architecture which would make it suitable for local disk storage with commodity hardware.
 
#### Features:
- Helps store stuff across multiple commodity hard drives with varied levels of replication.
- Can work with existing hard drives, no need for formatting.
- Stores data in compressed formats to save space.
- supports creating, reading, deleting, updating of files
- written in kotlin and can be used as an api library inside any jvm based project. once project matures, an http api can be offered.


#### Structure
```
directory
 |
 |-- index file (binary file; protobuf format)
 |     |-- disk id
 |     |-- tracks free space in the directory
 |     |-- files map containing id as key and attributes as value.
 |                                                           |-- file offset
 |                                                           |-- size in bytes
 |                                                           |-- deleted flag
 |                                                           |-- preview scale
 |                                                           |-- list of replicated disk ids
 |                                                           |-- compressed flag
 |
 |-- data file (binary file; protobuf format)
      |-- data (compressed)
      |-- metadata
            |-- creation date time
            |-- filename
```
