package dto

data class Post(
    val id: Long,
    val textView2: String,
    val textView: String,
    val textView4: String,
    var likes: Int = 0,
    var likedByMe: Boolean = false,
    var share: Int=0,
    var shareByMe: Boolean = false
)
