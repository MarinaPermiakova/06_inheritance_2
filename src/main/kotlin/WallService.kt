object WallService {
    private var posts = emptyArray<Post>()
    var attachments: Array<Attachment> = emptyArray()


    fun add(post: Post): Post {
        post.id = if (posts.isNotEmpty())
            posts.last().id + 1
        else 1
        posts += post
        return posts.last()
    }

    fun update(post: Post): Boolean {
        var index = 0
        var res = true

        for (e in posts) {
            index = if (e.id == post.id) posts.indexOf(e)
            else -1
        }
        if (index == -1) res = false
        else {
            post.ownerId = posts[index].ownerId
            post.date = posts[index].date
            posts[index] = post
        }
        return res
    }

    fun addAttachment(attachment: Attachment): Attachment {
        attachments += attachment
        return attachments.last()
    }


}