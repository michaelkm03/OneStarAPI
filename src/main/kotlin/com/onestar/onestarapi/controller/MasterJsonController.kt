package com.onestar.onestarapi

import com.onestar.onestarapi.model.MasterJson
import com.onestar.onestarapi.repository.ItemRepository
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api")
class MasterJsonController(private val itemRepository: ItemRepository) {

    @GetMapping("/items")
    fun getAllItems(): MutableList<MasterJson> =
            itemRepository.findAll()

    @GetMapping("/items/{id}")
    fun getAllItemsById(@PathVariable(value = "id") itemId: Long): ResponseEntity<MasterJson> {
        return itemRepository.findById(itemId).map { itemId ->
            ResponseEntity.ok(itemId)
        }.orElse(ResponseEntity.notFound().build())
    }
/*
    @GetMapping("/items/{overall}")
    fun getAllItemsByOverall(@PathVariable(value = "overall") overall: Long): ResponseEntity<MasterJson> {
        return itemRepository.findById(overall).map { article ->
            ResponseEntity.ok(article)
        }.orElse(ResponseEntity.notFound().build())
    }

    @PutMapping("/items/{id}")
    fun updateItemById(@PathVariable(value = "id") itemId: Long,
                          @Valid @RequestBody newItem: Api): ResponseEntity<Api> {

        return itemRepository.findById(itemId).map { existingArticle ->
            val updatedArticle: Api = existingArticle
                    .copy(id = newItem.id, content = newItem.content)
            ResponseEntity.ok().body(itemRepository.save(updatedArticle))
        }.orElse(ResponseEntity.notFound().build())

    }


    @PostMapping("/items")
    fun createNewArticle(@Valid @RequestBody article: Item): Item =
            itemRepository.save(article)


    @DeleteMapping("/items/{id}")
    fun deleteArticleById(@PathVariable(value = "id") articleId: Long): ResponseEntity<Void> {

        return itemRepository.findById(articleId).map { article  ->
            itemRepository.delete(article)
            ResponseEntity<Void>(HttpStatus.OK)
        }.orElse(ResponseEntity.notFound().build())

    }
    */
}