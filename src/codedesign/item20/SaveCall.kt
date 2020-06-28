package codedesign.item20

data class Entity(var id: String = "", var category: String = "", var country: String = "", var description: String = "")
data class Source(var id: String = "", var category: String = "", var country: String = "", var description: String = "")
data class SourceResponse(val sources: List<Source>)

fun saveCallResult(item: SourceResponse) {
    val entities = ArrayList<Entity>()
    item.sources.forEach { // useless forEach
        val entity = Entity() // Java Bean pattern - obsolete in Kotlin
        entity.id = it.id
        entity.category = it.category
        entity.country = it.country
        entity.description = it.description
        entities.add(entity)
    }
    insertSourcesIntoDb(entities)
}

fun insertSourcesIntoDb(entityList: List<Entity>) {
    print("Saving entities = $entityList")
}

fun main() {
    val response = SourceResponse(listOf(Source(id = "123", category = "group1", country = "CZ", description = "N/A")))
    saveCallResult(response)
}
