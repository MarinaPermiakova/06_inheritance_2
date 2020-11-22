import WallService.update
import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {

    @Test
    fun add() {
        val post = Post(
                id = 3,
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
        val result = post.id
        assertEquals(3, result)
    }

    @Test
    fun updateTrue() {
        val post = Post(
                id = 2,
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

        val post2 = Post(
                id = 2,
                ownerId = 112,
                fromId = 25,
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
        service.add(post)
        val result = update(post2)
        assertEquals(true, result)
    }

    @Test
    fun updateFalse() {
        val post = Post(
                id = 4,
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

        val post2 = Post(
                id = 10,
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
        service.add(post)
        val result = update(post2)

        assertEquals(false, result)
    }


}