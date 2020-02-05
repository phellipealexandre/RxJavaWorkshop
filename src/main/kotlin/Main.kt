import io.reactivex.Observable

fun main() {
    Observable.just("hello world").subscribe {
        println(it)
    }
}