interface Attachment {
    val type: String
}

open class AttachmentImpl(override val type: String, private val audio: Audio?, private val video: Video?,
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


class AudioAttachment : Attachment {
    override val type: String = "audio"
    val audio: Audio = TODO()

}

class VideoAttachment : Attachment {
    override val type: String = "video"
    val video: Video = TODO()
}

class PhotoAttachment : Attachment {
    override val type: String = "photo"
    val photo: Photo = TODO()
}

class DocAttachment : Attachment {
    override val type: String = "doc"
    val doc: Doc = TODO()
}

class GraffitiAttachment : Attachment {
    override val type: String = "graffiti"
    val graffiti: Graffiti = TODO()
}

class Audio(
        id: Int,
        album_id: Int,
        artist: String,
        date: Int,
        duration: Int,
        genre_id: Int,
        lyrics_id: Int,
        owner_id: Int,
        no_search: Int, title: String,
        url: String
)

class Video(
        val id: Int,
        val owner_id: Int,
        val title: String,
        val description: String,
        val duration: Int,
        val image: Array<Int>,
        val first_frame: Array<Int>,
        val date: Int,
        val adding_date: Int,
        val views: Int,
        val local_views: Int,
        val comments: Int,
        val player: String,
        val platform: String,
        val can_add: Int,
        val is_private: Int,
        val access_key: String,
        val processing: Int,
        val is_favorite: Boolean,
        val can_comment: Int,
        val can_edit: Int,
        val can_like: Int,
        val can_repost: Int,
        val can_subscribe: Int,
        val can_add_to_faves: Int,
        val can_attach_link: Int,
        val width: Int,
        val height: Int,
        val user_id: Int,
        val converting: Int,
        val added: Int,
        val is_subscribed: Int,
        val repeat: Int,
        val type: String,
        val balance: Int,
        val live_status: String,
        val live: Int,
        val upcoming: Int,
        val spectators: Int,
        val likes: Likes,
        val reposts: Reposts
)


class Photo(
        val id: Int,
        val owner_id: Int,
        val photo_130: String,
        val photo_604: String
)

class Doc(
        val id: Int,
        val owner_id: Int,
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
        val owner_id: Int,
        val photo_130: String,
        val photo_604: String
)




