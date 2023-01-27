import java.util.{HashMap => JavaHashMap}
import collection.mutable.{HashMap => ScalaHashMap}

package hash{
  package object hash {
    def convertJavaToScala(fromJava: JavaHashMap[String, Int], toScala: ScalaHashMap[String, Int]): Unit = {
      import collection.JavaConverters._
      for ((k, v) <- fromJava.asScala) {
        toScala(k) = v
      }
    }
  }
}
