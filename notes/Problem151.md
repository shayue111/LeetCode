# 151. 翻转字符串里的单词


来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/reverse-words-in-a-string

---

给定一个字符串，逐个翻转字符串中的每个单词。

```bash
示例 1：

输入: "the sky is blue"
输出: "blue is sky the"
示例 2：

输入: "  hello world!  "
输出: "world! hello"
解释: 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
示例 3：

输入: "a good   example"
输出: "example good a"
解释: 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 
```
说明：

无空格字符构成一个单词。
输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
 

进阶：

请选用 C 语言的用户尝试使用 O(1) 额外空间复杂度的原地解法。


## 解题思路

1. 将所有的字符串按照空格分割存放至数组
2. 如果分割出来的字符串为空格，则应该将其删除
3. 对于所有字符串逆序列输出，并且在相邻字符串打印时增加空格


## 用到的API

1. `.toBuffer`，将`Array`转化至`ArrayBuffer`；
2. `.filter({some Function OR Equality to get Boolean})`，过滤不符合条件的元素；
3. `.reverse`，倒序；
4. `.mkString({sep=something})`，将元素拼接为字符串；
