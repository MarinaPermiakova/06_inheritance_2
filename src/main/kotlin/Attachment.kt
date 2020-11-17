interface Attachment {
    val type: String
    var attach: Attachment
}

open class AttachmentImpl(override val type: String, private val audio: Audio?, private val video: Video?,
                          private val photo: Photo?, private val doc: Doc?, private val graffiti: Graffiti?) : Attachment {
    override var attach: Attachment
        get() = TODO("Not yet implemented")
        set(v) {
            when (type) {
                "audio" -> audio as Attachment
                "video" -> video as Attachment
                "photo" -> photo as Attachment
                "doc" -> doc as Attachment
                "graffiti" -> graffiti as Attachment

            }
        }
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




