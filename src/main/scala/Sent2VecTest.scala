import java.util.Arrays;

import fasttext.{FastText, Vector}

object Sent2VecTest {
  def main(args: Array[String]): Unit = {

    var model: FastText = null

    try {
      /* First you will have to load your model */
      println("start loadModel")
      model = FastText.loadModel("./sent2vec_wiki.en.bin") // the path of the model
      println("finish loadModel")

      // Obtaining a word vector
      val wv: Vector = model.getWordVector("world")
      println(wv)

      // Obtaining word vectors
      import scala.collection.JavaConverters._
      val wvs: List[Vector] = model.getWordVectors(Arrays.asList("hello", "world", "!")).asScala.toList
      wvs.foreach(v => println(v))

//      def writeFile(filename: String, lines: Array[Float]): Unit = {
//        val file = new File(filename)
//        val bw = new BufferedWriter(new FileWriter(file))
//        for (line <- lines) {
//          bw.write(line.toString)
//          bw.newLine()
//        }
//        bw.close()
//      }
//
//      writeFile("scala_output", sv.toArray)

    } catch {
      case e: Exception =>
        System.out.println("Oops something went wrong. Exception: " + e.getMessage)

    }
  }
}
