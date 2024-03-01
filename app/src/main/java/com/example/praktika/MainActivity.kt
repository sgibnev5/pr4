package com.example.praktika

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.praktika.databinding.ActivityMainBinding
import dto.Post

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val post = Post(
            id = 1,
            textView2 = "Нетология. Университет интернет-профессий будущего",
            textView = "Привет, это новая Нетология! Когда-то Нетология начиналась с интенсивов по онлайн-маркетингу. Затем появились курсы по дизайну, разработке, аналитике и управлению. Мы растём сами и помогаем расти студентам: от новичков до уверенных профессионалов. Но самое важное остаётся с нами: мы верим, что в каждом уже есть сила, которая заставляет хотеть больше, целиться выше, бежать быстрее. Наша миссия — помочь встать на путь роста и начать цепочку перемен → http://netolo.gy/fyb",
            textView4 = "20 февраля в 15:00",
            likedByMe = false
        )
        with(binding) {
            textView2.text = post.textView2
            textView4.text = post.textView4
            textView.text = post.textView
            if (post.likedByMe) {
                imageButton17?.setImageResource(R.drawable.heart_red)
            }
            textView5?.text = post.likes.toString()

            root.setOnClickListener {
                Log.d("stuff", "stuff")
            }

            imageView.setOnClickListener {
                Log.d("stuff", "avatar")
            }

            imageButton17?.setOnClickListener {
                Log.d("stuff", "like")
                post.likedByMe = !post.likedByMe
                imageButton17.setImageResource(
                    if (post.likedByMe) R.drawable.heart_red else R.drawable.heart_ser
                )
                if (post.likedByMe) post.likes++ else post.likes--
                textView5?.text = post.likes.toString()
            }
            with(binding) {
                textView2.text = post.textView2
                textView4.text = post.textView4
                textView.text = post.textView
                if (post.shareByMe) {
                    imageButton15?.setImageResource(R.drawable.ic_menu_share)
                }
                textView6?.text = post.share.toString()

                root.setOnClickListener {
                    Log.d("stuff", "stuff")
                }

                imageView.setOnClickListener {
                    Log.d("stuff", "avatar")
                }
                imageButton15?.setOnClickListener {
                    Log.d("stuff", "share")
                    post.shareByMe = !post.shareByMe
                    imageButton17.setImageResource(
                        if (post.shareByMe) R.drawable.ic_menu_share else R.drawable.ic_menu_share
                    )
                    if (post.shareByMe) post.share++ else post.share--
                    textView6?.text = post.share.toString()
                }
            }
        }
    }
}
