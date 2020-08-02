import io.reactivex.rxjava3.core.Observable

fun main() {
    Observable.just("hello world").subscribe {
        println(it)
    }
}