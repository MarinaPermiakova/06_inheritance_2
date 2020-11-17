fun main() {
    val original = Post(
            id = 1,
            owner_id = 111,
            from_id = 21,
            created_by = 22,
            date = 22,
            text = "Hello, world!",
            reply_owner_id = 33,
            reply_post_id = 33,
            friends_only = 1,
            comments = Comments(
                    count = 9845,
                    can_post = false,
                    groups_can_post = true,
                    can_close = true,
                    can_open = true
            ),
            copyright = "Piotr",
            likes = Likes(
                    count = 2,
                    user_likes = true,
                    can_like = true,
                    can_publish = true
            ),
            reposts = Reposts(
                    count = 3,
                    user_reposted = false
            ),
            views = Views(
                    count = 3458
            ),
            post_type = "message",
            post_source = null,
            geo = null,
            signer_id = 65,
            copy_history = arrayOf(2, 4),
            can_pin = true,
            can_delete = true,
            can_edit = true,
            is_pinned = true,
            marked_as_ads = true,
            is_favorite = true,
            postponed_id = 44
    )

    val originalUpdated = Post(
            id = 1,
            owner_id = 200,
            from_id = 21,
            created_by = 22,
            date = 555,
            text = "Hello, cosmos!",
            reply_owner_id = 33,
            reply_post_id = 33,
            friends_only = 1,
            comments = Comments(
                    count = 9845,
                    can_post = false,
                    groups_can_post = true,
                    can_close = true,
                    can_open = true
            ),
            copyright = "Vladimir",
            likes = Likes(
                    count = 2,
                    user_likes = true,
                    can_like = true,
                    can_publish = true
            ),
            reposts = Reposts(
                    count = 3,
                    user_reposted = false
            ),
            views = Views(
                    count = 3458
            ),
            post_type = "message",
            post_source = null,
            geo = null,
            signer_id = 65,
            copy_history = arrayOf(2, 4),
            can_pin = true,
            can_delete = true,
            can_edit = true,
            is_pinned = true,
            marked_as_ads = true,
            is_favorite = true,
            postponed_id = 44
    )

    val service = WallService
    service.add(original)
    println(original.owner_id.toString() + ", " + original.date.toString() + ", " + original.text)

    service.update(originalUpdated)
    println(originalUpdated.owner_id.toString() + ", " + originalUpdated.date.toString() + ", " + originalUpdated.text)


    val audio = Audio(
            id = 5,
            album_id = 7,
            artist = "Vasja",
            date = 88,
            duration = 44,
            genre_id = 4,
            lyrics_id = 2,
            owner_id = 12,
            no_search = 1,
            title = "song",
            url = "htpp"
    )

    val video = Video(
            id = 23,
            owner_id = 55,
            title = "title",
            description = "description",
            duration = 100,
            image = arrayOf(1, 2, 3),
            first_frame = arrayOf(4, 5, 6),
            date = 23,
            adding_date = 44,
            views = 100,
            local_views = 20,
            comments = 3,
            player = "player",
            platform = "platform",
            can_add = 1,
            is_private = 1,
            access_key = "access",
            processing = 2,
            is_favorite = true,
            can_comment = 0,
            can_edit = 1,
            can_like = 1,
            can_repost = 1,
            can_subscribe = 1,
            can_add_to_faves = 1,
            can_attach_link = 1,
            width = 23,
            height = 55,
            user_id = 54,
            converting = 1,
            added = 1,
            is_subscribed = 1,
            repeat = 1,
            type = "type",
            balance = 1,
            live_status = "live",
            live = 1,
            upcoming = 1,
            spectators = 1,
            likes = Likes(2, user_likes = true, can_like = true, true),
            reposts = Reposts(2, true)

    )

    val attachmentAudio = AttachmentImpl("audio", audio, null, null, null, null)
    service.addAttachment(attachmentAudio)

    val attachmentVideo = AttachmentImpl("video", null, video, null, null, null)
    service.addAttachment(attachmentVideo)
}


