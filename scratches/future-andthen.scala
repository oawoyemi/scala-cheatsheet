import scala.concurrent._
import scala.concurrent.ExecutionContext.Implicits.global

// the for {} construct lets us execute multiple futures in parallel
// to serially execute futures in specific orders, we use `andThen`
// andThen ensures execution orders in what would otherwise be random

val whamBamThankYouMaam = future {
  Thread.sleep(500)
  Console.println("Wham!")
} andThen {
  case _ =>
    Thread.sleep(500)
    Console.println("Bam!")

} andThen {
  case _ =>
    Thread.sleep(500)
    Console.println("Thank you ma'am!")
}
