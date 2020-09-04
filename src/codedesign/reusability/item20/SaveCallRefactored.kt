package codedesign.reusability.item20

fun saveCallResultRefactored(response: SourceResponse) {
    val entities = response.sources.map(::sourceToEntity)
    insertSourcesIntoDb(entities)
}

fun sourceToEntity(source: Source) = Entity()
    .apply {// use at least apply if you can't avoid JavaBean pattern
        id = source.id
        category = source.category
        country = source.country
        description = source.description
    }

fun main() {
    val response = SourceResponse(listOf(Source(id = "123", category = "group1", country = "CZ", description = "N/A")))
    saveCallResultRefactored(response)
}
