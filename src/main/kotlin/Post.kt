class Post(
        var id: Int,
        var owner_id: Int,
        val from_id: Int,
        val created_by: Int,
        var date: Int,
        val text: String,
        val reply_owner_id: Int,
        val reply_post_id: Int,
        val friends_only: Int = 1,
        val comments: Comments,
        val copyright: String,
        val likes: Likes,
        val reposts: Reposts,
        val views: Views,
        val post_type: String,
        val post_source: PostSource?,
        val geo: Geo?,
        val signer_id: Int,
        val copy_history: Array<Int>,
        val can_pin: Boolean,
        val can_delete: Boolean,
        val can_edit: Boolean,
        val is_pinned: Boolean,
        val marked_as_ads: Boolean,
        val is_favorite: Boolean,
        val postponed_id: Int
)

class PostSource (
        val type: String,
        val platform: String,
        val data: String,
        val url: String
)

class Geo(
        val type: String,
        val coordinates: String,
        val place: Place
)

class Place(
        val id: Int,
        val title: String,
        val latitude: Int,
        val longitude: Int,
        val created: Int,
        val icon: String,
        val checkins: Int,
        val updated: Int,
        val type: Int,
        val country: Int,
        val city: Int,
        val address: String
)

class Comments(
        val count: Int,
        val can_post: Boolean,
        val groups_can_post: Boolean,
        val can_close: Boolean,
        val can_open: Boolean
)

class Likes(
        val count: Int,
        val user_likes: Boolean,
        val can_like: Boolean,
        val can_publish: Boolean
)

class Reposts(
        val count: Int,
        val user_reposted: Boolean
)

class Views(
        val count: Int,
)