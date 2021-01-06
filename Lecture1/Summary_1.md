## AVD(Android Virtual Device) 설정 방법 - (https://recipes4dev.tistory.com/145)
- 실제 디바이스의 크기, 픽셀을 디테일하게 설정할 수 있다.
- Samsung S7 Edge가 RAM이 4GB이여서 4096MB 설정 했지만 자동으로 1536MB로 바뀐다. 이유는 모르겠다.
<br>

## 디자인 탭에서 Blueprint(청사진) 가리는 방법
- 좌상단의 '블루스택' 같이 생긴 아이콘 클릭해서 설정
- 청사진은 각 Element에 Contraint를 걸어줄 때 자주 쓰이는 듯 (https://potamong.tistory.com/29)
<br>

## Kotlin Extension 기능으로 findViewById 생략하기 - (https://duckssi.tistory.com/34)
- 텍스트뷰에서 element에 id를 지정한 뒤, Activity에서 사용하면 "Unresolved reference"라는 에러가 발생한다.
- 실제로 내가 겪은 에러는 다음과 같다. "Unresovled reference: tv_title"
- 아마 이 id가 실제로 어디에 존재하는지 찾지 못해서(변수에 xml id를 연동함을 뜻한다.) 발생하는 에러 같은데, Kotlin Extension 기능으로 해결 가능하다.

### <해결 방법>
build.gradle(Module)에 apply plugin: 'kotlin-android-extensions' 문장을 추가한다.
혹은 이미 써져있는 포맷에 맞게 센스있게 플러그인을 추가한다.

### <예시>
plugins {
    id 'com.android.application'
    id 'kotlin-android'
    id 'kotlin-android-extensions'
}

이후 빨간 문장(에러의 대상) 위에서 'Alt + Enter' 혹은 빨간 전구 아이콘을 클릭해서 해결 가능하다.
이렇게 하면 "import kotlinx.android.synthetic.main.activity_main.*" 코드가 추가된다.
<br>

## 기타 내용들
- TextView 중 title이 되는 element의 id를 tv_title로 지정하더라. 정식 컨벤션을 익히기에는 무리고, 이런 사소한것들 기억해두자.
- 실습은 아직 textview 밖에 못배웠으니까, "미안하다. 이거 보여주려고 어그로 끌었다." 포맷을 화면에 출력하는 것으로 해볼까 싶다.
- 마크다운 문법 익혀두면 좋을 것 같다. 아마 깃허브 계속 올리면서 실력이 늘겠지?
- kotlin 기초 문법을 익혀야 할 것 같다. (https://www.youtube.com/watch?v=IDVnZPjRCYg&t=3367s)
