fun main() {
    val original = Post(
            id = 1,
            ownerId = 111,
            fromId = 21,
            createdBy = 22,
            date = 22,
            text = "Hello, world!",
            replyOwnerId = 33,
            replyPostId = 33,
            friendsOnly = 1,
            comments = Comments(
                    count = 9845,
                    canPost = false,
                    groupsCanPost = true,
                    canClose = true,
                    canOpen = true
            ),
            copyright = "Piotr",
            likes = Likes(
                    count = 2,
                    userLikes = true,
                    canLike = true,
                    canPublish = true
            ),
            reposts = Reposts(
                    count = 3,
                    userReposted = false
            ),
            views = Views(
                    count = 3458
            ),
            postType = "message",
            postSource = null,
            geo = null,
            signerId = 65,
            copyHistory = arrayOf(2, 4),
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            postponedId = 44
    )

    val originalUpdated = Post(
            id = 1,
            ownerId = 200,
            fromId = 21,
            createdBy = 22,
            date = 555,
            text = "Hello, cosmos!",
            replyOwnerId = 33,
            replyPostId = 33,
            friendsOnly = 1,
            comments = Comments(
                    count = 9845,
                    canPost = false,
                    groupsCanPost = true,
                    canClose = true,
                    canOpen = true
            ),
            copyright = "Vladimir",
            likes = Likes(
                    count = 2,
                    userLikes = true,
                    canLike = true,
                    canPublish = true
            ),
            reposts = Reposts(
                    count = 3,
                    userReposted = false
            ),
            views = Views(
                    count = 3458
            ),
            postType = "message",
            postSource = null,
            geo = null,
            signerId = 65,
            copyHistory = arrayOf(2, 4),
            canPin = true,
            canDelete = true,
            canEdit = true,
            isPinned = true,
            markedAsAds = true,
            isFavorite = true,
            postponedId = 44
    )

    val service = WallService
    service.add(original)
    println(original.ownerId.toString() + ", " + original.date.toString() + ", " + original.text)

    service.update(originalUpdated)
    println(originalUpdated.ownerId.toString() + ", " + originalUpdated.date.toString() + ", " + originalUpdated.text)


    val audio = Audio(
            id = 5,
            albumId = 7,
            artist = "Vasja",
            date = 88,
            duration = 44,
            genreId = 4,
            lyricsId = 2,
            ownerId = 12,
            noSearch = 1,
            title = "song",
            url = "htp"
    )

    val video = Video(
            id = 23,
            ownerId = 55,
            title = "title",
            description = "description",
            duration = 100,
            image = arrayOf(1, 2, 3),
            firstFrame = arrayOf(4, 5, 6),
            date = 23,
            addingDate = 44,
            views = 100,
            localViews = 20,
            comments = 3,
            player = "player",
            platform = "platform",
            canAdd = 1,
            isPrivate = 1,
            accessKey = "access",
            processing = 2,
            isFavorite = true,
            canComment = 0,
            canEdit = 1,
            canLike = 1,
            canRepost = 1,
            canSubscribe = 1,
            canAddToFaves = 1,
            canAttachLink = 1,
            width = 23,
            height = 55,
            userId = 54,
            converting = 1,
            added = 1,
            isSubscribed = 1,
            repeat = 1,
            type = "type",
            balance = 1,
            liveStatus = "live",
            live = 1,
            upcoming = 1,
            spectators = 1,
            likes = Likes(2, userLikes = true, canLike = true, true),
            reposts = Reposts(2, true)

    )

    val attachmentAudio = AttachmentImpl("audio", audio, null, null, null, null)
    service.addAttachment(attachmentAudio)

    val attachmentVideo = AttachmentImpl("video", null, video, null, null, null)
    service.addAttachment(attachmentVideo)
}


