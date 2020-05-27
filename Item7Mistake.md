Great, thanks! :-)

Dne pá 24. 4. 2020 10:09 uživatel Marcin Moskala <marcinmoskala@gmail.com> napsal:
Hey Vit,

You are perfectly right, thank you. I added this correction and this is how it looks like right now:

val personResult = userText.readObject<Person>()
val age = when(personResult) {
    is Success -> personResult.value.age
    is Failure -> -1
}

Thanks,
Marcin Moskała

czw., 23 kwi 2020 o 23:11 Vít Kluganost <kluganost@gmail.com> napisał(a):
Hello Marcin,
 
I’m just reading your excellent book Effective Kotlin. Thanks a lot for the book 😊.
 
I’m just wondering whether the example provided for item 7 on page 68 is correct:
val person = userText.readObjectOrNull<Person>() // IMHO this should be readObject<Person>()
val age = when(person) {
is Success -> person.age // IMHO this should be person.result.age because person contains Success instance not Person instance
is Failure -> -1
}
 
Am I missing something important?
 
Thank you,
 
Vítek Kluganost
