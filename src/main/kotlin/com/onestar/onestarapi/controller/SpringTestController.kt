package com.onestar.onestarapi

import com.onestar.onestarapi.model.SpringbootTestData
import com.onestar.onestarapi.repository.ItemRepository
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.util.*
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class TestController(private val itemRepository: ItemRepository) {

    @GetMapping("/items")
    fun getAllItems(): List<SpringbootTestData> =
            itemRepository.findAll()

    @GetMapping("/items/{id}")
    fun getAllItemsById(@PathVariable(value = "id") itemId: Long): ResponseEntity<SpringbootTestData> {
        return itemRepository.findById(itemId).map { article ->
            ResponseEntity.ok(article)
        }.orElse(ResponseEntity.notFound().build())
    }

/*
    @PostMapping("/items")
    fun createNewArticle(@Valid @RequestBody article: Item): Item =
            itemRepository.save(article)



    @PutMapping("/items/{id}")
    fun updateArticleById(@PathVariable(value = "id") articleId: Long,
                          @Valid @RequestBody newArticle: Item): ResponseEntity<Item> {

        return itemRepository.findById(articleId).map { existingArticle ->
            val updatedArticle: Item = existingArticle
                    .copy(title = newArticle.title, content = newArticle.content)
            ResponseEntity.ok().body(itemRepository.save(updatedArticle))
        }.orElse(ResponseEntity.notFound().build())

    }

    @DeleteMapping("/items/{id}")
    fun deleteArticleById(@PathVariable(value = "id") articleId: Long): ResponseEntity<Void> {

        return itemRepository.findById(articleId).map { article  ->
            itemRepository.delete(article)
            ResponseEntity<Void>(HttpStatus.OK)
        }.orElse(ResponseEntity.notFound().build())

    }
    */
}