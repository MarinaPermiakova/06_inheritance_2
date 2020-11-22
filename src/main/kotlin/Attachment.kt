interface Attachment {
    val type: String
}

class AttachmentImpl(override val type: String, private val audio: Audio?, private val video: Video?,
                     private val photo: Photo?, private val doc: Doc?, private val graffiti: Graffiti?) : Attachment {

    var attach: Attachment
        get() = TODO("Not yet implemented")
        set(value) {
            when (type) {
                "audio" -> audio as AudioAttachment
                "video" -> video as VideoAttachment
                "photo" -> photo as PhotoAttachment
                "doc" -> doc as DocAttachment
                "graffiti" -> graffiti as GraffitiAttachment
            }
        }
}

class AudioAttachment(val audio: Audio) : Attachment {
    override val type: String = "audio"
}

class VideoAttachment(val video: Video) : Attachment {
    override val type: String = "video"
}

class PhotoAttachment(val photo: Photo) : Attachment {
    override val type: String = "photo"
}

class DocAttachment(val doc: Doc) : Attachment {
    override val type: String = "doc"
}

class GraffitiAttachment(val graffiti: Graffiti) : Attachment {
    override val type: String = "graffiti"
}

class Audio(
        id: Int,
        albumId: Int,
        artist: String,
        date: Int,
        duration: Int,
        genreId: Int,
        lyricsId: Int,
        ownerId: Int,
        noSearch: Int, title: String,
        url: String
)

class Video(
        val id: Int,
        val ownerId: Int,
        val title: String,
        val description: String,
        val duration: Int,
        val image: Array<Int>,
        val firstFrame: Array<Int>,
        val date: Int,
        val addingDate: Int,
        val views: Int,
        val localViews: Int,
        val comments: Int,
        val player: String,
        val platform: String,
        val canAdd: Int,
        val isPrivate: Int,
        val accessKey: String,
        val processing: Int,
        val isFavorite: Boolean,
        val canComment: Int,
        val canEdit: Int,
        val canLike: Int,
        val canRepost: Int,
        val canSubscribe: Int,
        val canAddToFaves: Int,
        val canAttachLink: Int,
        val width: Int,
        val height: Int,
        val userId: Int,
        val converting: Int,
        val added: Int,
        val isSubscribed: Int,
        val repeat: Int,
        val type: String,
        val balance: Int,
        val liveStatus: String,
        val live: Int,
        val upcoming: Int,
        val spectators: Int,
        val likes: Likes,
        val reposts: Reposts
)


class Photo(
        val id: Int,
        val ownerId: Int,
        val photo130: String,
        val photo604: String
)

class Doc(
        val id: Int,
        val ownerId: Int,
        val size: Int,
        val ext: String,
        val url: String,
        val date: Int,
        val type: Int,
        val preview: Preview?
)

class Preview(
        val id: Int
)

class Graffiti(
        val id: Int,
        val ownerIid: Int,
        val photo130: String,
        val photo604: String
)




