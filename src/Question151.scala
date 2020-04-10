object Question151 {
    def main(args: Array[String]): Unit = {
        println(reverseWords("the sky is blue"))
        println(reverseWords(" hello world!"))
        println(reverseWords("a good  example"))
    }

    def reverseWords(s: String): String = {
        //　以空格切分字符串并存储至ArrayBuffer中
        val arr = s.split(" ").toBuffer
        // 丢弃为""的字符串并且逆序，将所有元素以" "连接到一起
        arr.filter(_ != "").reverse.mkString(" ")
    }
}
