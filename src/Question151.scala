object Question151 {
    def main(args: Array[String]): Unit = {
        println(reverseWords("the sky is blue"))
        println(reverseWords(" hello world!"))
        println(reverseWords("a good  example"))
    }

    def reverseWords(s: String): String = {
        val arr = s.split(" ").toBuffer
        arr.filter(_ != "").reverse.mkString(" ")
    }
}
