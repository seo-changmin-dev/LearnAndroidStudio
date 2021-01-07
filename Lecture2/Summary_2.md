# 강의에서 배운 점
## 1. EditText 사용법
Text 필드의 PlainText를 선택하면 EditText창이 나온다.   

'아이디를 입력하세요' 창으로 자주 볼 수 있다.   

et_Name으로 id를 지정하면 좋다.   

et_Name.text.toString()으로 파싱해서 강의에서는 사용했다.   

et_Name.text도 가능하고, et_Name.getText()도 가능하다.   


## 2. Button 사용법
btn_Name으로 id를 지정하면 좋다.   

btn_Name.setOnClickListener {} 로 사용했다. 중괄호(Curly Bracket)을 사용한다. '{','}'   

EventListener로 대부분 사용되지 않을까 싶다.   

중괄호 안에는 버튼이 클릭되었을때의 action을 기록한다.   


## 3. 중괄호 안 코드
```
btn_getText.setOnClickListener {
            var resultText = et_id.getText().toString()
            tv_result.setText(resultText)
        }
```
tv_result.setText(resultText)도 가능하고, tv_result.test = resultText도 가능하다.   

## Exercise로 뭘 구현해 볼까?
1. 코틀린 언어 습득하기
- [Summary_1](https://github.com/seo-changmin-dev/LearnAndroidStudio/blob/main/Lecture1/Summary_1.md)에서 앞서 언급했듯이, 이 [링크](https://www.youtube.com/watch?v=IDVnZPjRCYg&t=3367s) 혹은 다른 방법으로 코틀린에 익숙해져야 겠다.
2. 코틀린으로 EditText에 입력한 문자열로 시작하는 shortest Palindrome을 textView로 return하는 어플을 제작해야 겠다.
